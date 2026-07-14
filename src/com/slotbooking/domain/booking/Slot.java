package com.slotbooking.domain.booking;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Objects;

public final class Slot implements Comparable<Slot>{

    private final String id;
    private final String resourceId;
    private final LocalDateTime start;
    private final LocalDateTime end;
    private final SlotStatus status;

    public Slot(String id,
                String resourceId,
                LocalDateTime start,
                LocalDateTime end,
                SlotStatus status) {

        if (!start.isBefore(end))
            throw new IllegalArgumentException("Start must be before End");

        this.id = id;
        this.resourceId = resourceId;
        this.start = start;
        this.end = end;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public String getResourceId() {
        return resourceId;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public SlotStatus getStatus() {
        return status;
    }

    @Override
    public int compareTo(Slot other) {
        return this.getStart().compareTo(other.getStart());
    }

    public long getDurationMinutes() {
        return Duration.between(start, end).toMinutes();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Slot slot)) return false;
        return Objects.equals(id, slot.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Slot{" +
                "id= '" + id + '\'' +
                ", resourceId= '" + resourceId + '\'' +
                ", start= " + start +
                ", end= " + end +
                ", status= " + status +
                '}';
    }
}