package dao;

import models.SimpleStats;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.io.Serializable;
import java.util.List;

public class SimpleStatsDAO extends SessionDAO<SimpleStats> {

    public SimpleStatsDAO(Session session) {
        super(session);
    }


    @Override
    public void save(SimpleStats objectToSave) {
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(objectToSave);
        transaction.commit();
    }

    @Override
    public SimpleStats get(Serializable id) {
        SimpleStats result = null;
        Transaction transaction = session.beginTransaction();
        result = session.get(SimpleStats.class, id);
        transaction.commit();
        return result;
    }

    @Override
    public void update(SimpleStats objectToUpdate) {
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(objectToUpdate);
        session.evict(objectToUpdate);
        transaction.commit();
    }

    @Override
    public void delete(SimpleStats objectToDelete) {
        Transaction transaction = session.beginTransaction();
        session.delete(objectToDelete);
        transaction.commit();
    }

    @Override
    public List getAll() {
        List<SimpleStats> result = null;
        Transaction transaction = session.beginTransaction();
        result = session.createQuery("FROM SimpleStats").getResultList();
        transaction.commit();
        return result;
    }
}
