package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.AvanceDaoImp;
import entities.Administrateur;
import entities.Avance;

/**
 * Servlet implementation class EditAvance
 */
@WebServlet("/EditAvance")
public class EditAvance extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditAvance() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session =request.getSession(false);
		Administrateur user =(Administrateur) session.getAttribute("userad");
		Avance av=new Avance();
		av.setNuma(Integer.parseInt(request.getParameter("numa")));
		int acc=Integer.parseInt(request.getParameter("ref"));
		AvanceDaoImp avd =new AvanceDaoImp();
		avd.EditAvance(av, acc);
		this.getServletContext().getRequestDispatcher("/AvanceServlet").forward(request,response);
	}

}
