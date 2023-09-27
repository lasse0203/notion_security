package com.example.project_secu.repositories;

import com.example.project_secu.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserEntityRepository extends JpaRepository<UserEntity, UUID>{

    Optional<UserEntity> findByEmail(String email);
    Boolean existsByEmail(String email);
}
