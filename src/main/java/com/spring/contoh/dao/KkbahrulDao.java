package com.spring.contoh.dao;

import com.spring.contoh.model.Kkbahrul;
import com.spring.contoh.repo.KkbahrulRepo;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository

public class KkbahrulDao implements KkbahrulRepo {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Kkbahrul> getall() {
        return entityManager.createQuery("from Kkbahrul").getResultList();

    }
    @Override
    public void tambah(Kkbahrul a) {
        entityManager.persist(a);
        entityManager.flush();
    }

    @Override
    public void update(Kkbahrul a) {
        Kkbahrul c=get(a.getNik());
        c.setNama(a.getNama());
        entityManager.flush();

    }

    @Override
    public Kkbahrul get(String NIK) {
        return entityManager.find(Kkbahrul.class, NIK);
    }

}
