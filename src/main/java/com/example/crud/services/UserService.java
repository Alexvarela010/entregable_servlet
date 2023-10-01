package com.example.crud.services;

import com.example.crud.models.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    Optional<User> authenticate(String username, String password);
    List<User> UserList();
    void Newuserr(String username,String core,String password);
    void Edit(Long identificador,String username,String core,String password);
    void delete(Long identificador);
}
