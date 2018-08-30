package com.hotel.roomsmicroservice.repository;

import com.hotel.roomsmicroservice.model.Room;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoomRepository extends MongoRepository<Room, String> {
}
