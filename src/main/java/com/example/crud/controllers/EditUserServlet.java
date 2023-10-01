package com.example.crud.controllers;

import com.example.crud.services.UserService;
import com.example.crud.services.UserServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;

@WebServlet(name="EditUser", value="/EditUser")

public class EditUserServlet extends HttpServlet {
    UserService userservice;
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id=req.getParameter("ids");
        Long identificador=Long.parseLong(id);
        String username= req.getParameter("name");
        String password= req.getParameter("password");
        String core = req.getParameter("core");
        userservice =new UserServiceImpl((Connection) req.getAttribute("conn"));
    userservice.Edit(identificador,username,core,password);
        resp.sendRedirect(req.getContextPath()+"/users");
    }
}
