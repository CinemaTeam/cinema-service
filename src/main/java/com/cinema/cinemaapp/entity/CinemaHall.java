package com.cinema.cinemaapp.entity;

import javax.persistence.*;

@Entity
public class CinemaHall {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

}
