package eu.unareil.dal;

import java.util.List;

public interface DAO<T> {
    void insert(T data) throws DALException;

    void delete(T data) throws DALException;

    void update(T data) throws DALException;

    T selectById(T data) throws DALException;

    List<T> selectAll() throws DALException;

}
