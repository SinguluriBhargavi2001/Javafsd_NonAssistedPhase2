package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        
        String email = req.getParameter("email");
        String pass = req.getParameter("pass");
        

        if(email.equals("admin") & pass.equals("admin@123"))
        {
            RequestDispatcher res = req.getRequestDispatcher("Welcome");
            res.forward(req, resp);
        }
        else
        {
           out.println("Username or Password incorrect");
           out.print("<br>");
           RequestDispatcher res = req.getRequestDispatcher("index.html");
           res.include(req, resp);
        }
	}

}