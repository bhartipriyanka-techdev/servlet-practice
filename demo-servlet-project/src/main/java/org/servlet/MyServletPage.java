package org.servlet;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class MyServletPage extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        //Fetch Ui/Form Data
        String name = servletRequest.getParameter("name");
        String place = servletRequest.getParameter("place");

        // Presentation Logic

        PrintWriter writer = servletResponse .getWriter();
        writer.println("<html><body>" +
                "<h1>My Name is : "+name+ "I am From"+place +"</h1>");
        writer.close();
    }
}
