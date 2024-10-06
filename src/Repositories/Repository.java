package Repositories;

import java.util.Optional;

public interface Repository<T> {

    T save(T t);
    Optional<T> getById(long id);

}
