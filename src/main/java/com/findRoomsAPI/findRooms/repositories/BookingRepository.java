package com.findRoomsAPI.findRooms.repositories;

import com.findRoomsAPI.findRooms.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
