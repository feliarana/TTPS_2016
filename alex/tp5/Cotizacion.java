package tp5;

public class Cotizacion implements java.io.Serializable {
  private String marca;
  private String modelo;
  private String año;
  private String km;
  private String dueño;
  private String sexo;
  private String fecha;
  private String telefono;
  private String email;
  private String cobertura;
  private int cotizacion;
  
  public Cotizacion(){	  
  }
  public int calcularCotizacion(){
	  this.setCotizacion(800);
	  if(this.getMarca().equals("fiat")){
		  setCotizacion(getCotizacion() - 200);
	  }
	  if(this.getCobertura().equals("todoRiesgoTotal")){
		  setCotizacion(getCotizacion()+ 300);
	  }
	  return getCotizacion();
  }
  public int getCotizacion() {
	return cotizacion;
  }

  public void setCotizacion(int cotizacion) {
	  this.cotizacion = cotizacion;
  }

  public String getMarca() {
	  return marca;
  }

  public void setMarca(String marca) {
	  this.marca = marca;
  }

  public String getModelo() {
	  return modelo;
  }

  public void setModelo(String modelo) {
	  this.modelo = modelo;
  }

  public String getAño() {
	  return año;
  }

  public void setAño(String año) {
	  this.año = año;
  }

  public String getKm() {
	  return km;
  }

  public void setKm(String km) {
	  this.km = km;
  }

  public String getDueño() {
	  return dueño;
  }

  public void setDueño(String dueño) {
	  this.dueño = dueño;
  }

  public String getSexo() {
	  return sexo;
  }

  public void setSexo(String sexo) {
	  this.sexo = sexo;
  }

  public String getFecha() {
	  return fecha;
  }

  public void setFecha(String fecha) {
	  this.fecha = fecha;
  }

  public String getTelefono() {
	  return telefono;
  }

  public void setTelefono(String telefono) {
	  this.telefono = telefono;
  }

  public String getEmail() {
	  return email;
  }

  public void setEmail(String email) {
	  this.email = email;
  }

  public String getCobertura() {
	  return cobertura;
  }

  public void setCobertura(String cobertura) {
	  this.cobertura = cobertura;
  }

}
