package Servlet;

import java.io.IOException;
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
 * Servlet implementation class demandeAvance
 */
@WebServlet("/demandeAvance")
public class demandeAvance extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public demandeAvance() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session =request.getSession(false);
		Employe user =(Employe) session.getAttribute("user0");
		String nom=user.getNome();
		String prenom=user.getPrenome();
		Avance av = new Avance();
		av.setMontant(Float.parseFloat(request.getParameter("montant")));
		av.setMois(request.getParameter("numd"));
		av.setNume(prenom+" "+nom);
		av.setAcceptationa(0);
		AvanceDaoImp avd=new AvanceDaoImp();
		avd.AddAvance(av);
		request.getRequestDispatcher("/HomeServletUser").forward(request,response);
		
		
	}

}
