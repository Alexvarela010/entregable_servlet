package com.example.crud.controllers;

import com.example.crud.models.User;
import com.example.crud.services.UserService;
import com.example.crud.services.UserServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.Connection;
import java.util.Optional;

@WebServlet(name="loginservlet", value="/login")
public class LoginServlet extends HttpServlet {
    UserService userservice;
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Connection conn= (Connection) req.getAttribute("conn");
        String username= req.getParameter("username");
        String password= req.getParameter("password");
        userservice=new UserServiceImpl(conn);
        Optional<User> user=userservice.authenticate(username,password);
    if (user.isPresent()){
        HttpSession session= req.getSession();
        session.setAttribute("username",username);
        resp.sendRedirect(req.getContextPath()+"/index.jsp");
    }else{
        req.setAttribute("mensaje", "Datos incorrectos");
        getServletContext().getRequestDispatcher("/jsp/login.jsp").forward(req,resp);
    }
    }

}
