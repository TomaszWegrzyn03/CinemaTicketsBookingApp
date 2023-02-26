package com.exaple.CinemaTicketsBookingApp.services;

import com.exaple.CinemaTicketsBookingApp.entities.Reservation;
import com.exaple.CinemaTicketsBookingApp.repositories.ReservationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {
    @Autowired
    private ReservationRepo reservationRepository;

    public List<Reservation> gettAllReservations(){
        return reservationRepository.findAll();
    }

    public Reservation postReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }
}
