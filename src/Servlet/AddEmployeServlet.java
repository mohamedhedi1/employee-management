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
 * Servlet implementation class AddEmployeServlet
 */
@WebServlet("/AddEmployeServlet")
public class AddEmployeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmployeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session =request.getSession(false);
		Administrateur user =(Administrateur) session.getAttribute("userad");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session =request.getSession(false);
		Administrateur user =(Administrateur) session.getAttribute("userad");
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
		eid.AddEmploye(emp);
		this.getServletContext().getRequestDispatcher("/employeServlet").forward(request,response);
		
		
	}

}
