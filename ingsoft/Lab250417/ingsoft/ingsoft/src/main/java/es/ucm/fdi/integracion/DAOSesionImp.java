package es.ucm.fdi.integracion;

public class DAOSesionImp implements DAOSesion {

	public TOSesion createSesion(TOUsuario usuario){
		return new TOSesionImp(usuario);
	}
	
	public void closeSesion(TOSesion sesion){
		sesion.setSesionID(null);
		sesion.setCuentaActiva(null);
	}

}
