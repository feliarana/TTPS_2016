package clases;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name="template")//nombre de la tabla en la bd
public class Template {

//	@Id@GeneratedValue
	private int idTemplate; 
	private int cantidadCarteleras; // cantidad expuestas en las paginas
	public Template(){}

	public int getCantidadCarteleras() {
		return cantidadCarteleras;
	}
	public void setCantidadCarteleras(int cantidadCarteleras) {
		this.cantidadCarteleras = cantidadCarteleras;
	}

	public int getIdTemplate() {
		return idTemplate;
	}

	public void setIdTemplate(int idTemplate) {
		this.idTemplate = idTemplate;
	}
	
}
