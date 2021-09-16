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
import entities.Conge;
import entities.Employe;

/**
 * Servlet implementation class CongeRefuse
 */
@WebServlet("/CongeRefuse")
public class CongeRefuse extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CongeRefuse() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session =request.getSession(false);
		Employe user =(Employe) session.getAttribute("user0");
		CongeDaoImp avd =new CongeDaoImp();
		List<Conge> Listavance=avd.ListCongeByAcceptationEmp(user.getPrenome()+" "+user.getNome(),-1);
		request.setAttribute("Listavance", Listavance);
	
		
		request.getRequestDispatcher("/CongeRefuse.jsp").forward(request,response);
	}

	

}
