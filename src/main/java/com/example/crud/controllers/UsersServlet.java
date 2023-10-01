package com.example.crud.controllers;

import com.example.crud.models.User;
import com.example.crud.services.UserService;
import com.example.crud.services.UserServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

@WebServlet(name="usersServlet", value="/users")
public class UsersServlet extends HttpServlet {
    UserService userService;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        userService =new UserServiceImpl((Connection) req.getAttribute("conn"));
        List<User> users=userService.UserList();
        req.setAttribute("users",users);
        getServletContext().getRequestDispatcher("/jsp/users/list.jsp").forward(req,resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Connection conn= (Connection) req.getAttribute("conn");
        String username= req.getParameter("name");
        String password= req.getParameter("password");
        String core = req.getParameter("core");
        userService =new UserServiceImpl((Connection) req.getAttribute("conn"));
            userService.Newuserr(username,core,password);
        resp.sendRedirect(req.getContextPath()+"/users");
    }
}
