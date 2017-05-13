package com.github.sah4ez.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "urlPatterns")
public class fffffff extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<html><title>HI</title><body>Hello world!</body></html>");
        System.out.println("fsdfss11111111111111111111");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<html><title>HI</title><body>11Hello world!</body></html>");
        System.out.println("22222222222fsdfss11111111111111111111");
    }
}