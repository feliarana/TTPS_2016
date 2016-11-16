package clases;

import implementacionesDAO.UsuarioDAOjdbc;
import interfacesDAO.UsuarioDAO;

public class FactoryDAO {

	public static UsuarioDAO getUsuarioDAO(){
		return new UsuarioDAOjdbc();
	}

}
