package com.github.sah4ez.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "patterns",urlPatterns = "urlPatterns")
//@ServletSecurity(
//        httpMethodConstraints
//                = @HttpMethodConstraint(value = "GET", rolesAllowed = "admin")
//)
public class AddPatterns extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    @Override
//    @PermitAll
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req.getParameter("id"));
        req.getRequestDispatcher("addAction.jsp").forward(req, resp);
    }
}