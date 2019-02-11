package org.alex.producer;

import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.transaction.TransactionScoped;

public class EntityManagerProducer {

    @Produces
    @TransactionScoped
    protected EntityManager createEntityManager() {
        return Persistence.createEntityManagerFactory("tm2").createEntityManager();
    }

    protected void closeEntityManager(@Disposes EntityManager entityManager) {
        if (entityManager.isOpen()) {
            entityManager.close();
        }
    }
}
