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
import entities.Administrateur;
import entities.Avance;
import entities.Employe;

/**
 * Servlet implementation class HomeServletUser
 */
@WebServlet("/HomeServletUser")
public class HomeServletUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeServletUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session =request.getSession(false);
		Employe user =(Employe) session.getAttribute("user0");
		AvanceDaoImp avd =new AvanceDaoImp();
		List<Avance> Listavance=avd.ListAvanceByAcceptationEmp(1,user.getPrenome()+" "+user.getNome());
		request.setAttribute("Listavance", Listavance);
	
		
		request.getRequestDispatcher("/employeAvance.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
