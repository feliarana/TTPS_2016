package servlets;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import clases.FactoryDAO;
import interfacesDAO.UsuarioDAO;


/**
 * Servlet implementation class MostrarMensaje
 */
@WebServlet(
		urlPatterns={"/index.html", "/Index"}
		)
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Index() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher= getServletContext().getRequestDispatcher("/index.jsp");
		HttpSession s=request.getSession();
		
		//UsuarioDAO msjDAO=FactoryDAO.getUsuarioDAO();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("cartelera");
		EntityManager em= emf.createEntityManager();
		
		dispatcher.forward(request,response);
	}

}
