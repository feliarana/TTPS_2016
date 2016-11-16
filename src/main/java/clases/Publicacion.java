package clases;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="publicacion")//nombre de la tabla en la bd
public class Publicacion {
	
	@Id@GeneratedValue
	private int idPublicacion;
	private String titulo;
	private String contenido;//info de la publicacion
	private Usuario id;
  
	public Publicacion(){}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Usuario getId() {
		return id;
	}

	public void setId(Usuario id) {
		this.id = id;
	}

	public String getContenido() {
		return contenido;
	}
	
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public int getIdPublicacion() {
		return idPublicacion;
	}

	public void setIdPublicacion(int idPublicacion) {
		this.idPublicacion = idPublicacion;
	}
	
}
