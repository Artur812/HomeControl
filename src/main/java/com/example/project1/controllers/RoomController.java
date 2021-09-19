package com.example.project1.controllers;

import com.example.project1.dao.RoomDAO;
import com.example.project1.models.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/")
public class RoomController {

    private final RoomDAO roomDAO;

    public RoomController(RoomDAO roomDAO) {
        this.roomDAO = roomDAO;
    }

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("rooms", roomDAO.rooms());
        return "home";
    }
    @GetMapping("/new")
    public String newRoom(Model model){
        model.addAttribute("newroom", new Room());
        return "new";
    }

    @PostMapping("/new")
    public String newRoom(@ModelAttribute("room") Room room){
        roomDAO.addRoom(room);
        return "redirect:/";
    }
    @GetMapping("/edit/{id}")
    public String enterToRoom(HttpServletRequest request, Model model, @PathVariable("id") int id){
        String code = "AI"; // for example! there we can equal two country code
        if(roomDAO.isEqual(id, code)) {
            model.addAttribute("room",  roomDAO.room(id));
            return "/edit";
        }
        else{
            return "redirect:/";
        }
    }

    @PostMapping("/edit/{id}")
    public String update(@ModelAttribute("room") Room room , @PathVariable("id") int id){
        roomDAO.update(id, room);
        return "redirect:/";
    }
}
