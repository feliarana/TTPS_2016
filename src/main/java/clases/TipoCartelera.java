package clases;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name="tipoCartelera")//nombre de la tabla en la bd
public class TipoCartelera {
//	@Id@GeneratedValue
	private int idTipoCartelera;
    private String nombreTipo;
    public TipoCartelera(){}

	public String getNombreTipo() {
		return nombreTipo;
	}

	public void setNombreTipo(String nombreTipo) {
		this.nombreTipo = nombreTipo;
	}

	public int getIdTipoCartelera() {
		return idTipoCartelera;
	}

	public void setIdTipoCartelera(int idTipoCartelera) {
		this.idTipoCartelera = idTipoCartelera;
	}
    
    
}
