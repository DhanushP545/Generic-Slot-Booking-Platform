package com.slotbooking.domain.user;

public class Provider extends User {

    public Provider(String id, String name, String email) {
        super(id, name, email);
    }

    @Override
    public UserRole getRole() {
        return UserRole.PROVIDER;
    }
}
