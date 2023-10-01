package com.example.crud.repositories;

import com.example.crud.models.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepositoryImpl implements UserRepository{
    private Connection conn;
    public UserRepositoryImpl(Connection conn){
        this.conn=conn;
    }

    @Override
    public Optional<User> getByUsername(String username, String password) {
        User user = null;
        String query = "SELECT u.* FROM users as u WHERE u.username = ? AND u.password = ?";
        try (PreparedStatement stmt = this.conn.prepareStatement(query)) {
        stmt.setString(1,username);
        stmt.setString(2,password);
        try (ResultSet rs=stmt.executeQuery()){
            if (rs.next()){
                user=new User();
                user.setId(rs.getLong("id"));
                user.setName(rs.getString("name"));
                user.setUsername(rs.getString("username"));
                user.setPasswrod(rs.getString("password"));
            }
        }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return Optional.ofNullable(user);
    }


    public List<User>getUsers(){
        List<User> users=new ArrayList<>();
        try    (Statement stmt= conn.createStatement();
                ResultSet rs=stmt.executeQuery("SELECT u.* FROM users as u order by u.id ASC")) {
    while (rs.next()){
        users.add(getUser(rs));
    }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return users;
    }
    public void SaveUser(String username,String core, String password){
        String query = "INSERT INTO users (name,username,password)values(?,?,?)";
        try(PreparedStatement stmt= conn.prepareStatement(query)) {
            stmt.setString(1,username);
            stmt.setString(2,core);
            stmt.setString(3,password);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void EditUser(Long identificador,String username,String core, String password){
        String query = "UPDATE users SET name = ?, username = ?, password = ? WHERE id = ?";
        try(PreparedStatement stmt= conn.prepareStatement(query)) {
            stmt.setString(1, username);
            stmt.setString(2, core);
            stmt.setString(3, password);
            stmt.setLong(4, identificador);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public void DeleteUser(long identificador){
        String query = "DELETE FROM users WHERE id = ?";
        try(PreparedStatement stmt= conn.prepareStatement(query)) {
            stmt.setLong(1, identificador);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private User getUser(ResultSet rs)throws SQLException{
        User user =new User();
        user.setId(rs.getLong("id"));
        user.setName(rs.getString("name"));
        user.setUsername(rs.getString("username"));
        user.setPasswrod(rs.getString("password"));
        return user;
    }

}

