package com.example.newpro.Service;

import com.example.newpro.models.Users;

import java.util.List;
import java.util.Optional;

public interface UserInterface {
    public List<Users> getAllUser();
    public String addUser(Users users);
    public String updateUser(Users users);
    public String deleteUser( int id);
    public Users getItemByUsername(String username);
    public Users getItemByUsernameAndPass(String username, String pass);
}
