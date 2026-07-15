package com.slotbooking.exception;

public class ResourceNotFoundException extends BookingPlatformException {

    public ResourceNotFoundException(String resourceId) {
        super("RESOURCE_NOT_FOUND",
                "Resource not found : " + resourceId);
    }
}
