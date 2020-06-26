package dao;

import models.SimpleStats;


import java.io.Serializable;
import java.util.List;

public interface DAO<T> {

    void save(T objectToSave); // create

    SimpleStats get(Serializable id); //read

    void update(T objectToUpdate); // update
    void delete(T objectToDelete); // remove
    // CRUD

    List<T> getAll();


}
