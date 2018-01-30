package com.cinema.cinemaapp.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    private Integer filmSchedulerId;

    @OneToOne
    private Integer customerId;

    /**
     * cascade
     * fetch
     * mappedBy
     */
    @OneToMany(cascade = CascadeType.ALL)
    private List<Seat> seats;


    public Reservation() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFilmSchedulerId() {
        return filmSchedulerId;
    }

    public void setFilmSchedulerId(Integer filmSchedulerId) {
        this.filmSchedulerId = filmSchedulerId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }


}
