package com.yarisma.repository;

import com.yarisma.entity.Yarisma;
import com.yarisma.utility.MyFactoryRepository;

import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class YarismaRepository extends MyFactoryRepository<Yarisma, Long> {
    public YarismaRepository() {
        super(new Yarisma());
    }

    public List<Yarisma> kullanicininActigiYarismalariListele(String kullaniciAd) {
        openSession();
        CriteriaQuery<Yarisma> criteria = getBuilder().createQuery(Yarisma.class);
        Root<Yarisma> root = criteria.from(Yarisma.class);
        criteria.select(root).where(getBuilder().equal(root.get("olusturanKullanici").get("ad"), kullaniciAd));
        List<Yarisma> result = getEntityManager().createQuery(criteria).getResultList();
        closeSession();
        return result;
    }
}
