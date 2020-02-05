package com.findRoomsAPI.findRooms.repositories;

import com.findRoomsAPI.findRooms.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
