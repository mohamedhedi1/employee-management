package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.AvanceDaoImp;

import dao.EmployeDaoImp;
import entities.Administrateur;
import entities.Avance;

import entities.Employe;

/**
 * Servlet implementation class AvanceServlet
 */
@WebServlet("/AvanceServlet")
public class AvanceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AvanceServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session =request.getSession(false);
		Administrateur user =(Administrateur) session.getAttribute("userad");
		AvanceDaoImp adi = new  AvanceDaoImp();
		List<Avance> listavance =adi.ListAvanceByAcceptation(0);
		
		request.setAttribute("listavance", listavance);
		
		EmployeDaoImp pub = new EmployeDaoImp();
		List<Employe> listemploye= pub.ListEmploye();
		request.setAttribute("listemploye", listemploye);
		request.getRequestDispatcher("/avances.jsp").forward(request,response);
	}

	

}
