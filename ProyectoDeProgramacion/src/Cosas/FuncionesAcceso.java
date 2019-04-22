package Cosas;


public class FuncionesAcceso {

	public static boolean loginUsuario(String nombre, String clave) {
		boolean acceso = false;
		UsuariosBBDD bbddusuarios = new UsuariosBBDD();
		bbddusuarios.setNombres(bbddusuarios.obtenerNombres());
		bbddusuarios.setClaves(bbddusuarios.obtenerClaves());
		for (int i = 0; i<bbddusuarios.getNombres().size();i++) {
			if(nombre.equals(bbddusuarios.getNombres().get(i))&&clave.equals(bbddusuarios.getClaves().get(i))) {
					acceso = true;
			}
		}
		return acceso;		
	}
	
	public static boolean usuarioDuplicado(String nombre) {
		boolean duplicado = false;
		UsuariosBBDD bbddusuarios = new UsuariosBBDD();
		bbddusuarios.setNombres(bbddusuarios.obtenerNombres());
		for (int i = 0; i<bbddusuarios.getNombres().size();i++) {
			if(nombre.equals(bbddusuarios.getNombres().get(i))) {
				duplicado = true;
			}
		}
		return duplicado;
	}
	
}