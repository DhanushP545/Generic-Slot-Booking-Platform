package com.slotbooking.domain.booking;
import java.util.UUID;

public final class Review {
    private final String id;
    private final String bookingId;
    private final String consumerId;
    private final String resourceId;
    private final int rating;
    private final String comment;
 
    private Review(String id, String bookingId, String consumerId,
                    String resourceId, int rating, String comment) {
        this.id = id;
        this.bookingId = bookingId;
        this.consumerId = consumerId;
        this.resourceId = resourceId;
        this.rating = rating;
        this.comment = comment;
    }
 
    public static Review forCompletedBooking(Booking booking, int rating, String comment) {
        if (booking.getStatus() != BookingStatus.COMPLETED) {
            throw new IllegalStateException("Cannot review a booking that is not COMPLETED");
        }
        if (rating < 1 || rating > 5) {
            throw new IllegalArgumentException("Rating must be between 1 and 5");
        }
        return new Review(UUID.randomUUID().toString(), booking.getId(),
                booking.getConsumerId(), booking.getResourceId(), rating, comment);
    }
}
