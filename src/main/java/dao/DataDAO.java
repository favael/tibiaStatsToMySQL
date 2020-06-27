package dao;

import models.Data;
import models.Statistic;
import org.hibernate.Session;
import org.hibernate.Transaction;


import java.io.Serializable;
import java.util.List;

public class DataDAO extends SessionDAO<Data> {

    public DataDAO(Session session) {
        super(session);
    }


    @Override
    public void save(Data objectToSave) {
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(objectToSave);
        transaction.commit();
    }

    @Override
    public Data get(Serializable id) {
        Data result = null;
        Transaction transaction = session.beginTransaction();
        result = session.get(Data.class, id);
        transaction.commit();
        return result;
    }

    @Override
    public void update(Data objectToUpdate) {
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(objectToUpdate);
        session.evict(objectToUpdate);
        transaction.commit();
    }

    @Override
    public void delete(Data objectToDelete) {
        Transaction transaction = session.beginTransaction();
        session.delete(objectToDelete);
        transaction.commit();
    }

    @Override
    public List getAll() {
        List<Data> result = null;
        Transaction transaction = session.beginTransaction();
        result = session.createQuery("FROM Tibia").getResultList();
        transaction.commit();
        return result;
    }
}
