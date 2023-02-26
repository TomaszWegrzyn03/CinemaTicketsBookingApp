package com.exaple.CinemaTicketsBookingApp.repositories;

import com.exaple.CinemaTicketsBookingApp.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepo extends JpaRepository<Reservation, Long> {
}
