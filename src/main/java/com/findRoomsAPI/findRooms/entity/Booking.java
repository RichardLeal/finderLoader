package com.findRoomsAPI.findRooms.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

@ToString
@Entity
public class Booking {

    @Id
    @GeneratedValue
    private Long id;
    private String description;

    private Date startDate;
    private Date endDate;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private SimpleDateFormat simpleDateFormat;

    public Booking() {
    }

    public Booking(String description, String startDate, String endDate, Room room, User user) {
        SimpleDateFormat dateToStringFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parsedStarDate = dateToStringFormat.parse(startDate, new ParsePosition(0));
        Date parsedEndDate = dateToStringFormat.parse(endDate, new ParsePosition(0));

        this.description = description;
        this.startDate = parsedStarDate;
        this.endDate = parsedEndDate;
        this.room = room;
        this.user = user;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public Room getRoom() {
        return room;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
