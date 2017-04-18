package es.ucm.fdi.integracion;

public interface DAOSesion {

	public TOSesion createSesion(TOUsuario usuario);
	
	public void closeSesion(TOSesion sesion);
}
