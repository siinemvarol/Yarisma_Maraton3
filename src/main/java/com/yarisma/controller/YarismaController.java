package com.yarisma.controller;

import com.yarisma.entity.Kullanici;
import com.yarisma.entity.Yarisma;
import com.yarisma.service.YarismaService;

import java.time.LocalDate;

public class YarismaController {

    private YarismaService yarismaService;

    public YarismaController() {
        this.yarismaService = new YarismaService();
    }

    public Yarisma yarismaOlustur(Kullanici kullanici, LocalDate baslangicTarihi, LocalDate bitisTarihi, String odul, int maxKatilimciSayisi) {
        Yarisma yarisma = new Yarisma(kullanici, baslangicTarihi, bitisTarihi, odul, maxKatilimciSayisi);
        yarismaService.save(yarisma);
        kullanici.getOlusturduguYarismalar().add(yarisma);
        return yarisma;
    }

    public void kullanicininActigiYarismalariListele(String kullaniciAd) {
        yarismaService.kullanicininActigiYarismalariListele(kullaniciAd).forEach(yarisma ->
                System.out.println("Yarışma ID: " + yarisma.getId()
                        + " - Oluşturan: " + yarisma.getOlusturanKullanici().getAd()
                        + " - Yarışmayı Oluşturanın ID: " + yarisma.getOlusturanKullanici().getId()));
    }

}
