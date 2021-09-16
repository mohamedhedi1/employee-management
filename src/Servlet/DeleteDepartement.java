package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DepartementDaoImp;

/**
 * Servlet implementation class DeleteDepartement
 */
@WebServlet("/DeleteDepartement")
public class DeleteDepartement extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteDepartement() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int numd =Integer.parseInt(request.getParameter("numd"));
		DepartementDaoImp ddi =new DepartementDaoImp();
		if(ddi.DeleteDepartement(numd))
		{
			this.getServletContext().getRequestDispatcher("/DepartementServlet").forward(request,response);
			}
	}

}
