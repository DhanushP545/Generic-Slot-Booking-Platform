package com.slotbooking.repository;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

import com.slotbooking.domain.booking.*;

public class InMemorySlotRepository
extends InMemoryRepository<Slot, String> {

@Override
protected String getId(Slot slot) {
return slot.getId();
}

public List<Slot> findAvailableSlots(String resourceId, LocalDate date) {

return findAll()
        .stream()
        .filter(slot -> slot.getResourceId().equals(resourceId))
        .filter(slot -> slot.getStart().toLocalDate().equals(date))
        .filter(slot -> slot.getStatus() == SlotStatus.AVAILABLE)
        .sorted()
        .collect(Collectors.toList());
}
}
