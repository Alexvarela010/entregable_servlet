package com.example.crud.repositories;

import com.example.crud.models.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    Optional<User> getByUsername(String username,String password);

    List<User> getUsers();
    void SaveUser(String username, String core, String password);
    void EditUser(Long identificador,String username, String core, String password);
    void DeleteUser(long identificador);
}
