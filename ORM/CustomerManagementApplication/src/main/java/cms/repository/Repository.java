package cms.repository;

import java.util.List;

public interface Repository<T>{
    List<T>findAll();
    T findByTd(Long id);
    void save(T model);
    void remove(Long id);
}
