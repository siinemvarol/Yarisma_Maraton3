package com.yarisma.service;

import com.yarisma.entity.Kullanici;
import com.yarisma.repository.KullaniciRepository;
import com.yarisma.utility.MyFactoryService;

import java.util.List;

public class KullaniciService extends MyFactoryService<Kullanici, KullaniciRepository, Long> {
    public KullaniciService() {
        super(new KullaniciRepository());
    }

    public List<Kullanici> katilimGosterilenYarismalariListele(Long kullaniciId) {
        return getRepository().katilimGosterilenYarismalariListele(kullaniciId);
    }

}
