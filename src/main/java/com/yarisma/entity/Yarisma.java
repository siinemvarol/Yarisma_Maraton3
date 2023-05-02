package com.yarisma.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tbl_yarisma")
public class Yarisma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "olusturan_kullanici_id", referencedColumnName = "id")
    private Kullanici olusturanKullanici;

    @OneToMany(mappedBy = "yarisma")
    private List<YarismaKatilim> yarismaKatilimlari;

    private LocalDate baslangicTarihi;
    private LocalDate bitisTarihi;

    private String odul;

    private int maxKatilimciSayisi;


    public Yarisma() {
    }

    public Yarisma(Long id, Kullanici olusturanKullanici, List<YarismaKatilim> yarismaKatilimlari, LocalDate baslangicTarihi, LocalDate bitisTarihi, String odul, int maxKatilimciSayisi) {
        this.id = id;
        this.olusturanKullanici = olusturanKullanici;
        this.yarismaKatilimlari = yarismaKatilimlari;
        this.baslangicTarihi = baslangicTarihi;
        this.bitisTarihi = bitisTarihi;
        this.odul = odul;
        this.maxKatilimciSayisi = maxKatilimciSayisi;
    }

    public Yarisma(Kullanici olusturanKullanici, List<YarismaKatilim> yarismaKatilimlari, LocalDate baslangicTarihi, LocalDate bitisTarihi, String odul, int maxKatilimciSayisi) {
        this.olusturanKullanici = olusturanKullanici;
        this.yarismaKatilimlari = yarismaKatilimlari;
        this.baslangicTarihi = baslangicTarihi;
        this.bitisTarihi = bitisTarihi;
        this.odul = odul;
        this.maxKatilimciSayisi = maxKatilimciSayisi;
    }

    public Yarisma(Kullanici olusturanKullanici, LocalDate baslangicTarihi, LocalDate bitisTarihi, String odul, int maxKatilimciSayisi) {
        this.olusturanKullanici = olusturanKullanici;
        this.baslangicTarihi = baslangicTarihi;
        this.bitisTarihi = bitisTarihi;
        this.odul = odul;
        this.maxKatilimciSayisi = maxKatilimciSayisi;
    }

    @Override
    public String toString() {
        return "Yarisma{" +
                "id=" + id +
                ", olusturanKullanici=" + olusturanKullanici +
                ", yarismaKatilimlari=" + yarismaKatilimlari +
                ", baslangicTarihi=" + baslangicTarihi +
                ", bitisTarihi=" + bitisTarihi +
                ", odul='" + odul + '\'' +
                ", maxKatilimciSayisi=" + maxKatilimciSayisi +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Kullanici getOlusturanKullanici() {
        return olusturanKullanici;
    }

    public void setOlusturanKullanici(Kullanici olusturanKullanici) {
        this.olusturanKullanici = olusturanKullanici;
    }

    public List<YarismaKatilim> getYarismaKatilimlari() {
        return yarismaKatilimlari;
    }

    public void setYarismaKatilimlari(List<YarismaKatilim> yarismaKatilimlari) {
        this.yarismaKatilimlari = yarismaKatilimlari;
    }

    public LocalDate getBaslangicTarihi() {
        return baslangicTarihi;
    }

    public void setBaslangicTarihi(LocalDate baslangicTarihi) {
        this.baslangicTarihi = baslangicTarihi;
    }

    public LocalDate getBitisTarihi() {
        return bitisTarihi;
    }

    public void setBitisTarihi(LocalDate bitisTarihi) {
        this.bitisTarihi = bitisTarihi;
    }

    public String getOdul() {
        return odul;
    }

    public void setOdul(String odul) {
        this.odul = odul;
    }

    public int getMaxKatilimciSayisi() {
        return maxKatilimciSayisi;
    }

    public void setMaxKatilimciSayisi(int maxKatilimciSayisi) {
        this.maxKatilimciSayisi = maxKatilimciSayisi;
    }
}
