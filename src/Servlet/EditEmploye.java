package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.EmployeDaoImp;
import entities.Administrateur;
import entities.Employe;

/**
 * Servlet implementation class EditEmploye
 */
@WebServlet("/EditEmploye")
public class EditEmploye extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public EditEmploye() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Employe emp=new Employe();
		emp.setNome(request.getParameter("nome"));
		emp.setPrenome(request.getParameter("prenome"));
		emp.setSexe(request.getParameter("sexe"));
		emp.setCine(request.getParameter("cine"));
		emp.setAdre(request.getParameter("adre"));
		emp.setAge(Integer.parseInt(request.getParameter("age")));
		emp.setDated(request.getParameter("dated"));
		emp.setDatef(request.getParameter("datef"));
		emp.setSalaire(Float.parseFloat(request.getParameter("salaire")));
		emp.setNomb(request.getParameter("nomb"));
		emp.setIban(request.getParameter("iban"));
		
		//emp.setNumd();
		emp.setNumd(Integer.parseInt(request.getParameter("numd")));
		
		
		emp.setPositione(request.getParameter("positione"));
		emp.setEmail(request.getParameter("email"));
		emp.setMotpasse(request.getParameter("motpasse"));
		emp.setStatus(request.getParameter("status"));
		emp.setTele(request.getParameter("tele"));
		emp.toString();
		EmployeDaoImp eid =new EmployeDaoImp();
		eid.EditEmploye(emp);
		this.getServletContext().getRequestDispatcher("/employeServlet").forward(request,response);
		
	}

}
