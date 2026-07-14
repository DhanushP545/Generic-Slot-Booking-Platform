package com.slotbooking.repository;

import java.util.*;
import java.util.stream.Collectors;
import com.slotbooking.domain.booking.*;

public class InMemoryBookingRepository
        extends InMemoryRepository<Booking, String> {

    @Override
    protected String getId(Booking booking) {
        return booking.getId();
    }

    public List<Booking> findBookingsForConsumer(String consumerId) {

        return findAll()
                .stream()
                .filter(booking -> booking.getConsumerId().equals(consumerId))
                .sorted(
                        Comparator.comparing(Booking::getCreatedAt)
                                  .reversed()
                )
                .collect(Collectors.toList());
    }
    public List<Slot[]> findDoubleBookingCandidates(List<Slot> allSlots){
    	List<Slot[]> conflicts = new ArrayList<>();
    	Map<String, List<Slot>> byResource = allSlots.stream()
    							.collect(Collectors.groupingBy(Slot::getResourceId));
    	for(List<Slot> slots: byResource.values()) {
    		List<Slot> sorted = slots.stream().sorted().collect(Collectors.toList());
    		for(int i=0; i<sorted.size()-1; i++) {
    			Slot current = sorted.get(i);
    			Slot next = sorted.get(i+1);
    			if(current.getEnd().isAfter(next.getStart())) {
    				conflicts.add(new Slot[] {current, next});
    			}
    		}	
    	}
    	return conflicts;
    }
}
