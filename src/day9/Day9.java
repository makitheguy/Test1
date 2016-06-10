package day9;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Test1.UserDAO;
/**
 * Servlet implementation class Day9
 */
@WebServlet("/Day9")
public class Day9 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String User_ID = null;

    /**
     * Default constructor. 
     */
    public Day9() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");  
		          
		    String User_ID=request.getParameter("User_ID");  
		    UserDAO obj=new UserDAO();
		    String password=request.getParameter("password");
		    if( (obj.isvalidcredentials(User_ID, password) ==true)
		    		{ RequestDispatcher rd=request.getRequestDispatcher("servlet2");  
		        rd.forward(request,response);  
		    }  
		    else{  
		    	PrintWriter out=response.getWriter();
		        out.print("Sorry username or password error");  
		        RequestDispatcher rd=request.getRequestDispatcher("NewFile.html");  
		        rd.include(request,response);  
		    }  
		          
		    doGet(request,response); 
		    }  
	}
		