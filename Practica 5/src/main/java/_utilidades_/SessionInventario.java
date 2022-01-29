package _utilidades_;

import inventario.entidades.Usuario;
import _utilidades_.LecturaEscrituraArchivos;
/**
 * Clase que implementa los metodos de usuario manejo de sesión
 * @author alejandro.perez
 * @since 11/11/2021
 */
public class SessionInventario {
	LecturaEscrituraArchivos Lec = new LecturaEscrituraArchivos();
	public boolean login(Usuario user) {
		String resp= Lec.procesaArchivo("usuario.txt");
		if (resp.contains(user.getUserName()+"|"+user.getPassword())) {
			Lec.escribeArchivo("bitacoraAcceso.txt", user.stringBitacora());
			return true;
		}
		return false;
	}
}
