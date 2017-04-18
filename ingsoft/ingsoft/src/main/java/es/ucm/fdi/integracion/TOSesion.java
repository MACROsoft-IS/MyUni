package es.ucm.fdi.integracion;

public interface TOSesion {
	public String getSesionID();

	public void setSesionID(String sesionID);

	public TOUsuario getCuentaActiva();

	public void setCuentaActiva(TOUsuario cuentaActiva);
}
