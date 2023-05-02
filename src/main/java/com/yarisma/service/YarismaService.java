package com.yarisma.service;

import com.yarisma.entity.Yarisma;
import com.yarisma.repository.YarismaRepository;
import com.yarisma.utility.MyFactoryService;

import java.util.List;

public class YarismaService extends MyFactoryService<Yarisma, YarismaRepository, Long> {
    public YarismaService() {
        super(new YarismaRepository());
    }

    public List<Yarisma> kullanicininActigiYarismalariListele(String kullaniciAd) {
        return getRepository().kullanicininActigiYarismalariListele(kullaniciAd);
    }
}
