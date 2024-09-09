package com.SpringAPIFormulario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringAPIFormulario.entity.user;
import com.SpringAPIFormulario.repository.userRepository;

@RestController
@RequestMapping("/api/usuarios")
public class userController {
    @Autowired
    private userRepository usuarioRepository;

    @PostMapping
    public user salvarUsuario(@RequestBody user usuario) {
        return usuarioRepository.save(usuario);
    }
}

