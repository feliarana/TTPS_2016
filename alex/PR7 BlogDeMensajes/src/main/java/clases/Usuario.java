package clases;

public class Usuario {
  private int idUsuario;//id por ahora no lo uso
  private String usuario;
  private String contrasenia;
  
  
  public Usuario(int idUsuario,String contrasenia,String usuario){
	  this.idUsuario=idUsuario;
	  this.usuario=usuario;
	  this.contrasenia=contrasenia;
  }
  public Usuario(){
	  
  }
  public int getId() {
	return idUsuario;
  }
  public void setId(int id) {
	this.idUsuario = id;
  }
  public String getUsuario() {
	return usuario;
  }
  public void setUsuario(String usuario) {
	  this.usuario = usuario;
  }
  public String getContrasenia() {
	  return contrasenia;
  }
  public void setContrasnia(String contrasenia) {
	  this.contrasenia = contrasenia;
  }

}
