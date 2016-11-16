package clases;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="alumno")//nombre de la tabla en la bd
public class Alumno extends Usuario{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Notificacion> intereses;
	
	public Alumno() {}
	
	public List<Notificacion> getIntereses() {
		return intereses;
	}

	public void setIntereses(List<Notificacion> intereses) {
		this.intereses = intereses;
	}
   
}
