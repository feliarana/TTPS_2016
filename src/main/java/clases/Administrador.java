package clases;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="administrador")//nombre de la tabla en la bd

public class Administrador extends Usuario{

	private Template configuracion;//cada  admin va a tener una configuracion
	public Template getConfiguracion() {
		return configuracion;
	}
	public void setConfiguracion(Template configuracion) {
		this.configuracion = configuracion;
	}

}
