package com.slotbooking.domain.booking;

import java.time.LocalDateTime;
import java.util.Objects;

public class Booking {

    private final String id;
    private final String slotId;
    private final String consumerId;
    private final BookingStatus status;
    private final LocalDateTime createdAt;

    private Booking(Builder builder) {
        this.id = builder.id;
        this.slotId = builder.slotId;
        this.consumerId = builder.consumerId;
        this.status = builder.status;
        this.createdAt = builder.createdAt;
    }

    public static class Builder {

        private String id;
        private String slotId;
        private String consumerId;
        private BookingStatus status;
        private LocalDateTime createdAt;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder slotId(String slotId) {
            this.slotId = slotId;
            return this;
        }

        public Builder consumerId(String consumerId) {
            this.consumerId = consumerId;
            return this;
        }

        public Builder status(BookingStatus status) {
            this.status = status;
            return this;
        }

        public Builder createdAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Booking build() {
            return new Booking(this);
        }
    }

    public String getId() {
        return id;
    }

    public String getSlotId() {
        return slotId;
    }

    public String getConsumerId() {
        return consumerId;
    }

    public BookingStatus getStatus() {
        return status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Booking booking)) return false;
        return Objects.equals(id, booking.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id= '" + id + '\'' +
                ", slotId= '" + slotId + '\'' +
                ", consumerId= '" + consumerId + '\'' +
                ", status= " + status +
                ", createdAt= " + createdAt +
                '}';
    }
}