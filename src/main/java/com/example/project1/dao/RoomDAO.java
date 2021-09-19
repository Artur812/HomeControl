package com.example.project1.dao;

import com.alibaba.fastjson.JSONObject;
import com.example.project1.models.Room;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class RoomDAO {
    private static int COUNT;
    private List<Room> room;

    {
        room = new ArrayList<>();
        room.add(new Room(++COUNT,"Kitchen","UZ", false));
        room.add(new Room(++COUNT,"Garage","AI", true));
        room.add(new Room(++COUNT,"MyRoom","UZ", false));
        room.add(new Room(++COUNT,"OtherRoom","AI", false));
    }

    public void addRoom(Room rooms) {
        room.add(rooms);
        System.out.println("Saved");
    }

    public List<Room> rooms() {
        return room;
    }

    public Room room(int id){
        return room.stream().filter(room -> room.getId() == id).findAny().orElse(null);
    }

    public void update(int id, Room newroom) {
        Room updated = room(id);
        updated.setisOnn(newroom.getisOnn());
    }

    public boolean isEqual(int id, String code){
        Room room = room(id);
        return room.getCountryName().equals(code);
    }
}
