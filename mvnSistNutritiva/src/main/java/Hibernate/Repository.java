package Hibernate;

import Entidad.Cliente;

import java.util.List;

public interface Repository<T> {
    void sasve(T t);
    List<T> findAll();
    T findbyID(int id);
    void update(T t);
    void delete(T t);
}
