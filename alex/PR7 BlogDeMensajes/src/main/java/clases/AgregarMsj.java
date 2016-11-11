package clases;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import interfacesDAO.MensajeDAO;

@WebServlet("/AgregarMsj")
public class AgregarMsj extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgregarMsj() {
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
		RequestDispatcher dispatcher= getServletContext().getRequestDispatcher("/visualizarMensajes.jsp");
		MensajeDAO msjDAO=FactoryDAO.getMensajeDAO();
		HttpSession s=request.getSession();
		Usuario usuarioActual=(Usuario)s.getAttribute("habilitado");
		int idUsuario=usuarioActual.getId();
		msjDAO.agregarMensaje(request.getParameter("mensaje"),idUsuario);
		s.setAttribute("mensajes",msjDAO.mostrarMensajes());
		dispatcher.forward(request,response);
	}

}
