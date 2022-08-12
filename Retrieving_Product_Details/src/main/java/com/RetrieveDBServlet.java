package com;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RetrieveDBServlet")
public class RetrieveDBServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out= resp.getWriter();
		resp.setContentType("text/html");
		String  param=req.getParameter("txtid");
		int  id=  Integer.parseInt(param);
		Connection conn= DBconfig.getConnection();
		if(conn!=null) {
			Statement stmt;
			try {
				resp.setContentType("text/html");
				Connection con=DBconfig.getConnection();
				int pid=Integer.parseInt(req.getParameter("txtid"));
				String query="select * from Product where Prod_id=?";     
				PreparedStatement st=  con.prepareStatement(query);
				st.setInt(1, id);
				ResultSet rs =st.executeQuery();
				out.print("<h3>Displaying the Particular Product Details...</h3>");	
				if(rs.next()) {
					out.print("<table border=1 cellpadding=10 cellspacing=0> <thead><tr>");
					out.print("<th>ID</th><th>NAME</th><th>PRICE</th><th>QUANTITY</th>");
					out.print("<tr></thead>");
					out.print("<tbody>");
		    	    out.println("<tr>");
					out.print("<td>"+rs.getInt("Prod_id")+"</td>");
					out.print("<td>"+rs.getString("Prod_name")+"</td>");
					out.print("<td>"+rs.getFloat("price")+"</td>");
					out.print("<td>"+rs.getInt("quantity")+"</td>");
					out.println("</tr>");	    	    	  
				}	   
				out.print("</tbody></table>");
				con.close();			
				}		
			catch(Exception e){	
				System.out.println("Some Issue : "+ e.getMessage());
				}		
			}
		else {	
			out.print("Error While Connecting Connections");
		}	
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}