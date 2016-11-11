package clases;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="mensajes")//tabla existente en la base de datos mensajes
public class Mensajes implements Serializable{
   private static final long serialVersionUID = 1L;
   @Id @GeneratedValue	
   private Long idMensaje;
   
   private String mensaje;
   
   @OneToOne
   private Usuario usuario;
   
   public Mensajes(){
	   
   }
   public Mensajes(String mensaje,Usuario usuario){
	   this.mensaje=mensaje;
	   this.usuario=usuario;
   }	   
   public Usuario getUsuario() {
	return usuario;
   }
   public void setUsuario(Usuario usuario) {
	this.usuario = usuario;
   }
   public Long getIdMensaje() {
	   return idMensaje;
   }
   public void setIdMensaje(Long idMensaje) {
	   this.idMensaje = idMensaje;
   }
   public String getMensaje() {
	   return mensaje;
   }
   public void setMensaje(String mensaje) {
	   this.mensaje = mensaje;
   }
   
   
   
}
