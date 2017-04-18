package es.ucm.fdi.integracion;

import es.ucm.fdi.datos.BDMemoria;

public class DAOUsuarioImp<T> implements DAOUsuario {

	BDMemoria<T> bdCadenas=new BDMemoria<T>(); //situar donde corresponda

	
	public void create(TOUsuario tUsuario) {

		// suponemos que ya se ha comprobado que el correo no esta repetido, y
		// que es valido
		
		//bdCadenas.insert(tUsuario, tUsuario.getCorreo());
		
		//hablar con el profesor
	}

	public T read(String id) {
		
		return bdCadenas.find(id);
	}

}
