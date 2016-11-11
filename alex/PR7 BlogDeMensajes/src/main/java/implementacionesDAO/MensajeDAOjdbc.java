package implementacionesDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import clases.Mensajes;
import clases.MiDataSource;
import clases.Usuario;
import interfacesDAO.MensajeDAO;

public class MensajeDAOjdbc implements MensajeDAO{

	public int agregarMensaje(String msj,int usuario){
	  String msjNuevo="INSERT INTO mensajes (mensaje,idUsuario) VALUES ('"+msj+"','"+usuario+"')";//mensaje a insertar
	  int res=0;
	  try{	
        Connection con=MiDataSource.getDataSource().getConnection();
        Statement st=con.createStatement();
        res=st.executeUpdate(msjNuevo);
        st.close();//cierre del statement
        con.close();//cierre de conexion
	  }catch(java.sql.SQLException e){
		  System.out.println("Error de sql:"+e.getMessage());
	  }
	  return res;//si res =1 pudo insertar
	}
	public List<Mensajes> mostrarMensajes(){
		List<Mensajes> mensajes=new ArrayList<Mensajes>();
		try{
			Connection con= MiDataSource.getDataSource().getConnection();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("SELECT * FROM mensajes INNER JOIN usuarios ON(mensajes.idUsuario=usuarios.idUsuario)");
			while(rs.next() == true){//si devuelve una fila valida
				Usuario user=new Usuario(rs.getInt("mensajes.idUsuario"),rs.getString("contrasenia"),rs.getString("usuario"));
				Mensajes msjActual=new Mensajes(rs.getInt("idMensaje"),rs.getString("mensaje"),user);
				mensajes.add(msjActual);
			}
			rs.close();//cierre del resultset
			st.close();//cierre del statement
			con.close();//cierre de conexion
		}catch(java.sql.SQLException e){//si no se pudo establecer conexion salta esta excepcion
			System.out.println("Error de sql:"+e.getMessage());
		}
		return mensajes;
	}
}
