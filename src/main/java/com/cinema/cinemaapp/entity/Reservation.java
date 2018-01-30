package com.cinema.cinemaapp.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    private int filmSchedulerId;

    @OneToOne
    private int customerId;

    /**
     * cascade
     * fetch
     * mappedBy
     */
    @OneToMany(cascade = CascadeType.ALL)
    private List<Seat> seats;


}
