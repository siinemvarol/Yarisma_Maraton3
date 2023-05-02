package com.yarisma.repository;

import com.yarisma.entity.Kullanici;
import com.yarisma.utility.MyFactoryRepository;

import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class KullaniciRepository extends MyFactoryRepository<Kullanici, Long> {
    public KullaniciRepository() {
        super(new Kullanici());
    }

    public List<Kullanici> katilimGosterilenYarismalariListele(Long kullaniciId) {
        openSession();
        CriteriaQuery<Kullanici> criteria = getBuilder().createQuery(Kullanici.class);
        Root<Kullanici> root = criteria.from(Kullanici.class);
        criteria.select(root).where(getBuilder().equal(root.get("id"), kullaniciId));
        List<Kullanici> result = getEntityManager().createQuery(criteria).getResultList();
        closeSession();
        return result;
    }
}
