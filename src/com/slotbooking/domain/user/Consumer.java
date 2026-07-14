package com.slotbooking.domain.user;

public class Consumer extends User {

    public Consumer(String id, String name, String email) {
        super(id, name, email);
    }

    @Override
    public UserRole getRole() {
        return UserRole.CONSUMER;
    }
}