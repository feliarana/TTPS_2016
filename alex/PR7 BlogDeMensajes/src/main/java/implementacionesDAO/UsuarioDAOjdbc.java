package implementacionesDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import clases.MiDataSource;
import clases.Usuario;
import interfacesDAO.UsuarioDAO;

public class UsuarioDAOjdbc implements UsuarioDAO{

	public Usuario encontrarUsuario(String contrasenia,String usuario){
		Usuario user=null;
		try{
			Connection con= MiDataSource.getDataSource().getConnection();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("SELECT * FROM usuarios WHERE usuario='"+usuario+"' AND contrasenia='"+contrasenia	+"'");
			if(rs.next() == true){//si devuelve una fila valida
				user=new Usuario(rs.getInt("idUsuario"),contrasenia,usuario);
			}
			rs.close();//cierre del resultset
			st.close();//cierre del statement
			con.close();//cierre de conexion
		}catch(java.sql.SQLException e){//si no se pudo establecer conexion salta esta excepcion
			System.out.println("Error de sql:"+e.getMessage());
		}
		return user;
	}
}
