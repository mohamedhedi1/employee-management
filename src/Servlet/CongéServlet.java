package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import dao.CongeDaoImp;
import dao.EmployeDaoImp;
import entities.Administrateur;

import entities.Conge;
import entities.Employe;

/**
 * Servlet implementation class CongéServlet
 */
@WebServlet("/CongéServlet")
public class CongéServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CongéServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session =request.getSession(false);
		Administrateur user =(Administrateur) session.getAttribute("userad");
		CongeDaoImp adi = new  CongeDaoImp();
		List<Conge> listavance =adi.ListCongeByAcceptation(0);
		
		request.setAttribute("listavance", listavance);
		
		EmployeDaoImp pub = new EmployeDaoImp();
		List<Employe> listemploye= pub.ListEmploye();
		request.setAttribute("listemploye", listemploye);
		request.getRequestDispatcher("/congés.jsp").forward(request,response);
	}

	

}
