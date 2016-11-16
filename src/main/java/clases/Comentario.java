package clases;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name="comentario")//nombre de la tabla en la bd

public class Comentario {
//	@Id@GeneratedValue
	private int idComentario;
	private String contenido;
	private Publicacion publicacion;
	private Usuario idUsuario;
	
	public Usuario getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Usuario idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Comentario(){}
   
   public String getContenido() {
	   return contenido;
   }
   public int getIdComentario() {
	return idComentario;
}

public void setIdComentario(int idComentario) {
	this.idComentario = idComentario;
}

public void setContenido(String contenido) {
	   this.contenido = contenido;
   }

   public Publicacion getPublicacion() {
	   return publicacion;
   }
   public void setPublicacion(Publicacion publicacion) {
	   this.publicacion = publicacion;
   }
   public Usuario getUsuario() {
	   return idUsuario;
   }
   public void setUsuario(Usuario usuario) {
	   this.idUsuario = usuario;
   }

   
}
