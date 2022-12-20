package com.example.newpro.Service;

import com.example.newpro.repository.UserResponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService implements loginInterface{
    @Autowired
    private UserResponsitory userRepo;

    @Override
    public void login() {

    }

    @Override
    public void logout() {

    }
}
