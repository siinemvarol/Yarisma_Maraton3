package com.yarisma.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tbl_kullanici")
public class Kullanici {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ad;
    private String soyad;
    private String email;
    private String adres;

    @OneToMany(mappedBy = "katilimci")
    private List<YarismaKatilim> katildigiYarismalar = new ArrayList<>();

    @OneToMany(mappedBy = "olusturanKullanici")
    private List<Yarisma> olusturduguYarismalar = new ArrayList<>();

    public Kullanici() {
    }

    public Kullanici(Long id, String ad, String soyad, String email, String adres,
                     List<YarismaKatilim> katildigiYarismalar, List<Yarisma> olusturduguYarismalar) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.email = email;
        this.adres = adres;
        this.katildigiYarismalar = katildigiYarismalar;
        this.olusturduguYarismalar = olusturduguYarismalar;

    }

    public Kullanici(String ad, String soyad, String email, String adres,
                     List<YarismaKatilim> katildigiYarismalar, List<Yarisma> olusturduguYarismalar) {
        this.ad = ad;
        this.soyad = soyad;
        this.email = email;
        this.adres = adres;
        this.katildigiYarismalar = katildigiYarismalar;
        this.olusturduguYarismalar = olusturduguYarismalar;
    }

    public Kullanici(String ad, String soyad, String email, String adres) {
        this.ad = ad;
        this.soyad = soyad;
        this.email = email;
        this.adres = adres;
    }

    @Override
    public String toString() {
        return "Kullanici{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", email='" + email + '\'' +
                ", adres='" + adres + '\'' +
                ", katildigiYarismalar=" + katildigiYarismalar +
                ", olusturduguYarismalar=" + olusturduguYarismalar +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public List<YarismaKatilim> getKatildigiYarismalar() {
        return katildigiYarismalar;
    }

    public void setKatildigiYarismalar(List<YarismaKatilim> katildigiYarismalar) {
        this.katildigiYarismalar = katildigiYarismalar;
    }

    public List<Yarisma> getOlusturduguYarismalar() {
        return olusturduguYarismalar;
    }

    public void setOlusturduguYarismalar(List<Yarisma> olusturduguYarismalar) {
        this.olusturduguYarismalar = olusturduguYarismalar;
    }
}
