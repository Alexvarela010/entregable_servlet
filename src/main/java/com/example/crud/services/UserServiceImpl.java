package com.example.crud.services;

import com.example.crud.models.User;
import com.example.crud.repositories.UserRepository;
import com.example.crud.repositories.UserRepositoryImpl;

import java.sql.Connection;
import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements UserService{

    UserRepository userRepository=null;
    public UserServiceImpl(Connection conn){
    userRepository=new UserRepositoryImpl(conn);
    }
    @Override
    public Optional<User> authenticate(String username, String password) {
        return userRepository.getByUsername(username, password);

    }

    public List<User> UserList(){
        return userRepository.getUsers();
    }
    public void Newuserr(String username, String core, String password){
        userRepository.SaveUser( username, core, password);
    }
    public void Edit(Long identificador,String username, String core, String password){
        userRepository.EditUser( identificador,username, core, password);
    }
    public void delete(Long identificador){
        userRepository.DeleteUser(identificador);
    }
}
