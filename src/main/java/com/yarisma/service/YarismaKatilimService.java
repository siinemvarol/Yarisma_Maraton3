package com.yarisma.service;

import com.yarisma.entity.YarismaKatilim;
import com.yarisma.repository.YarismaKatilimRepository;
import com.yarisma.utility.MyFactoryService;

import java.util.List;

public class YarismaKatilimService extends MyFactoryService<YarismaKatilim, YarismaKatilimRepository, Long> {
    public YarismaKatilimService() {
        super(new YarismaKatilimRepository());
    }

    public List<YarismaKatilim> yarismayaKatilanlariListele(Long yarismaId) {
        return getRepository().yarismayaKatilanlariListele(yarismaId);
    }

}
