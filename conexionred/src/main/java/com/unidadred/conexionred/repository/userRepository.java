package com.unidadred.conexionred.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unidadred.conexionred.model.user;

public interface userRepository extends JpaRepository<user, Long> {
    Optional<user> findByUsername(String username);
}
