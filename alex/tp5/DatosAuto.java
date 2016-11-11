package tp5;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/DatosAuto")

public class DatosAuto extends HttpServlet {
	private static final long serialVersionUID = 1L;  
	Cotizacion c=new Cotizacion();
	
    public DatosAuto() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		c.setMarca(request.getParameter("marca"));
		c.setModelo(request.getParameter("modelo"));
		c.setAño(request.getParameter("añoElegido"));
		c.setKm(request.getParameter("kilometroElegido"));
		HttpSession s=request.getSession();
		s.setAttribute("bean", c);
	    RequestDispatcher dispatcher= getServletContext().getRequestDispatcher("/comprador.jsp");
		dispatcher.forward(request,response);	
	}

}
