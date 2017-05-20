package com.github.sah4ez.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by aleksandr on 20.05.17.
 */
@WebServlet(name = "login", urlPatterns = "auth")
public class Login extends HttpServlet{
    private static final long serialVersionUID = -107919317394733193L;

    private static final Logger LOG = LoggerFactory.getLogger(Login.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("login.html").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        LOG.info("Login user: {} ", username);


        if ("admin".equals(username) && "admin".equals(password)){
            resp.setStatus(HttpServletResponse.SC_ACCEPTED);
//            RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("urlPatterns");
//            requestDispatcher.forward(req, resp);
            resp.sendRedirect("urlPatterns");
            LOG.info("access login {}", username);
        }
    }
}
