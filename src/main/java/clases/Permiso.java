package clases;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="permiso")//nombre de la tabla en la bd
public class Permiso {
	
	@Id@GeneratedValue
	private int idPermiso; 
	private Cartelera cartelera;
	private Usuario usuario;
	private int permisoEscritura; //
	
	public Permiso(){}
	
	public Cartelera getCartelera() {
		return cartelera;
	}
	public void setCartelera(Cartelera cartelera) {
		this.cartelera = cartelera;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public int getPermiso() {
		return permisoEscritura;
	}
	public void setPermiso(int permiso) {
		this.permisoEscritura = permiso;
	}

	public int getIdPermiso() {
		return idPermiso;
	}

	public void setIdPermiso(int idPermiso) {
		this.idPermiso = idPermiso;
	}
	
	
}
