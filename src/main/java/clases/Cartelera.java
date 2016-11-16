package clases;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name="cartelera")//nombre de la tabla en la bd
public class Cartelera {
	
//	@Id@GeneratedValue
	private int idCartelera;
	private int cantPublicacionesMax;
	private int cantPublicacionesActual;
	private String nombre;
	private TipoCartelera tipo;
	private Usuario usuario;
	
	public Cartelera(){}
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public TipoCartelera getTipo() {
		return tipo;
	}
	public void setTipo(TipoCartelera tipo) {
		this.tipo = tipo;
	}
	public int getCantPublicacionesMax() {
		return cantPublicacionesMax;
	}
	public void setCantPublicacionesMax(int cantPublicacionesMax) {
		this.cantPublicacionesMax = cantPublicacionesMax;
	}
	public int getCantPublicacionesActual() {
		return cantPublicacionesActual;
	}
	public void setCantPublicacionesActual(int cantPublicacionesActual) {
		this.cantPublicacionesActual = cantPublicacionesActual;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getIdCartelera() {
		return idCartelera;
	}

	public void setIdCartelera(int idCartelera) {
		this.idCartelera = idCartelera;
	}
	
	
}
