package implementacionesDAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import clases.Mensajes;
import clases.Usuario;
import interfacesDAO.MensajeDAO;


public class MensajeDAOjdbc implements MensajeDAO{

	public void agregarMensaje(String msj,Usuario usuario){
	  EntityManagerFactory emf=Persistence.createEntityManagerFactory("miPersistencia");
	  EntityManager em=emf.createEntityManager();
	  Mensajes msjNuevo= new Mensajes(msj,usuario);//mensaje a persistir
	  em.getTransaction().begin();
	  em.persist(msjNuevo);
	  em.getTransaction().commit();
	  em.close();
	}
	public List<Mensajes> mostrarMensajes(){
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("miPersistencia");
		EntityManager em= emf.createEntityManager();
		Query q=em.createQuery("SELECT m FROM clases.Mensajes m");
		@SuppressWarnings("unchecked")
		List<Mensajes> mensajes=(List<Mensajes>)q.getResultList();
		return mensajes;
	}
}
