package Repository;

import java.util.List;

public interface Repository<T> {
    boolean save(T t);
    List<T> findAll();
    T findbyID(int id);
    boolean update(T t);
}
