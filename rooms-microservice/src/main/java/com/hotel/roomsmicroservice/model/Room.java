package com.hotel.roomsmicroservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Room {

    @Id
    String roomId;
    int roomNo;
    String roomCategory;//VIP, normal
    String roomType; //ac,non-ac
    String roomDescription;

    public Room(int roomNo, String roomCategory, String roomType, String roomDescription) {
        this.roomNo = roomNo;
        this.roomCategory = roomCategory;
        this.roomType = roomType;
        this.roomDescription = roomDescription;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public String getRoomCategory() {
        return roomCategory;
    }

    public void setRoomCategory(String roomCategory) {
        this.roomCategory = roomCategory;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomId='" + roomId + '\'' +
                ", roomNo=" + roomNo +
                ", roomCategory='" + roomCategory + '\'' +
                ", roomType='" + roomType + '\'' +
                ", roomDescription='" + roomDescription + '\'' +
                '}';
    }
}
