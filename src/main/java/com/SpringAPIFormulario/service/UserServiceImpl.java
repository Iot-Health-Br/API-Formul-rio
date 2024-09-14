package com.SpringAPIFormulario.service;

import com.SpringAPIFormulario.entity.User;
import com.SpringAPIFormulario.repository.UserRepository;

import jakarta.transaction.Transactional;

import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    // Injeção de dependência via construtor
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Implementação do método saveUser
    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }
}

