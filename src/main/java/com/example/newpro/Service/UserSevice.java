package com.example.newpro.Service;

import com.example.newpro.models.Users;
import com.example.newpro.repository.UserResponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UserSevice implements UserInterface{
    @Autowired
    private UserResponsitory userres;
    @Override
    public List<Users> getAllUser() {
        return null;
    }

    @Override
    public String addUser(Users users) {
        return null;
    }

    @Override
    public String updateUser(Users users) {
        return null;
    }

    @Override
    public String deleteUser(int id) {
        return null;
    }

    @Override
    public Users getItemByUsername(String username) {
        return this.userres.findByUsername(username);
    }

    @Override
    public Users getItemByUsernameAndPass(String username, String pass) {
        return this.userres.findByUsernameAndPass(username,pass);
    }
}
