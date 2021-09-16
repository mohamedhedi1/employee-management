package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmployeDaoImp;

/**
 * Servlet implementation class DeleteEmploye
 */
@WebServlet("/DeleteEmploye")
public class DeleteEmploye extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteEmploye() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int numd =Integer.parseInt(request.getParameter("numd"));
		EmployeDaoImp ddi =new EmployeDaoImp();
		if(ddi.DeleteEmploye(numd))
		{
			this.getServletContext().getRequestDispatcher("/employeServlet").forward(request,response);
			}
	}

}
