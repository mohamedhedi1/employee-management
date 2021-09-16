package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import dao.CongeDaoImp;
import entities.Administrateur;

import entities.Conge;

/**
 * Servlet implementation class EditCongé
 */
@WebServlet("/EditCongé")
public class EditCongé extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditCongé() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session =request.getSession(false);
		Administrateur user =(Administrateur) session.getAttribute("userad");
		Conge av=new Conge();
		av.setNumc(Integer.parseInt(request.getParameter("numa")));
		int acc=Integer.parseInt(request.getParameter("ref"));
		CongeDaoImp avd =new CongeDaoImp();
		avd.EditConge(av, acc);
		this.getServletContext().getRequestDispatcher("/CongéServlet").forward(request,response);
	}

}
