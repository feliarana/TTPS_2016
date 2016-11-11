package clases;

import implementacionesDAO.MensajeDAOjdbc;
import implementacionesDAO.UsuarioDAOjdbc;
import interfacesDAO.MensajeDAO;
import interfacesDAO.UsuarioDAO;

public class FactoryDAO {

	public static UsuarioDAO getUsuarioDAO(){
		return new UsuarioDAOjdbc();
	}
	public static MensajeDAO getMensajeDAO(){
		return new MensajeDAOjdbc();
	}
}
