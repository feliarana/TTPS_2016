package entrega1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EstadisticaDescuento
 */
@WebServlet("/EstadisticaDescuento")
public class EstadisticaDescuento extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EstadisticaDescuento() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		ServletContext context= request.getServletContext();
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<head><body>");
		out.println("Las musicletas:"+context.getAttribute("Las musicletas"));
		out.println("Las taradas:"+context.getAttribute("Las taradas"));
		out.println("La minga:"+context.getAttribute("La minga"));
		out.println("Okupas del anden:"+context.getAttribute("Okupas del anden"));
		out.println("</html></body>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
