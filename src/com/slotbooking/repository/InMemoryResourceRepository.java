package com.slotbooking.repository;
import com.slotbooking.domain.resource.*;

public class InMemoryResourceRepository
        extends InMemoryRepository<Resource, String> {

    @Override
    protected String getId(Resource resource) {
        return resource.getId();
    }
}
