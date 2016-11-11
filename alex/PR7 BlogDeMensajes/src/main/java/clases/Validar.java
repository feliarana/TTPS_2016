package clases;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import interfacesDAO.UsuarioDAO;

/**
 * Servlet implementation class Validar
 */
@WebServlet("/Validar")
public class Validar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Validar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher= null;
		String resultado;
		UsuarioDAO uDAO=FactoryDAO.getUsuarioDAO();
		Usuario u = uDAO.encontrarUsuario(request.getParameter("contrasenia"), request.getParameter("usuario"));
		if(u != null){//si el usuario y contrasenia son validos
			HttpSession sesion=request.getSession();
			sesion.setAttribute("habilitado",u);
			resultado="/index.html";
		}else{
			resultado="/login.jsp";
		}
		dispatcher=getServletContext().getRequestDispatcher(resultado);
		dispatcher.forward(request, response);
	}

}
