package com.findRoomsAPI.findRooms.repositories;

import com.findRoomsAPI.findRooms.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository <Room, Long> {
}
