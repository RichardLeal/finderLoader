package com.findRoomsAPI.findRooms.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Room {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private int capacity;
    private String building;

    @OneToMany(mappedBy = "room")
    private Set<Booking> bookings;

    public Room() {
    }

    public Room(String name, int capacity, String building) {
        this.name = name;
        this.capacity = capacity;
        this.building = building;
        this.bookings = new HashSet<>();
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public void setBookings(Set<Booking> bookings) {
        this.bookings = bookings;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getBuilding() {
        return building;
    }

    public Set<Booking> getBookings() {
        return bookings;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", capacity=" + capacity +
                ", building='" + building + '\'' +
                '}';
    }
}
