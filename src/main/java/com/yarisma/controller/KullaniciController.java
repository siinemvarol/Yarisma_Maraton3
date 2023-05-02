package com.yarisma.controller;

import com.yarisma.entity.Kullanici;
import com.yarisma.entity.YarismaKatilim;
import com.yarisma.service.KullaniciService;

public class KullaniciController {

    private KullaniciService kullaniciService;

    public KullaniciController() {
        this.kullaniciService = new KullaniciService();
    }

    public Kullanici kullaniciOlustur(String ad, String soyad, String email, String adres) {
        Kullanici kullanici = new Kullanici(ad, soyad, email, adres);
        kullaniciService.save(kullanici);
        return kullanici;
    }

    public void katilimGosterilenYarismalariListele(Long kullaniciId) {
        Kullanici kullanici = kullaniciService.katilimGosterilenYarismalariListele(kullaniciId).get(0);
        for (YarismaKatilim katilim : kullanici.getKatildigiYarismalar()) {
            System.out.println("Yarışma ID: " + katilim.getYarisma().getId()
                    + " - Katılım Tarihi: " + katilim.getKatilimTarihi()
                    + " - Kullanıcı ID: " + katilim.getKatilimci().getId());
        }
    }


    public KullaniciService getKullaniciService() {
        return kullaniciService;
    }

    public void setKullaniciService(KullaniciService kullaniciService) {
        this.kullaniciService = kullaniciService;
    }

}
