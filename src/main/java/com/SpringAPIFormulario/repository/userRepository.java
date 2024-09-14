package com.SpringAPIFormulario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.SpringAPIFormulario.entity.User;


public interface UserRepository extends JpaRepository<User,Long> {
    
}
