package entrega1;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ListenerContexto implements ServletContextListener{
   @Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

private ServletContext context=null;
   
   public void contextInitialized(ServletContextEvent event){
	  context= event.getServletContext();
	  context.setAttribute("Las musicletas", 0);//guarda el contexto de la aplicacion
	  context.setAttribute("Las taradas",0);
	  context.setAttribute("La minga", 0);
	  context.setAttribute("Okupas del anden", 0);
	  context.setAttribute("visitantes", 0);
   }
   
}
