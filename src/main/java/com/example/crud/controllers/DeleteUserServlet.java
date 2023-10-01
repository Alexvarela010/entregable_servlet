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

@WebServlet(name="Delete", value="/DeleteUser")
public class DeleteUserServlet extends HttpServlet {
    UserService userservice;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id=req.getParameter("id");
        Long identificador=Long.parseLong(id);
        userservice =new UserServiceImpl((Connection) req.getAttribute("conn"));
        userservice.delete(identificador);
        resp.sendRedirect(req.getContextPath()+"/users");
    }
}
