package com.xebia.hello;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorld extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01//EN\">");
        out.println("<title>Bonjour tout le monde!</title>");
        String env = System.getenv("env");
        if (env == null) {
            env = "No env defined";
        }
        out.println("<p>Hello environment YEAH !!!!!!! : " + env + "</p>");
    }

}
