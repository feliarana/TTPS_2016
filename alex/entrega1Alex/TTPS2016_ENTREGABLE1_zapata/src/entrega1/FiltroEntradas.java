package entrega1;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;


@WebFilter(
		urlPatterns={"/ImprimeEntrada"},
		dispatcherTypes = {DispatcherType.REQUEST}
		)
public class FiltroEntradas implements Filter {
    private String seleccionado;
    public FiltroEntradas() {
       
    }

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req=(HttpServletRequest)request;
		if(req.getParameter("select") != null){
		  ServletContext context= req.getServletContext();
		  int val;
		  String seleccionado=req.getParameter("select");
		  val=(int)context.getAttribute(seleccionado);
		  val=val +1;
		  context.setAttribute(seleccionado,val);
		}
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
