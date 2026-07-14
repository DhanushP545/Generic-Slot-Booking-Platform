package com.slotbooking;

import com.slotbooking.domain.booking.*;
import com.slotbooking.domain.resource.Resource;
import com.slotbooking.domain.user.Consumer;
import com.slotbooking.domain.user.Provider;

import java.time.LocalDateTime;

public class PlaygroundMain {

    public static void main(String[] args) {

        Provider provider = new Provider(
                "P101",
                "Sports Arena",
                "arena@gmail.com"
        );

        Consumer consumer = new Consumer(
                "C101",
                "Dhanush",
                "dhanush@gmail.com"
        );

        Resource turf = new Resource(
                "R101",
                "Football Turf",
                "5v5 Football Ground",
                provider.getId(),
                "Sports"
        );

        Slot slot1 = new Slot(
                "S101",
                turf.getId(),
                LocalDateTime.of(2026, 7, 15, 10, 0),
                LocalDateTime.of(2026, 7, 15, 11, 0),
                SlotStatus.AVAILABLE
        );

        Slot slot2 = new Slot(
                "S102",
                turf.getId(),
                LocalDateTime.of(2026, 7, 15, 11, 0),
                LocalDateTime.of(2026, 7, 15, 12, 0),
                SlotStatus.AVAILABLE
        );

        Slot slot3 = new Slot(
                "S103",
                turf.getId(),
                LocalDateTime.of(2026, 7, 15, 12, 0),
                LocalDateTime.of(2026, 7, 15, 13, 0),
                SlotStatus.AVAILABLE
        );

        Booking booking = new Booking.Builder()
                .id("B101")
                .slotId(slot1.getId())
                .resourceId(slot1.getResourceId())
                .consumerId(consumer.getId())
                .status(BookingStatus.CONFIRMED)
                .createdAt(LocalDateTime.now())
                .build();

        System.out.println(provider);
        System.out.println(consumer);
        System.out.println(turf);
        System.out.println(slot1);
        System.out.println(slot2);
        System.out.println(slot3);
        System.out.println(booking);
        
        Slot slot4 = new Slot(
                "S101",   // Same ID as slot1
                turf.getId(),
                LocalDateTime.of(2026, 7, 15, 18, 0),
                LocalDateTime.of(2026, 7, 15, 19, 0),
                SlotStatus.BOOKED
        );

        System.out.println("\n=== Testing equals() ===");

        System.out.println("slot1:");
        System.out.println(slot1);

        System.out.println("\nslot4:");
        System.out.println(slot4);

        System.out.println("\nslot1.equals(slot4): " + slot1.equals(slot4));
        System.out.println("slot1.hashCode(): " + slot1.hashCode());
        System.out.println("slot4.hashCode(): " + slot4.hashCode());
    }
}