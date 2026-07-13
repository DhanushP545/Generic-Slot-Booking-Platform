# Generic Slot Booking Platform

A production-style backend application built with **Spring Boot** that enables service providers to create and manage bookable resources while allowing consumers to discover, reserve, and pay for available time slots. Designed as a **generic booking engine**, the platform can support various domains such as sports turfs, meeting rooms, salons, clinics, co-working spaces, studios, and more.

## Features

### Authentication & Authorization
- JWT-based authentication
- Role-Based Access Control (Admin, Provider, Consumer)
- Secure password encryption
- Refresh token support

### Provider Features
- Register and manage businesses
- Create and manage bookable resources
- Configure working hours and slot duration
- Set pricing and availability
- View and manage bookings

### Consumer Features
- Search and filter resources
- View available slots
- Book, cancel, or reschedule bookings
- Booking history
- Payment

### Booking Engine
- Double-booking prevention
- Transactional booking workflow
- Booking status management

### Payments
- Razorpay integration
- Secure payment verification
- Refund support
- Payment history

### Notifications
- Email confirmations
- Booking reminders
- Cancellation notifications

### Additional Features
- Redis caching
- Global exception handling
- Request validation
- Swagger documentation
- Docker support
- Unit & Integration Testing
- Audit logging

## Tech Stack

- Java 21
- Spring Boot
- Spring Security
- Spring Data JPA
- Hibernate
- MySQL
- Redis
- Razorpay
- JWT
- Maven
- Docker
- Swagger
- JUnit & Mockito

## Project Structure (might change)

```
src
├── config
├── controller
├── dto
├── entity
├── exception
├── repository
├── security
├── service
├── util
└── validation
```

## Future Enhancements

- Google OAuth Login
- Calendar Integration
- QR Code Check-in
- Multi-tenant Architecture
- WebSocket Notifications
- Analytics Dashboard
- Recommendation System

## Project Goal

The objective of this project is to learn the design and implementation of a scalable, production-ready booking platform while showcasing backend development concepts such as authentication, authorization, transactional processing, payment integration, concurrency handling, caching, and REST API design.