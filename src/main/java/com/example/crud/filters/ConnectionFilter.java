package com.example.crud.filters;
import com.example.crud.utils.ConnectionDatabase;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;


@WebFilter("/*")
public class ConnectionFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        try (Connection conn = ConnectionDatabase.getConnection()) {
            if (conn.getAutoCommit()) {
                conn.setAutoCommit(false);
            }

            try {
                request.setAttribute("conn", conn);
                chain.doFilter(request, response);
                conn.commit();
            } catch (SQLException e) {
                conn.rollback();
                ((HttpServletResponse)response).sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, e.getMessage());
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}