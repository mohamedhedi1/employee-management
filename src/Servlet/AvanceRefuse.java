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
import entities.Avance;
import entities.Employe;

/**
 * Servlet implementation class AvanceRefusé
 */
@WebServlet("/AvanceRefuse")
public class AvanceRefuse extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AvanceRefuse() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session =request.getSession(false);
		Employe user =(Employe) session.getAttribute("user0");
		AvanceDaoImp avd =new AvanceDaoImp();
		String nom=user.getPrenome()+" "+user.getNome();
		List<Avance> Listavance=avd.ListAvanceByAcceptationEmp(-1,nom);
		request.setAttribute("Listavance", Listavance);
	
		
		request.getRequestDispatcher("/AvanceRefusé.jsp").forward(request,response);
	}

	

}
