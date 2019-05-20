package Cosas;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * La clase Partida recoge todas las variables que puedan existir en la partida, ademas de metodos y funciones para manipularlas
 * @author Dario
 *
 */

public class Partida {
	
	private String usuario;
	private int dinero;
	private int puntuaciontotal;
	private int tiempototal;
	private int standgalletitas;
	private int vendedorgalletitas;
	private int supermercadogalletitas;
	private int mercadillogalletitas;
	private int fabricagalletitas;
	private int standpizza;
	private int vendedorpizza;
	private int supermercadopizza;
	private int mercadillopizza;
	private int fabricapizza;
	private int standpanini;
	private int vendedorpanini;
	private int supermercadopanini;
	private int mercadillopanini;
	private int fabricapanini;
	private int standnoodles;
	private int vendedornoodles;
	private int supermercadonoodles;
	private int mercadillonoodles;
	private int fabricanoodles;
	private int preciostandgalletitas;
	private int preciovendedorgalletitas;
	private int preciosupermercadogalletitas;
	private int preciomercadillogalletitas;
	private int preciofabricagalletitas;
	private int preciostandpizza;
	private int preciovendedorpizza;
	private int preciosupermercadopizza;
	private int preciomercadillopizza;
	private int preciofabricapizza;
	private int preciostandpanini;
	private int preciovendedorpanini;
	private int preciosupermercadopanini;
	private int preciomercadillopanini;
	private int preciofabricapanini;
	private int preciostandnoodles;
	private int preciovendedornoodles;
	private int preciosupermercadonoodles;
	private int preciomercadillonoodles;
	private int preciofabricanoodles;
	
	public String getUsuario() {
		return usuario;
	}
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public int getDinero() {
		return dinero;
	}
	
	public void setDinero(int dinero) {
		this.dinero = dinero;
	}
	
	public int getPuntuaciontotal() {
		return puntuaciontotal;
	}
	
	public void setPuntuaciontotal(int puntuaciontotal) {
		this.puntuaciontotal = puntuaciontotal;
	}
	
	public int getTiempototal() {
		return tiempototal;
	}
	
	public void setTiempototal(int tiempototal) {
		this.tiempototal = tiempototal;
	}
	
	public int getStandgalletitas() {
		return standgalletitas;
	}
	
	public void setStandgalletitas(int standgalletitas) {
		this.standgalletitas = standgalletitas;
	}
	
	public int getVendedorgalletitas() {
		return vendedorgalletitas;
	}
	
	public void setVendedorgalletitas(int vendedorgalletitas) {
		this.vendedorgalletitas = vendedorgalletitas;
	}
	
	public int getSupermercadogalletitas() {
		return supermercadogalletitas;
	}
	
	public void setSupermercadogalletitas(int supermercadogalletitas) {
		this.supermercadogalletitas = supermercadogalletitas;
	}
	
	public int getMercadillogalletitas() {
		return mercadillogalletitas;
	}
	
	public void setMercadillogalletitas(int mercadillogalletitas) {
		this.mercadillogalletitas = mercadillogalletitas;
	}
	
	public int getFabricagalletitas() {
		return fabricagalletitas;
	}
	
	public void setFabricagalletitas(int fabricagalletitas) {
		this.fabricagalletitas = fabricagalletitas;
	}
	
	public int getStandpizza() {
		return standpizza;
	}
	
	public void setStandpizza(int standpizza) {
		this.standpizza = standpizza;
	}
	
	public int getVendedorpizza() {
		return vendedorpizza;
	}
	
	public void setVendedorpizza(int vendedorpizza) {
		this.vendedorpizza = vendedorpizza;
	}
	
	public int getSupermercadopizza() {
		return supermercadopizza;
	}
	
	public void setSupermercadopizza(int supermercadopizza) {
		this.supermercadopizza = supermercadopizza;
	}
	
	public int getMercadillopizza() {
		return mercadillopizza;
	}
	
	public void setMercadillopizza(int mercadillopizza) {
		this.mercadillopizza = mercadillopizza;
	}
	
	public int getFabricapizza() {
		return fabricapizza;
	}
	
	public void setFabricapizza(int fabricapizza) {
		this.fabricapizza = fabricapizza;
	}
	
	public int getStandpanini() {
		return standpanini;
	}
	
	public void setStandpanini(int standpanini) {
		this.standpanini = standpanini;
	}
	
	public int getVendedorpanini() {
		return vendedorpanini;
	}
	
	public void setVendedorpanini(int vendedorpanini) {
		this.vendedorpanini = vendedorpanini;
	}
	
	public int getSupermercadopanini() {
		return supermercadopanini;
	}
	
	public void setSupermercadopanini(int supermercadopanini) {
		this.supermercadopanini = supermercadopanini;
	}
	
	public int getMercadillopanini() {
		return mercadillopanini;
	}
	
	public void setMercadillopanini(int mercadillopanini) {
		this.mercadillopanini = mercadillopanini;
	}
	
	public int getFabricapanini() {
		return fabricapanini;
	}
	
	public void setFabricapanini(int fabricapanini) {
		this.fabricapanini = fabricapanini;
	}
	
	public int getStandnoodles() {
		return standnoodles;
	}
	
	public void setStandnoodles(int standnoodles) {
		this.standnoodles = standnoodles;
	}
	
	public int getVendedornoodles() {
		return vendedornoodles;
	}
	
	public void setVendedornoodles(int vendedornoodles) {
		this.vendedornoodles = vendedornoodles;
	}
	
	public int getSupermercadonoodles() {
		return supermercadonoodles;
	}
	
	public void setSupermercadonoodles(int supermercadonoodles) {
		this.supermercadonoodles = supermercadonoodles;
	}
	
	public int getMercadillonoodles() {
		return mercadillonoodles;
	}
	
	public void setMercadillonoodles(int mercadillonoodles) {
		this.mercadillonoodles = mercadillonoodles;
	}
	
	public int getFabricanoodles() {
		return fabricanoodles;
	}
	
	public void setFabricanoodles(int fabricanoodles) {
		this.fabricanoodles = fabricanoodles;
	}
	
	public int getPreciostandgalletitas() {
		return preciostandgalletitas;
	}

	public void setPreciostandgalletitas(int preciostandgalletitas) {
		this.preciostandgalletitas = preciostandgalletitas;
	}

	public int getPreciovendedorgalletitas() {
		return preciovendedorgalletitas;
	}

	public void setPreciovendedorgalletitas(int preciovendedorgalletitas) {
		this.preciovendedorgalletitas = preciovendedorgalletitas;
	}

	public int getPreciosupermercadogalletitas() {
		return preciosupermercadogalletitas;
	}

	public void setPreciosupermercadogalletitas(int preciosupermercadogalletitas) {
		this.preciosupermercadogalletitas = preciosupermercadogalletitas;
	}

	public int getPreciomercadillogalletitas() {
		return preciomercadillogalletitas;
	}

	public void setPreciomercadillogalletitas(int preciomercadillogalletitas) {
		this.preciomercadillogalletitas = preciomercadillogalletitas;
	}

	public int getPreciofabricagalletitas() {
		return preciofabricagalletitas;
	}

	public void setPreciofabricagalletitas(int preciofabricagalletitas) {
		this.preciofabricagalletitas = preciofabricagalletitas;
	}

	public int getPreciostandpizza() {
		return preciostandpizza;
	}

	public void setPreciostandpizza(int preciostandpizza) {
		this.preciostandpizza = preciostandpizza;
	}

	public int getPreciovendedorpizza() {
		return preciovendedorpizza;
	}

	public void setPreciovendedorpizza(int preciovendedorpizza) {
		this.preciovendedorpizza = preciovendedorpizza;
	}

	public int getPreciosupermercadopizza() {
		return preciosupermercadopizza;
	}

	public void setPreciosupermercadopizza(int preciosupermercadopizza) {
		this.preciosupermercadopizza = preciosupermercadopizza;
	}

	public int getPreciomercadillopizza() {
		return preciomercadillopizza;
	}

	public void setPreciomercadillopizza(int preciomercadillopizza) {
		this.preciomercadillopizza = preciomercadillopizza;
	}

	public int getPreciofabricapizza() {
		return preciofabricapizza;
	}

	public void setPreciofabricapizza(int preciofabricapizza) {
		this.preciofabricapizza = preciofabricapizza;
	}

	public int getPreciostandpanini() {
		return preciostandpanini;
	}

	public void setPreciostandpanini(int preciostandpanini) {
		this.preciostandpanini = preciostandpanini;
	}

	public int getPreciovendedorpanini() {
		return preciovendedorpanini;
	}

	public void setPreciovendedorpanini(int preciovendedorpanini) {
		this.preciovendedorpanini = preciovendedorpanini;
	}

	public int getPreciosupermercadopanini() {
		return preciosupermercadopanini;
	}

	public void setPreciosupermercadopanini(int preciosupermercadopanini) {
		this.preciosupermercadopanini = preciosupermercadopanini;
	}

	public int getPreciomercadillopanini() {
		return preciomercadillopanini;
	}

	public void setPreciomercadillopanini(int preciomercadillopanini) {
		this.preciomercadillopanini = preciomercadillopanini;
	}

	public int getPreciofabricapanini() {
		return preciofabricapanini;
	}

	public void setPreciofabricapanini(int preciofabricapanini) {
		this.preciofabricapanini = preciofabricapanini;
	}

	public int getPreciostandnoodles() {
		return preciostandnoodles;
	}

	public void setPreciostandnoodles(int preciostandnoodles) {
		this.preciostandnoodles = preciostandnoodles;
	}

	public int getPreciovendedornoodles() {
		return preciovendedornoodles;
	}

	public void setPreciovendedornoodles(int preciovendedornoodles) {
		this.preciovendedornoodles = preciovendedornoodles;
	}

	public int getPreciosupermercadonoodles() {
		return preciosupermercadonoodles;
	}

	public void setPreciosupermercadonoodles(int preciosupermercadonoodles) {
		this.preciosupermercadonoodles = preciosupermercadonoodles;
	}

	public int getPreciomercadillonoodles() {
		return preciomercadillonoodles;
	}

	public void setPreciomercadillonoodles(int preciomercadillonoodles) {
		this.preciomercadillonoodles = preciomercadillonoodles;
	}

	public int getPreciofabricanoodles() {
		return preciofabricanoodles;
	}

	public void setPreciofabricanoodles(int preciofabricanoodles) {
		this.preciofabricanoodles = preciofabricanoodles;
	}
	
	public Partida() {
		
	}
	
	public Partida(String usuario, int dinero, int puntuaciontotal, int tiempototal, int standgalletitas,
			int vendedorgalletitas, int supermercadogalletitas, int mercadillogalletitas, int fabricagalletitas,
			int standpizza, int vendedorpizza, int supermercadopizza, int mercadillopizza, int fabricapizza,
			int standpanini, int vendedorpanini, int supermercadopanini, int mercadillopanini, int fabricapanini,
			int standnoodles, int vendedornoodles, int supermercadonoodles, int mercadillonoodles, int fabricanoodles,
			int preciostandgalletitas, int preciovendedorgalletitas, int preciosupermercadogalletitas,
			int preciomercadillogalletitas, int preciofabricagalletitas, int preciostandpizza, int preciovendedorpizza,
			int preciosupermercadopizza, int preciomercadillopizza, int preciofabricapizza, int preciostandpanini,
			int preciovendedorpanini, int preciosupermercadopanini, int preciomercadillopanini, int preciofabricapanini,
			int preciostandnoodles, int preciovendedornoodles, int preciosupermercadonoodles,
			int preciomercadillonoodles, int preciofabricanoodles) {
		this.usuario = usuario;
		this.dinero = dinero;
		this.puntuaciontotal = puntuaciontotal;
		this.tiempototal = tiempototal;
		this.standgalletitas = standgalletitas;
		this.vendedorgalletitas = vendedorgalletitas;
		this.supermercadogalletitas = supermercadogalletitas;
		this.mercadillogalletitas = mercadillogalletitas;
		this.fabricagalletitas = fabricagalletitas;
		this.standpizza = standpizza;
		this.vendedorpizza = vendedorpizza;
		this.supermercadopizza = supermercadopizza;
		this.mercadillopizza = mercadillopizza;
		this.fabricapizza = fabricapizza;
		this.standpanini = standpanini;
		this.vendedorpanini = vendedorpanini;
		this.supermercadopanini = supermercadopanini;
		this.mercadillopanini = mercadillopanini;
		this.fabricapanini = fabricapanini;
		this.standnoodles = standnoodles;
		this.vendedornoodles = vendedornoodles;
		this.supermercadonoodles = supermercadonoodles;
		this.mercadillonoodles = mercadillonoodles;
		this.fabricanoodles = fabricanoodles;
		this.preciostandgalletitas = preciostandgalletitas;
		this.preciovendedorgalletitas = preciovendedorgalletitas;
		this.preciosupermercadogalletitas = preciosupermercadogalletitas;
		this.preciomercadillogalletitas = preciomercadillogalletitas;
		this.preciofabricagalletitas = preciofabricagalletitas;
		this.preciostandpizza = preciostandpizza;
		this.preciovendedorpizza = preciovendedorpizza;
		this.preciosupermercadopizza = preciosupermercadopizza;
		this.preciomercadillopizza = preciomercadillopizza;
		this.preciofabricapizza = preciofabricapizza;
		this.preciostandpanini = preciostandpanini;
		this.preciovendedorpanini = preciovendedorpanini;
		this.preciosupermercadopanini = preciosupermercadopanini;
		this.preciomercadillopanini = preciomercadillopanini;
		this.preciofabricapanini = preciofabricapanini;
		this.preciostandnoodles = preciostandnoodles;
		this.preciovendedornoodles = preciovendedornoodles;
		this.preciosupermercadonoodles = preciosupermercadonoodles;
		this.preciomercadillonoodles = preciomercadillonoodles;
		this.preciofabricanoodles = preciofabricanoodles;
	}
	
	/**
	 * la funcion jugadorNuevo devuelve un booleano true si el nombre del usuario no se encuentra en la base de datos y false en el caso contrario
	 * @param usuario
	 * @return
	 */
	
	public boolean jugadorNuevo(String usuario) {
		boolean nuevo = true;
		UsuariosBBDD basedatos = new UsuariosBBDD();
		ArrayList<String> nombres = basedatos.obtenerPartidas();
		for(int i = 0 ; i<nombres.size();i++) {
			if(usuario.equals(nombres.get(i))) {
				nuevo = false;
			}
		}
		return nuevo;
	}
	
	/**
	 * la funcion nuevaPartida realiza un insert en la tabla de partidas de la base de datos con el nombre de usuario y todas las variables a 0
	 * @param usuario
	 */
	
	public void nuevaPartida(String usuario) {
		Conexion.EjecutarUpdate("INSERT INTO partidasusuario" + " (nombreusuario,puntuaciontotal,dinero,tiempototal,standgalletitas,vendedorgalletitas,supermercadogalletitas,mercadillogalletitas,fabricagalletitas,standpizzas,vendedorpizzas,supermercadopizzas,mercadillopizzas,fabricapizzas,standpaninis,vendedorpaninis,supermercadopaninis,mercadillopaninis,fabricapaninis,standnoodles,vendedornoodles,supermercadonoodles,mercadillonoodles,fabricanoodles) VALUES"+ " ('"+ usuario +"',0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
		cargarDatos(usuario);
	}
	
	/**
	 * la funcion cargarDatos hace una llamada a las funciones de bbddusuarios con el fin de seleccionar las variables de la partida de la tabla
	 * de partidas y asignarle a cada una de las variables del objeto partida el valor correspondiente 
	 * @param usuario
	 * @return
	 */
	
	public Partida cargarDatos(String usuario) {
		UsuariosBBDD bbddusuarios = new UsuariosBBDD();
		String nombre = bbddusuarios.obtenerUsuarioPartida(usuario);
		int dinero = bbddusuarios.obtenerDinero(usuario);
		int puntuaciontotal = bbddusuarios.obtenerPuntuacionTotal(usuario);
		int tiempototal = bbddusuarios.obtenerTiempoTotal(usuario);
		int standgalletitas = bbddusuarios.obtenerStandGalletitas(usuario);
		int vendedorgalletitas = bbddusuarios.obtenerVendedorGalletitas(usuario);
		int supermercadogalletitas = bbddusuarios.obtenerSupermercadoGalletitas(usuario);
		int mercadillogalletitas = bbddusuarios.obtenerMercadilloGalletitas(usuario);
		int fabricagalletitas = bbddusuarios.obtenerFabricaGalletitas(usuario);
		int standpizzas = bbddusuarios.obtenerStandPizzas(usuario);
		int vendedorpizzas = bbddusuarios.obtenerVendedorPizzas(usuario);
		int supermercadopizzas = bbddusuarios.obtenerSupermercadoPizzas(usuario);
		int mercadillopizzas = bbddusuarios.obtenerMercadilloPizzas(usuario);
		int fabricapizzas = bbddusuarios.obtenerFabricaPizzas(usuario);
		int standpaninis = bbddusuarios.obtenerStandPaninis(usuario);
		int vendedorpaninis = bbddusuarios.obtenerVendedorPaninis(usuario);
		int supermercadopaninis = bbddusuarios.obtenerSupermercadoPaninis(usuario);
		int mercadillopaninis = bbddusuarios.obtenerMercadilloPaninis(usuario);
		int fabricapaninis = bbddusuarios.obtenerFabricaPaninis(usuario);
		int standnoodles = bbddusuarios.obtenerStandNoodles(usuario);
		int vendedornoodles = bbddusuarios.obtenerVendedorNoodles(usuario);
		int supermercadonoodles = bbddusuarios.obtenerSupermercadoNoodles(usuario);
		int mercadillonoodles = bbddusuarios.obtenerMercadilloNoodles(usuario);
		int fabricanoodles = bbddusuarios.obtenerFabricaNoodles(usuario);
		int preciostandgalletitas = precioStandGalletitas();
		int preciovendedorgalletitas = precioVendedorGalletitas();
		int preciosupermercadogalletitas = precioSupermercadoGalletitas();
		int preciomercadillogalletitas = precioMercadilloGalletitas();
		int preciofabricagalletitas = precioFabricaGalletitas();
		int preciostandpizzas = precioStandPizzas();
		int preciovendedorpizzas = precioVendedorPizzas();
		int preciosupermercadopizzas = precioSupermercadoPizzas();
		int preciomercadillopizzas = precioMercadilloPizzas();
		int preciofabricapizzas = precioFabricaPizzas();
		int preciostandpaninis = precioStandPaninis();
		int preciovendedorpaninis = precioVendedorPaninis();
		int preciosupermercadopaninis = precioSupermercadoPaninis();
		int preciomercadillopaninis = precioMercadilloPaninis();
		int preciofabricapaninis = precioFabricaPaninis();
		int preciostandnoodles = precioStandNoodles();
		int preciovendedornoodles = precioVendedorNoodles();
		int preciosupermercadonoodles = precioSupermercadoNoodles();
		int preciomercadillonoodles = precioMercadilloNoodles();
		int preciofabricanoodles = precioFabricaNoodles();

		Partida partida = new Partida(nombre,dinero,puntuaciontotal,tiempototal,standgalletitas,vendedorgalletitas,supermercadogalletitas,mercadillogalletitas,fabricagalletitas,standpizzas,vendedorpizzas,supermercadopizzas,mercadillopizzas,fabricapizzas,standpaninis,vendedorpaninis,supermercadopaninis,mercadillopaninis,fabricapaninis,standnoodles,vendedornoodles,supermercadonoodles,mercadillonoodles,fabricanoodles,preciostandgalletitas,preciovendedorgalletitas,preciosupermercadogalletitas,preciomercadillogalletitas,preciofabricagalletitas,preciostandpizzas,preciovendedorpizzas,preciosupermercadopizzas,preciomercadillopizzas,preciofabricapizzas,preciostandpaninis,preciovendedorpaninis,preciosupermercadopaninis,preciomercadillopaninis,preciofabricapaninis,preciostandnoodles,preciovendedornoodles,preciosupermercadonoodles,preciomercadillonoodles,preciofabricanoodles);
		return partida;
	}

	/**
	 * La fucnion guardarPartida actualiza la tabla de partidas del usuario actual en la base de datos con los valores de las variables que
	 * el objeto tiene en ese momento
	 * @param partida
	 */
	
	public void guardarPartida(Partida partida) {
		Conexion.EjecutarUpdate("UPDATE partidasusuario SET dinero = "+partida.getDinero()+" WHERE nombreusuario = '"+partida.getUsuario()+"' ");
		Conexion.EjecutarUpdate("UPDATE partidasusuario SET puntuaciontotal = "+partida.getPuntuaciontotal()+" WHERE nombreusuario = '"+partida.getUsuario()+"' ");
		Conexion.EjecutarUpdate("UPDATE partidasusuario SET tiempototal = "+partida.getTiempototal()+" WHERE nombreusuario = '"+partida.getUsuario()+"' ");
		Conexion.EjecutarUpdate("UPDATE partidasusuario SET standgalletitas = "+partida.getStandgalletitas()+" WHERE nombreusuario = '"+partida.getUsuario()+"' ");
		Conexion.EjecutarUpdate("UPDATE partidasusuario SET vendedorgalletitas = "+partida.getVendedorgalletitas()+" WHERE nombreusuario = '"+partida.getUsuario()+"' ");
		Conexion.EjecutarUpdate("UPDATE partidasusuario SET supermercadogalletitas = "+partida.getSupermercadogalletitas()+" WHERE nombreusuario = '"+partida.getUsuario()+"' ");
		Conexion.EjecutarUpdate("UPDATE partidasusuario SET mercadillogalletitas = "+partida.getMercadillogalletitas()+" WHERE nombreusuario = '"+partida.getUsuario()+"' ");
		Conexion.EjecutarUpdate("UPDATE partidasusuario SET fabricagalletitas = "+partida.getFabricagalletitas()+" WHERE nombreusuario = '"+partida.getUsuario()+"' ");
		Conexion.EjecutarUpdate("UPDATE partidasusuario SET standpizzas = "+partida.getStandpizza()+" WHERE nombreusuario = '"+partida.getUsuario()+"' ");
		Conexion.EjecutarUpdate("UPDATE partidasusuario SET vendedorpizzas = "+partida.getVendedorpizza()+" WHERE nombreusuario = '"+partida.getUsuario()+"' ");
		Conexion.EjecutarUpdate("UPDATE partidasusuario SET supermercadopizzas = "+partida.getSupermercadopizza()+" WHERE nombreusuario = '"+partida.getUsuario()+"' ");
		Conexion.EjecutarUpdate("UPDATE partidasusuario SET mercadillopizzas = "+partida.getMercadillopizza()+" WHERE nombreusuario = '"+partida.getUsuario()+"' ");
		Conexion.EjecutarUpdate("UPDATE partidasusuario SET fabricapizzas = "+partida.getFabricapizza()+" WHERE nombreusuario = '"+partida.getUsuario()+"' ");
		Conexion.EjecutarUpdate("UPDATE partidasusuario SET standpaninis = "+partida.getStandpanini()+" WHERE nombreusuario = '"+partida.getUsuario()+"' ");
		Conexion.EjecutarUpdate("UPDATE partidasusuario SET vendedorpaninis = "+partida.getVendedorpanini()+" WHERE nombreusuario = '"+partida.getUsuario()+"' ");
		Conexion.EjecutarUpdate("UPDATE partidasusuario SET supermercadopaninis = "+partida.getSupermercadopanini()+" WHERE nombreusuario = '"+partida.getUsuario()+"' ");
		Conexion.EjecutarUpdate("UPDATE partidasusuario SET mercadillopaninis = "+partida.getMercadillopanini()+" WHERE nombreusuario = '"+partida.getUsuario()+"' ");
		Conexion.EjecutarUpdate("UPDATE partidasusuario SET fabricapaninis = "+partida.getFabricapanini()+" WHERE nombreusuario = '"+partida.getUsuario()+"' ");
		Conexion.EjecutarUpdate("UPDATE partidasusuario SET standnoodles = "+partida.getStandnoodles()+" WHERE nombreusuario = '"+partida.getUsuario()+"' ");
		Conexion.EjecutarUpdate("UPDATE partidasusuario SET vendedornoodles = "+partida.getVendedornoodles()+" WHERE nombreusuario = '"+partida.getUsuario()+"' ");
		Conexion.EjecutarUpdate("UPDATE partidasusuario SET supermercadonoodles = "+partida.getSupermercadonoodles()+" WHERE nombreusuario = '"+partida.getUsuario()+"' ");
		Conexion.EjecutarUpdate("UPDATE partidasusuario SET mercadillonoodles = "+partida.getMercadillonoodles()+" WHERE nombreusuario = '"+partida.getUsuario()+"' ");
		Conexion.EjecutarUpdate("UPDATE partidasusuario SET fabricanoodles = "+partida.getFabricanoodles()+" WHERE nombreusuario = '"+partida.getUsuario()+"' ");
	}
	
	/*public int obtenerDineroPorClickGalletita() {
		int dineroporclickgalletita = 0;
		ResultSet resultado = Conexion.EjecutarSentencia("SELECT dineroporclick FROM productos where nombreproducto='Galletita'");
		try {
			while(resultado.next()) {
				dineroporclickgalletita=resultado.getInt("dineroporclick");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dineroporclickgalletita;
	}
	
	public int obtenerDineroPorClickPizza() {
		int dineroporclickpizza = 0;
		ResultSet resultado = Conexion.EjecutarSentencia("SELECT dineroporclick FROM productos where nombreproducto='Pizza Napolitana'");
		try {
			while(resultado.next()) {
				dineroporclickpizza=resultado.getInt("dineroporclick");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dineroporclickpizza;
	}
	
	public int obtenerDineroPorClickPanini() {
		int dineroporclickpanini = 0;
		ResultSet resultado = Conexion.EjecutarSentencia("SELECT dineroporclick FROM productos where nombreproducto='Panini del Polvillo'");
		try {
			while(resultado.next()) {
				dineroporclickpanini=resultado.getInt("dineroporclick");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dineroporclickpanini;
	}
	
	public int obtenerDineroPorClickNoodles() {
		int dineroporclicknoodles = 0;
		ResultSet resultado = Conexion.EjecutarSentencia("SELECT dineroporclick FROM productos where nombreproducto='Golden Noodles'");
		try {
			while(resultado.next()) {
				dineroporclicknoodles=resultado.getInt("dineroporclick");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dineroporclicknoodles;
	}
	*/
	
	
	public int precioStandGalletitas() {
		int preciostandgalletitas = 0;
		ResultSet resultado = Conexion.EjecutarSentencia("SELECT preciounidad FROM mejoras where nombremejora='Stand Galletitas'");
		try {
			while(resultado.next()) {
				preciostandgalletitas=resultado.getInt("preciounidad");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return preciostandgalletitas;
	}
	
	public int precioVendedorGalletitas() {
		int preciovendedorgalletitas = 0;
		ResultSet resultado = Conexion.EjecutarSentencia("SELECT preciounidad FROM mejoras where nombremejora='Vendedor Galletitas'");
		try {
			while(resultado.next()) {
				preciovendedorgalletitas=resultado.getInt("preciounidad");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return preciovendedorgalletitas;
	}	
	
	public int precioSupermercadoGalletitas() {
		int preciosupermercadogalletitas = 0;
		ResultSet resultado = Conexion.EjecutarSentencia("SELECT preciounidad FROM mejoras where nombremejora='Supermercado Galletitas'");
		try {
			while(resultado.next()) {
				preciosupermercadogalletitas=resultado.getInt("preciounidad");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return preciosupermercadogalletitas;
	}	
	
	public int precioMercadilloGalletitas() {
		int preciomercadillogalletitas = 0;
		ResultSet resultado = Conexion.EjecutarSentencia("SELECT preciounidad FROM mejoras where nombremejora='Mercadillo Galletitas'");
		try {
			while(resultado.next()) {
				preciomercadillogalletitas=resultado.getInt("preciounidad");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return preciomercadillogalletitas;
	}	
	
	public int precioFabricaGalletitas() {
		int preciofabricagalletitas = 0;
		ResultSet resultado = Conexion.EjecutarSentencia("SELECT preciounidad FROM mejoras where nombremejora='Fabrica Galletitas'");
		try {
			while(resultado.next()) {
				preciofabricagalletitas=resultado.getInt("preciounidad");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return preciofabricagalletitas;
	}	
	
	public int precioStandPizzas() {
		int preciostandpizzas = 0;
		ResultSet resultado = Conexion.EjecutarSentencia("SELECT preciounidad FROM mejoras where nombremejora='Stand Pizzas'");
		try {
			while(resultado.next()) {
				preciostandpizzas=resultado.getInt("preciounidad");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return preciostandpizzas;
	}	
	
	public int precioVendedorPizzas() {
		int preciovendedorpizzas = 0;
		ResultSet resultado = Conexion.EjecutarSentencia("SELECT preciounidad FROM mejoras where nombremejora='Vendedor Pizzas'");
		try {
			while(resultado.next()) {
				preciovendedorpizzas=resultado.getInt("preciounidad");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return preciovendedorpizzas;
	}	
		
	public int precioSupermercadoPizzas() {
		int preciosupermercadopizzas = 0;
		ResultSet resultado = Conexion.EjecutarSentencia("SELECT preciounidad FROM mejoras where nombremejora='Supermercado Pizzas'");
		try {
			while(resultado.next()) {
				preciosupermercadopizzas=resultado.getInt("preciounidad");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return preciosupermercadopizzas;
	}	
	
	public int precioMercadilloPizzas() {
		int preciomercadillopizzas = 0;
		ResultSet resultado = Conexion.EjecutarSentencia("SELECT preciounidad FROM mejoras where nombremejora='Mercadillo Pizzas'");
		try {
			while(resultado.next()) {
				preciomercadillopizzas=resultado.getInt("preciounidad");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return preciomercadillopizzas;
	}	
	
	public int precioFabricaPizzas() {
		int preciofabricapizzas = 0;
		ResultSet resultado = Conexion.EjecutarSentencia("SELECT preciounidad FROM mejoras where nombremejora='Fabrica Pizzas'");
		try {
			while(resultado.next()) {
				preciofabricapizzas=resultado.getInt("preciounidad");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return preciofabricapizzas;
	}	
	
	public int precioStandPaninis() {
		int preciostandpaninis = 0;
		ResultSet resultado = Conexion.EjecutarSentencia("SELECT preciounidad FROM mejoras where nombremejora='Stand Paninis'");
		try {
			while(resultado.next()) {
				preciostandpaninis=resultado.getInt("preciounidad");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return preciostandpaninis;
	}	
	
	public int precioVendedorPaninis() {
		int preciovendedorpaninis = 0;
		ResultSet resultado = Conexion.EjecutarSentencia("SELECT preciounidad FROM mejoras where nombremejora='Vendedor Paninis'");
		try {
			while(resultado.next()) {
				preciovendedorpaninis=resultado.getInt("preciounidad");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return preciovendedorpaninis;
	}
	
	public int precioSupermercadoPaninis() {
		int preciosupermercadopaninis = 0;
		ResultSet resultado = Conexion.EjecutarSentencia("SELECT preciounidad FROM mejoras where nombremejora='Supermercado Paninis'");
		try {
			while(resultado.next()) {
				preciosupermercadopaninis=resultado.getInt("preciounidad");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return preciosupermercadopaninis;
	}	
	
	public int precioMercadilloPaninis() {
		int preciomercadillopaninis = 0;
		ResultSet resultado = Conexion.EjecutarSentencia("SELECT preciounidad FROM mejoras where nombremejora='Mercadillo Paninis'");
		try {
			while(resultado.next()) {
				preciomercadillopaninis=resultado.getInt("preciounidad");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return preciomercadillopaninis;
	}	
	
	public int precioFabricaPaninis() {
		int preciofabricapaninis = 0;
		ResultSet resultado = Conexion.EjecutarSentencia("SELECT preciounidad FROM mejoras where nombremejora='Fabrica Paninis'");
		try {
			while(resultado.next()) {
				preciofabricapaninis=resultado.getInt("preciounidad");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return preciofabricapaninis;
	}	
	
	public int precioStandNoodles() {
		int preciostandnoodles = 0;
		ResultSet resultado = Conexion.EjecutarSentencia("SELECT preciounidad FROM mejoras where nombremejora='Stand Noodles'");
		try {
			while(resultado.next()) {
				preciostandnoodles=resultado.getInt("preciounidad");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return preciostandnoodles;
	}	
	
	public int precioVendedorNoodles() {
		int preciovendedornoodles = 0;
		ResultSet resultado = Conexion.EjecutarSentencia("SELECT preciounidad FROM mejoras where nombremejora='Vendedor Noodles'");
		try {
			while(resultado.next()) {
				preciovendedornoodles=resultado.getInt("preciounidad");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return preciovendedornoodles;
	}	
	
	public int precioSupermercadoNoodles() {
		int preciosupermercadonoodles = 0;
		ResultSet resultado = Conexion.EjecutarSentencia("SELECT preciounidad FROM mejoras where nombremejora='Supermercado Noodles'");
		try {
			while(resultado.next()) {
				preciosupermercadonoodles=resultado.getInt("preciounidad");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return preciosupermercadonoodles;
	}	
	
	public int precioMercadilloNoodles() {
		int preciomercadillonoodles = 0;
		ResultSet resultado = Conexion.EjecutarSentencia("SELECT preciounidad FROM mejoras where nombremejora='Mercadillo Noodles'");
		try {
			while(resultado.next()) {
				preciomercadillonoodles=resultado.getInt("preciounidad");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return preciomercadillonoodles;
	}	
	
	public int precioFabricaNoodles() {
		int preciofabricanoodles = 0;
		ResultSet resultado = Conexion.EjecutarSentencia("SELECT preciounidad FROM mejoras where nombremejora='Fabrica Noodles'");
		try {
			while(resultado.next()) {
				preciofabricanoodles=resultado.getInt("preciounidad");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return preciofabricanoodles;
	}	
	
	/**
	 * la funcion obtenerDineroPorSegundo realiza las operaciones necesarias correspondientes a las mejoras para calcular el dinero que el
	 * usuario gana por segundo
	 * @return
	 */
	
	public int obtenerDineroPorSegundo() {
		int dineroporsegundo=((getStandgalletitas()*1*1)+(getVendedorgalletitas()*10*1)+(getSupermercadogalletitas()*25*1)+(getMercadillogalletitas()*50*1)+(getFabricagalletitas()*100*1)+(getStandpizza()*1*25)+(getVendedorpizza()*10*25)+(getSupermercadopizza()*25*25)+(getMercadillopizza()*50*25)+(getFabricapizza()*100*25)+(getStandpanini()*1*100)+(getVendedorpanini()*10*100)+(getSupermercadopanini()*25*100)+(getMercadillopanini()*50*100)+(getFabricapanini()*100*100)+(getStandnoodles()*1*500)+(getVendedornoodles()*10*500)+(getSupermercadonoodles()*25*500)+(getMercadillonoodles()*50*500)+(getFabricanoodles()*100*500));
		return dineroporsegundo;
	}

}
