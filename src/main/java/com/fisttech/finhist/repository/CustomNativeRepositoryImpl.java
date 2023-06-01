package com.fisttech.finhist.repository;

import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomNativeRepositoryImpl implements CustomNativeRepository {

    @Autowired
    private EntityManager entityManager;

//    @Override
//    public Object runNativeQuery() {
//        return  entityManager.createNativeQuery("select distinct type from record")
//                .getResultList();
//    }

    @Override
    public List<String> runNativeQuery() {
        return  entityManager.createNativeQuery("select distinct type from record")
                .getResultList();
    }

}