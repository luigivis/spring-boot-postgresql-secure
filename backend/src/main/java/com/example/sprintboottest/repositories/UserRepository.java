package com.example.sprintboottest.repositories;

import com.example.sprintboottest.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<Users, Long> {
    Users findByName(String name);
    Users findByEmail(String email);
    Users findByRegion(String region);

    Users findByNameAndEmail(String name, String email);

    @Query(value = "SELECT * FROM users where name = :nombre", nativeQuery = true)
    Users customFindByName(@Param("nombre") String name);
}