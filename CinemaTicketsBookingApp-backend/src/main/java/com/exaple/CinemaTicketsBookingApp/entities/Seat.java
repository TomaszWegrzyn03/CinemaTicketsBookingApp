package com.exaple.CinemaTicketsBookingApp.entities;


import jakarta.persistence.*;
import lombok.*;
import net.minidev.json.annotate.JsonIgnore;

@Entity @Table @AllArgsConstructor @NoArgsConstructor @Getter @Setter
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(updatable = false)
    @JsonIgnore
    private Long rowId;

    @Column(nullable = false, columnDefinition = "int")
    private Integer row;

    @Column(nullable = false, columnDefinition = "int")
    private Integer seatNumber;

    @JoinColumn(insertable = false,updatable = false, name = "reservation_id")
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @Getter(AccessLevel.NONE)
    @JsonIgnore
    private Reservation reservation;

    @Column(nullable = false, columnDefinition = "int", name = "reservation_id")
    @JsonIgnore
    private Long reservationId;
}
