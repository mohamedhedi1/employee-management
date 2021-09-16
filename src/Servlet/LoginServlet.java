package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.AdminDaoImp;
import dao.EmployeDaoImp;
import entities.Administrateur;
import entities.Employe;




@WebServlet("/LoginServlet")


public class LoginServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
	@Override
	protected void doGet(HttpServletRequest r, HttpServletResponse response) throws ServletException, IOException {
		HttpSession  session = r.getSession(false);
		
		
		r.getRequestDispatcher("/LoginServlet").forward(r,response);
	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String username= request.getParameter("username");
	System.out.print("*************************"+username);
	String password= request.getParameter("password");
	System.out.print("*************************"+password);
	/*if(username=="mohamed@gmail.com" && password=="123456789")
	{
		Administrateur ad=new Administrateur(1,"Hamdi","MohamedHedi","mohamed@gmail.com","123456789");
		HttpSession session = request.getSession();
		session.setAttribute("userad",ad );
		
		request.getRequestDispatcher("/HomeServletAdmin").forward(request,response);
		
		
	}else
	{*/
		Employe us=new Employe();
		us.setEmail(username);
		us.setMotpasse(password);
		EmployeDaoImp ut= new EmployeDaoImp(); 
		boolean f=ut.login(us);
		if(f==true)
		{
			Employe user=ut.profile(us);
			HttpSession session = request.getSession();
			session.setAttribute("user0", user);
			
			request.getRequestDispatcher("/HomeServletUser").forward(request,response);
		}
		else 
		{
			Administrateur ad =new Administrateur();
			ad.setEmailad(username);
			ad.setMotpassead(password);
			AdminDaoImp at=new AdminDaoImp();
			boolean v=at.login(ad);
			if(v==true)
			{
				Administrateur admin=at.profile(ad);
				System.out.println(admin.toString());
				HttpSession session = request.getSession();
				session.setAttribute("userad", admin);
				request.getRequestDispatcher("/employeServlet").forward(request,response);
			}
		else
		{
			HttpSession  session = request.getSession();
			session.setAttribute("login-failed","Invalide email ou mot de passe");
			response.sendRedirect("login.jsp");
		}
		
	}
	}
}



	
	



