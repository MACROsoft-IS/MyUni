package es.ucm.fdi.negocio;

import es.ucm.fdi.integracion.TOSesion;

public interface ASGestionCuenta{
	
	public TOSesion iniciarSesion(String correo, String contrasena);

	public boolean crearCuenta(String nombre, String correo, String contrasena);
	
}
