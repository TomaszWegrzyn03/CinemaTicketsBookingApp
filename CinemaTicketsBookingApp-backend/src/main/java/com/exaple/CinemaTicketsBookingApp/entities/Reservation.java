package com.exaple.CinemaTicketsBookingApp.entities;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity @Table @AllArgsConstructor @NoArgsConstructor @Getter @Setter @ToString
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(updatable = false)
    private Long reservationId;

    @JoinColumn(name = "movie_id", insertable = false, updatable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    @Getter(AccessLevel.NONE)
    private Movie movie;

    @Column(nullable = false, columnDefinition = "int", name = "movie_id")
    private Long movieId;

    @Column(nullable = false, columnDefinition = "varchar(6)")
    private String showTime;

    @Column(nullable = false, columnDefinition = "timestamp")
    private LocalDateTime dateTime;

    @OneToMany( mappedBy = "reservation")
    private List<Seat> seats;


}
