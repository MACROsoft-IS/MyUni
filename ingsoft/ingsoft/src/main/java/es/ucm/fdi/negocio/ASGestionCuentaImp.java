package es.ucm.fdi.negocio;

import es.ucm.fdi.datos.BDMemoria;
import es.ucm.fdi.integracion.DAOSesionImp;
import es.ucm.fdi.integracion.DAOUsuarioImp;
import es.ucm.fdi.integracion.TOSesion;
import es.ucm.fdi.integracion.TOUsuario;
import es.ucm.fdi.integracion.TOUsuarioImp;

public class ASGestionCuentaImp {

	private DAOUsuarioImp usuarioDAO;
	private DAOSesionImp sesionDAO;
	public static BDMemoria<TOUsuario> bdCadenas;

	public ASGestionCuentaImp() {
		ASGestionCuentaImp.bdCadenas = new BDMemoria<TOUsuario>();
		this.sesionDAO = new DAOSesionImp();
		this.usuarioDAO = new DAOUsuarioImp();
	}

	public TOSesion iniciarSesion(String correo, String contrasena) {

		TOSesion sesion = null;
		TOUsuario usuario = usuarioDAO.read(correo);

		if (!usuario.equals(null) && usuario.getContrasena().equals(contrasena))

			sesion = sesionDAO.createSesion(usuario);

		return sesion;
	}

	public BDMemoria<TOUsuario> getBdCadenas() {
		return bdCadenas;
	}

	public void setBdCadenas(BDMemoria<TOUsuario> bdCadenas) {
		ASGestionCuentaImp.bdCadenas = bdCadenas;
	}

	public boolean crearCuenta(String nombre, String correo, String contrasena) {

		boolean cuenta = false;
		
		if (usuarioDAO.read(correo) == null) {
			
			TOUsuarioImp usuario = new TOUsuarioImp(nombre, correo, contrasena);
			usuarioDAO.create(usuario);
			cuenta = true;
		}
		return cuenta;
	
	}

}
