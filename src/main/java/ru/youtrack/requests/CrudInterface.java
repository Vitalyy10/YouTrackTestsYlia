package ru.youtrack.requests;

public interface CrudInterface<T, ID> {
    T create(T obj);

    T get(ID id);

    T update(T obj);

    void delete(ID id);
}
