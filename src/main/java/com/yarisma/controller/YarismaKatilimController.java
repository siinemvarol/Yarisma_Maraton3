package com.yarisma.controller;

import com.yarisma.entity.Kullanici;
import com.yarisma.entity.Yarisma;
import com.yarisma.entity.YarismaKatilim;
import com.yarisma.service.KullaniciService;
import com.yarisma.service.YarismaKatilimService;

import java.time.LocalDate;

public class YarismaKatilimController {

    private YarismaKatilimService yarismaKatilimService;
    private KullaniciService kullaniciService;

    public YarismaKatilimController() {
        this.yarismaKatilimService = new YarismaKatilimService();
        this.kullaniciService = new KullaniciService();
    }

    public void yarismaKatilimOlustur(Yarisma yarisma, Kullanici katilimci, LocalDate katilimTarihi) {
        YarismaKatilim yarismaKatilim = new YarismaKatilim(yarisma, katilimci, katilimTarihi);
        yarismaKatilimService.save(yarismaKatilim);
        katilimci.getKatildigiYarismalar().add(yarismaKatilim);
        kullaniciService.update(katilimci);
    }

    public void yarismayaKatilanlariListele(Long yarismaId) {
        yarismaKatilimService.yarismayaKatilanlariListele(yarismaId).forEach(katilim ->
                System.out.println("Katılımcı adı : " + katilim.getKatilimci().getAd()
                        + " - Katılım tarihi: " + katilim.getKatilimTarihi()));
    }
}
