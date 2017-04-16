package es.ucm.fdi.integracion;

public interface DAOUsuario<T> {

	public void create(TOUsuario tUsuario);
	
	public T read(String id);
	
	//public boolean desactivar (Integer id); podemos incluir la funcion de desactivar cuenta
}
