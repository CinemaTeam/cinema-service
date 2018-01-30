package com.cinema.cinemaapp.entity;

import javax.persistence.*;

@Entity
public class FilmScheduler {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    private int filmId;

    //TODO is it String?
    private String date;

    //TODO is it String?
    private String startTime;

    @OneToOne
    private CinemaHall cinemaHall;
}
