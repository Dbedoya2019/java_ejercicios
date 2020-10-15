package com.ejercicio.user.controller.user;

import com.ejercicio.user.controller.UserController;
import com.ejercicio.user.dto.UserDTO;
import com.ejercicio.user.service.UserService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest

class UserControllerTestGetUsers {

    @Mock
    UserService service;

    @InjectMocks
    UserController controller;

    @Test
    @DisplayName("Should return a list with information of two users")
    void ShouldReturnAListWithInformationOfTwoUsers() {

            List<UserDTO> listReturn;
            int sizeExpected = 2;
            List<UserDTO> listExpected = new ArrayList<>();

            UserDTO personaA = new UserDTO(1L,"Persona A", "Persona A last name", "dany@gmail.com");
            UserDTO personaB = new UserDTO(2L,"Persona B", "Persona B last name", "dany@gmail.com");

            listExpected.add(personaA);
            listExpected.add(personaB);

            when(service.getUsers()).thenReturn(listExpected);

            List<UserDTO> userListDTO = controller.getUsers();
            assertEquals(userListDTO.size(),sizeExpected);

    }
}