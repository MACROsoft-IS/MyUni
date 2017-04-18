package es.ucm.fdi.negocio;

import es.ucm.fdi.integracion.TOSesion;
import es.ucm.fdi.integracion.TOUsuario;
import es.ucm.fdi.integracion.TOUsuarioImp;

public class ASGestionCuentaImp {

	public TOSesion iniciarSesion(String correo, String contrasena) {

		// crear objeto generico read Dao
		TOSesion sesion = null;
		TOUsuario usuario = read(correo);

		if (!usuario.equals(null) && usuario.getContrasena().equals(contrasena))

			// la clase Dao debe se estatica??
			sesion = CreateSesion(usuario);

		return sesion;
	}

	public boolean crearCuenta(String nombre, String correo, String contrasena) {

		boolean cuenta = false;

		//metodo estaticos del dao??
		if (read(correo).equals(null)) {
			TOUsuarioImp usuario = new TOUsuarioImp(nombre, correo, contrasena);
			create(usuario);
			cuenta = true;
		}
		return cuenta;
	}

}
