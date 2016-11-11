package implementacionesDAO;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import clases.Usuario;
import interfacesDAO.UsuarioDAO;

public class UsuarioDAOjdbc implements UsuarioDAO{

	public Usuario encontrarUsuario(String contraseña,String usuario){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("miPersistencia");
		EntityManager em= emf.createEntityManager();
		Usuario user=null;
		Query q=em.createQuery("SELECT u FROM clases.Usuario u WHERE  u.usuario=:usu AND u.contraseña=:con");
		q.setParameter("usu",usuario);
		q.setParameter("con",contraseña);
		@SuppressWarnings("unchecked")//suprime una advertencia
		List<Usuario> usuarios=(List<Usuario>)q.getResultList();
		if(usuarios.size() > 0){
			user=usuarios.get(0);
		}
		return user;
	}
}
