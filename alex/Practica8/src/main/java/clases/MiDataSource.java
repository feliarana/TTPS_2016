package clases;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MiDataSource {
  private static DataSource dataSource=null;
  static{
	try{
		try{
		  Class.forName("com.mysql.jdbc.Driver");//testea si encuentra la clase
		  System.out.println("Se encontro jar");
		}catch(Exception e ){ 
			System.out.println("No se encontro driver");
		}
		dataSource=(DataSource)new InitialContext().lookup("java:/comp/env/jdbc/MySQLDS");
	}catch(javax.naming.NamingException e){
		System.out.println("Error de nombre"+e.getMessage());
	}
  }
  public static DataSource getDataSource(){
	  return dataSource;
  }
}
