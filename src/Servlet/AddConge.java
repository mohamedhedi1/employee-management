package Servlet;

import java.io.IOException;
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
 * Servlet implementation class AddConge
 */
@WebServlet("/AddConge")
public class AddConge extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddConge() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session =request.getSession(false);
		Employe user =(Employe) session.getAttribute("user0");
		String nom=user.getNome();
		String prenom=user.getPrenome();	
		Conge con=new Conge();
		con.setDatedc(request.getParameter("datedc"));
		con.setDatefc(request.getParameter("datefc"));
		con.setNume(prenom+" "+nom);
		con.setTypec(request.getParameter("typec"));
		con.setAcceptationc(0);
		CongeDaoImp cdi =new CongeDaoImp();
		cdi.AddConge(con);
		request.getRequestDispatcher("/CongeAccepte").forward(request,response);
		
	}

}
