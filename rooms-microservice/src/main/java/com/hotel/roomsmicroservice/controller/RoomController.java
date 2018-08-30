package com.hotel.roomsmicroservice.controller;

import com.hotel.roomsmicroservice.model.Room;
import com.hotel.roomsmicroservice.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoomController {

    @Autowired
    private RoomService roomService;

    //http://localhost:2222/room/create
    @RequestMapping(method = RequestMethod.POST, value = "/room/create")
    public String addStaff(@RequestBody Room room){
        Room p = roomService.create(room);
        return p.toString();
    }

    //http://localhost:2222/room/getAll
    @RequestMapping(method = RequestMethod.GET, value = "/room/getAll")
    public List<Room> getAll(){
        return roomService.getAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/room/callapi")
    public String callAPI(){
        return roomService.callStaffMicroservice();
    }
}
