package com.cinema.cinemaapp.entity;

import javax.persistence.*;

@Entity
public class Seat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private CinemaHall cinemaHall;

    private int rowNumber;

    private int columnNumber;

    private boolean isSeat;

}
