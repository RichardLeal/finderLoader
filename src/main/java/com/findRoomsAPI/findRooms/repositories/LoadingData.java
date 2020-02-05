package com.findRoomsAPI.findRooms.repositories;

import com.findRoomsAPI.findRooms.entity.Booking;
import com.findRoomsAPI.findRooms.entity.Room;
import com.findRoomsAPI.findRooms.entity.User;
import com.findRoomsAPI.findRooms.services.RoomService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.transform.sax.SAXSource;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Configuration
public class LoadingData {

    @Bean
    CommandLineRunner initDatabase(UserRepository userRepositorie, RoomRepository roomRepository, BookingRepository bookingRepository) {
        return args -> {
            List<User> users;
            List<Booking> bookings;
            List<Room> rooms;

            users = new ArrayList<>();
            users.add(new User("Thaty", "Costa"));
            users.add(new User("Luis", "Lima"));
            users.add(new User("Richard", "Ramos"));

            users.forEach( user -> {
                System.out.println(user);
                userRepositorie.save(user);
            });

            rooms = new ArrayList<>();
            rooms.add(new Room("Êrico Veressemo", 2, "A1"));
            rooms.add(new Room("Érico Veríssimo", 20, "Prédio 8"));
            rooms.add(new Room("Nelson", 2333, "Prédio 8"));

            rooms.forEach( room -> {
                System.out.println(room);
                roomRepository.save(room);
            });

            bookings = new ArrayList<>();
            bookings.add(new Booking("Aluguei", "2022-01-01 01:01:01","2020-02-02 03:03:03", new Room(), new User()));
            System.out.println(bookings);

            Room roomAux = rooms.get(0);
            Booking bookingAux = bookings.get(0);
            roomAux.getBookings().add(bookingAux);
            bookingAux.setUser(users.get(0));
            bookingAux.setRoom(roomAux);
            System.out.println("aquiidkhgyuadsjgmfdasdafqw" + bookingAux);

            bookingRepository.save(bookingAux);
            roomRepository.save(rooms.get(0));

            
        };
    }
}
