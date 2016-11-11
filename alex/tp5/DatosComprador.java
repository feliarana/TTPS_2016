package tp5;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DatosComprador
 */
@WebServlet("/DatosComprador")
public class DatosComprador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DatosComprador() {
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

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession s= request.getSession();
		Cotizacion c=(Cotizacion)s.getAttribute("bean");
		c.setDueño(request.getParameter("dueño"));
		c.setSexo(request.getParameter("sexo"));
		c.setFecha(request.getParameter("añoNacimiento"));
		c.setTelefono(request.getParameter("telefono"));
		c.setEmail(request.getParameter("email"));
		s.setAttribute("bean", c);
		RequestDispatcher dispatcher= getServletContext().getRequestDispatcher("/cobertura.jsp");
		dispatcher.forward(request,response);
	}

}
