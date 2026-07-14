package com.slotbooking.domain.resource;

public class Resource implements Bookable {

    private final String id;
    private final String name;
    private final String description;
    private final String ownerProviderId;
    private final String category;

    public Resource(String id,
                    String name,
                    String description,
                    String ownerProviderId,
                    String category) {

        this.id = id;
        this.name = name;
        this.description = description;
        this.ownerProviderId = ownerProviderId;
        this.category = category;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public long getDurationMinutes() {
        return 0;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getOwnerProviderId() {
        return ownerProviderId;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Resource{" +
                "id= '" + id + '\'' +
                ", name= '" + name + '\'' +
                ", description= '" + description + '\'' +
                ", ownerProviderId= '" + ownerProviderId + '\'' +
                ", category= '" + category + '\'' +
                '}';
    }
}