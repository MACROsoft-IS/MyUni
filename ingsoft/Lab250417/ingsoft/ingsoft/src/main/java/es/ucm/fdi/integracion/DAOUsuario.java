package es.ucm.fdi.integracion;

public interface DAOUsuario {

	public void create(TOUsuario tUsuario);
	
	public TOUsuario read(String id);
	
	//public boolean desactivar (Integer id); podemos incluir la funcion de desactivar cuenta
}
 