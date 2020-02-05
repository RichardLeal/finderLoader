package com.findRoomsAPI.findRooms.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@ToString
@Entity
public class User {

    @Id
    @GeneratedValue
    private Long badge;
    private String firstName;
    private String lastName;

    @OneToMany(mappedBy = "user")
    private Set<Booking> bookings;

    public User() {
    }

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bookings = new HashSet<>();
    }

    public Long getBadge() {
        return badge;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setBadge(Long badge) {
        this.badge = badge;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(Set<Booking> bookings) {
        this.bookings = bookings;
    }
}
