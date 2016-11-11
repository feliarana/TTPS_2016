package clases;

public class Mensajes {
   private int idMensaje;
   private String mensaje;
   private int idUsuario;
   private Usuario usuario;
   
   public Mensajes(int id,String mensaje,Usuario usuario){
	   this.idMensaje=id;
	   this.mensaje=mensaje;
	   this.idUsuario=usuario.getId();
	   this.usuario=usuario;
   }	   
   public Usuario getUsuario() {
	return usuario;
   }
   public void setUsuario(Usuario usuario) {
	this.usuario = usuario;
   }
   public int getIdMensaje() {
	   return idMensaje;
   }
   public void setIdMensaje(int idMensaje) {
	   this.idMensaje = idMensaje;
   }
   public String getMensaje() {
	   return mensaje;
   }
   public void setMensaje(String mensaje) {
	   this.mensaje = mensaje;
   }
   public int getIdUsuario() {
	   return idUsuario;
   }
   public void setIdUsuario(int idUsuario) {
	   this.idUsuario = idUsuario;
   }
   
   
}
