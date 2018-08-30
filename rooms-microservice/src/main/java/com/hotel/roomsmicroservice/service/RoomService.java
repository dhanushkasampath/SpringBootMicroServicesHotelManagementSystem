package com.hotel.roomsmicroservice.service;

import com.hotel.roomsmicroservice.model.Room;
import com.hotel.roomsmicroservice.repository.RoomRepository;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.websocket.server.ServerEndpoint;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

@Service
public class RoomService {

    @Autowired
    private RoomRepository roomRepository;

    public Room create(Room staffMember){
        return roomRepository.save(staffMember);
    }


    public List<Room> getAll(){
        return roomRepository.findAll();
    }

    public String callStaffMicroservice() {

        HttpURLConnection conn;
        String query_url = "http://localhost:1111/staff/getAll";
        String response = "";
        try {
            URL url = new URL(query_url);
            conn = (HttpURLConnection)url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("Accept", "application/json");
            StringBuilder content;
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            content = new StringBuilder();
            while((line = in.readLine()) != null) {
                content.append(line);
                content.append(System.lineSeparator());
            }

            if(200==conn.getResponseCode()) {
                response = content.toString();
                return response;
            }
        }catch(Exception e) {
            System.out.println("your exception is :"+e);
        }

        return response;
    }
}
