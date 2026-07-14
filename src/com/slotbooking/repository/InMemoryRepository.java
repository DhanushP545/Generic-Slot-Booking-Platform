package com.slotbooking.repository;
import java.util.*;

public abstract class InMemoryRepository<T, ID> implements Repository<T, ID> {

    protected final Map<ID, T> storage = new HashMap<>();

    protected abstract ID getId(T entity);

    @Override
    public T save(T entity) {
        storage.put(getId(entity), entity);
        return entity;
    }

    @Override
    public Optional<T> findById(ID id) {
        return Optional.ofNullable(storage.get(id));
    }

    @Override
    public List<T> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public void deleteById(ID id) {
        storage.remove(id);
    }
}
