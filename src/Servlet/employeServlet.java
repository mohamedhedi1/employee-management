package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DepartementDaoImp;
import dao.EmployeDaoImp;
import entities.Administrateur;
import entities.Departement;
import entities.Employe;

/**
 * Servlet implementation class employeServlet
 */
@WebServlet("/employeServlet")
public class employeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public employeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session =request.getSession(false);
		Administrateur user =(Administrateur) session.getAttribute("userad");
		EmployeDaoImp pub = new EmployeDaoImp();
		List<Employe> listemploye= pub.ListEmploye();
		for(Employe emp:listemploye)
		{
			System.out.println(emp.toString());
		}
		request.setAttribute("listemploye", listemploye);
		DepartementDaoImp pub1 = new DepartementDaoImp();
		List<Departement> listdepartement= pub1.listdepartement();
		request.setAttribute("listdepartement", listdepartement);
	
		request.getRequestDispatcher("/employeliste.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
