package com.example.newpro.repository;

import com.example.newpro.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserResponsitory extends JpaRepository<Users, Integer> {
    @Query("SELECT u FROM Users u WHERE u.username = ?1")
    public Users findByUsername(String username);
     @Query("SELECT u FROM Users u WHERE u.username = ?1 AND u.password = ?2")
    public Users findByUsernameAndPass(String username,String pass);
}
