package interfacesDAO;

import java.util.List;

import clases.Mensajes;
import clases.Usuario;

public interface MensajeDAO {
  public void agregarMensaje(String msj,Usuario usuario);
  public List<Mensajes> mostrarMensajes();
}
