package com.ejercicio.user.service;


import com.ejercicio.user.dto.UserDTO;
import com.ejercicio.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<UserDTO> getUsers() {
        return UserDTO.mapToDTO(repository.findAll());
    }

}
