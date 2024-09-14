package com.SpringAPIFormulario.controller;

import com.SpringAPIFormulario.entity.User;
import com.SpringAPIFormulario.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/usuarios")
@CrossOrigin(origins = "http://localhost:4200") // Permitir o CORS para o Angular
public class UserController {

    private final UserService userService;

    // Injeção de dependência via construtor
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Endpoint para salvar um usuário
    @PostMapping
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }
}
