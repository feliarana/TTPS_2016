package interfacesDAO;

import java.util.List;
import clases.Mensajes;

public interface MensajeDAO {
  public int agregarMensaje(String msj,int usuario);
  public List<Mensajes> mostrarMensajes();
}
