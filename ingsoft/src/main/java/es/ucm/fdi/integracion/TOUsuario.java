package es.ucm.fdi.integracion;

public interface TOUsuario {

	public String getNombre();

	public void setNombre(String nombre);

	public String getCorreo();

	public void setCorreo(String correo);

	public String getContrasena();

	public void setContrasena(String contrasena);

	public String getFoto();

	public void setFoto(String foto);

	public String getDescripcion();

	public void setDescripcion(String descripcion);

	public boolean isActivo();

	public void setActivo(boolean activo);

}
