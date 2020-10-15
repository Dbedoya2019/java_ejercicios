package com.ejercicio.user.service.user;

import com.ejercicio.user.dto.UserDTO;
import com.ejercicio.user.model.User;
import com.ejercicio.user.repository.UserRepository;
import com.ejercicio.user.service.UserService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest

class UserServiceTestGetUsers {

    @Mock
    UserRepository repository;

    @InjectMocks
    UserService service = new UserService();

    @Test
    @DisplayName("Should return a list with information of two users")
    void ShouldReturnAListWithInformationOfTwoUsers() {
        List<UserDTO> listReturn;
        int sizeExpected = 2;
        List<User> listExpected = new ArrayList<>();

        User personaA = new User(1L,"Persona A", "Persona A last name", "dany@gmail.com");
        User personaB = new User(2L,"Persona B", "Persona B last name", "dany@gmail.com");

        listExpected.add(personaA);
        listExpected.add(personaB);

        when(repository.findAll()).thenReturn(listExpected);

        List<UserDTO> userListDTO = service.getUsers();
        assertEquals(userListDTO.size(),sizeExpected);

    }
}