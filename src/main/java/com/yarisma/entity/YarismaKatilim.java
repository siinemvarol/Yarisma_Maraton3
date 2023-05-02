package com.yarisma.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "tbl_yarismakatilim")
public class YarismaKatilim {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "yarisma_id", referencedColumnName = "id")
    private Yarisma yarisma;

    @ManyToOne
    @JoinColumn(name = "katilimci_id", referencedColumnName = "id")
    private Kullanici katilimci;

    private LocalDate katilimTarihi;

    public YarismaKatilim() {
    }

    public YarismaKatilim(Long id, Yarisma yarisma, Kullanici katilimci, LocalDate katilimTarihi) {
        this.id = id;
        this.yarisma = yarisma;
        this.katilimci = katilimci;
        this.katilimTarihi = katilimTarihi;
    }

    public YarismaKatilim(Yarisma yarisma, Kullanici katilimci, LocalDate katilimTarihi) {
        this.yarisma = yarisma;
        this.katilimci = katilimci;
        this.katilimTarihi = katilimTarihi;
    }

    public YarismaKatilim(Yarisma yarisma) {
        this.yarisma = yarisma;
    }

    @Override
    public String toString() {
        return "YarismaKatilim{" + "id=" + id + ", yarisma=" + yarisma + ", katilimci=" + katilimci + ", katilimTarihi=" + katilimTarihi + '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Yarisma getYarisma() {
        return yarisma;
    }

    public void setYarisma(Yarisma yarisma) {
        this.yarisma = yarisma;
    }

    public Kullanici getKatilimci() {
        return katilimci;
    }

    public void setKatilimci(Kullanici katilimci) {
        this.katilimci = katilimci;
    }

    public LocalDate getKatilimTarihi() {
        return katilimTarihi;
    }

    public void setKatilimTarihi(LocalDate katilimTarihi) {
        this.katilimTarihi = katilimTarihi;
    }
}


