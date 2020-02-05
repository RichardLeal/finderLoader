package com.findRoomsAPI.findRooms.services;

import com.findRoomsAPI.findRooms.entity.Room;
import com.findRoomsAPI.findRooms.repositories.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RoomService {

    private RoomRepository roomRepository;

    @Autowired
    public RoomService(RoomRepository roomRepository){
        this.roomRepository = roomRepository;
    }

    @Transactional(readOnly = true)
    public List<Room> findAll(){
        List<Room> roomList = this.roomRepository.findAll();

        return roomList;
    }
}
