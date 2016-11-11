package entrega1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
		urlPatterns={"/index.html", "/GeneraFormulario"},
		initParams={@WebInitParam(name="obra1",value="Las musicletas"),
				    @WebInitParam(name="obra2",value="Las taradas"),
				    @WebInitParam(name="obra3",value="La minga"),
				    @WebInitParam(name="obra4",value="Okupas del andén")
		            }
		)

public class GeneraFormulario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GeneraFormulario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		out.println("<html><head><title>Formulario</title></head>");
		out.println("<body>");
		out.println("<form action='ImprimeEntrada' method='post'>");
		out.println("<label for='nombre'> Nombres: </label><input name='nombre' type='text' id='nombre'><br>");
		out.println("<label for='apellido'> Apellido: </label><input name='apellido' type='text' id='apellido'><br>");
		out.println("<label for='email'> Email: </label><input name='email' type='email' id='email'><br>");
		out.println("<label for='dni'> DNI: </label><input name='dni' type='number' id='dni'><br>");
		out.println("<label for='obras'> Obras: </label>");
		out.println("<select name='select' id='select'>");
		out.println("<option value='Las musicletas'>"+this.getServletConfig().getInitParameter("obra1")+"</option>");
		out.println("<option value='Las taradas'>"+this.getServletConfig().getInitParameter("obra2")+"</option>");
		out.println("<option value='La minga'>"+this.getServletConfig().getInitParameter("obra3")+"</option>");
		out.println("<option value='Okupas del anden'>"+this.getServletConfig().getInitParameter("obra4")+"</option>");
		out.println("</select><br>");
		out.println("<input type='submit' value='Pedir entrada'>");
		out.println("</form>");
		out.println("<a href='EstadisticaDescuento'>Estadisticas</a></body></html>");
		out.close();	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
