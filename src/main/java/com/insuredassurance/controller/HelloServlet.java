package com.insuredassurance.controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Insured Assurance - Hello</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Welcome to Insured Assurance App V3 - Now with CI/CD!</h1>");
            out.println("<p>Your CI/CD pipeline is ready to deploy this simple application.</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
