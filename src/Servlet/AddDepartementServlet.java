package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dao.DepartementDaoImp;
import entities.Administrateur;
import entities.Departement;

/**
 * Servlet implementation class AddDepartementServlet
 */
@WebServlet("/AddDepartementServlet")
public class AddDepartementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddDepartementServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Departement dep=new Departement();
		String nomd=request.getParameter("nomd");
		dep.setNomd(nomd);
		String directeurd =request.getParameter("directeurd");
		dep.setDirecteurd(directeurd);
		String teld=request.getParameter("teld");
		dep.setTeld(teld);
		int faxd=Integer.parseInt(request.getParameter("faxd"));
		dep.setFaxd(faxd);
		String emaild=request.getParameter("emaild");
		dep.setEmaild(emaild);
		DepartementDaoImp ddi =new DepartementDaoImp();
		System.out.println(dep.toString());
		boolean f=ddi.AddDepartement(dep);
		if(f==true)
		{
		this.getServletContext().getRequestDispatcher("/DepartementServlet").forward(request,response);
		}
		
	}

}
