

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Product")
public class Product extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Product() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String prod_id = request.getParameter("txt_prod_id");
		String prod_name = request.getParameter("txt_prod_name");
		String prod_price = request.getParameter("txt_prod_price");
		HttpSession session=request.getSession();
		session.setAttribute("Product_Id", prod_id);
		session.setAttribute("Product_Name", prod_name);
		session.setAttribute("Product_Price", prod_price);
		response.sendRedirect("welcome.jsp");
	}
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
