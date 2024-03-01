package com.example.servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(name="bienvenidaservlet", value="/Bienvenida")
public class BienvenidaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nombre= req.getParameter("nombre");
        req.setAttribute("nombre", nombre);
        req.getRequestDispatcher("/bienvenida.jsp").forward(req,resp);
    }

}
