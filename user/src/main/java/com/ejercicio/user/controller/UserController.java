package com.ejercicio.user.controller;


import com.ejercicio.user.dto.UserDTO;
import com.ejercicio.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("users")
    public List<UserDTO> getUsers() {
        return service.getUsers();
    }


}