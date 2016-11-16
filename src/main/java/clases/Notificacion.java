package clases;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="notificacion")//nombre de la tabla en la bd
public class Notificacion {
	
	@Id@GeneratedValue
	private int idNotificacion;
	private String tipoNotificacion;
	private Usuario id;
	public Notificacion() {}

	public String getTipoNotificacion() {
		return tipoNotificacion;
	}
	public void setTipoNotificacion(String tipoNotificacion) {
		this.tipoNotificacion = tipoNotificacion;
	}
	public Usuario getId() {
		return id;
	}
	public void setId(Usuario id) {
		this.id = id;
	}

	public int getIdNotificacion() {
		return idNotificacion;
	}

	public void setIdNotificacion(int idNotificacion) {
		this.idNotificacion = idNotificacion;
	}
	
}
