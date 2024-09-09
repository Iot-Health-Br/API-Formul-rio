package com.SpringAPIFormulario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.SpringAPIFormulario.entity.user;


public interface userRepository extends JpaRepository<user,Long> {
    
}
