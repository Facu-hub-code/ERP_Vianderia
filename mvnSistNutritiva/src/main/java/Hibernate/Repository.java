package Hibernate;

import java.util.List;

public interface Repository<T> {
    boolean save(T t);
    List<T> findAll();
    T findbyID(int id);
    void update(T t);
}
