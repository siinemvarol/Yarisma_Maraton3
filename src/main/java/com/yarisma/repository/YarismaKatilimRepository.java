package com.yarisma.repository;

import com.yarisma.entity.YarismaKatilim;
import com.yarisma.utility.MyFactoryRepository;

import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class YarismaKatilimRepository extends MyFactoryRepository<YarismaKatilim, Long> {
    public YarismaKatilimRepository(){
        super(new YarismaKatilim());
    }

    public List<YarismaKatilim> yarismayaKatilanlariListele(Long yarismaId) {
        openSession();
        CriteriaQuery<YarismaKatilim> criteria = getBuilder().createQuery(YarismaKatilim.class);
        Root<YarismaKatilim> root = criteria.from(YarismaKatilim.class);
        criteria.select(root).where(getBuilder().equal(root.get("yarisma"), yarismaId));
        List<YarismaKatilim> result = getEntityManager().createQuery(criteria).getResultList();
        closeSession();
        return result;

    }
}
