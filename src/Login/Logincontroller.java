package Login;

import java.net.Authenticator;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Logincontroller extends HttpServlet{
	private static final long serialVersionUID= 1L;
	public Logincontroller(){
		super();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException{
		
		String username= request.getParameter("username");
		String password= request.getParameter("password");
		RequestDispatcher rd=null;
		
		Authenticator autheticator = new Authenticator();
		String result =autheticator.authenticate(username, password);
				if(result.equals("sucess")){
					rd= request.getRequestDispatcher("/sucess.jsp");
					User user = new User(username, password);
					request.setAttribute("user", user);
					
				}else{
					rd=request.getRequestDispatcher("/error.jsp");
					
				}
				rd.forward(request, response);
		
		
	}

}
