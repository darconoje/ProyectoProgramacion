package Cosas;

import java.sql.ResultSet;
import java.util.ArrayList;

public class Partida {
	
	private String usuario;
	private int dinero;
	private int puntuaciontotal;
	private int dineroporsegundo;
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
	
	public int getDineroporsegundo() {
		return dineroporsegundo;
	}
	
	public void setDineroporsegundo(int dineroporsegundo) {
		this.dineroporsegundo = dineroporsegundo;
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
	
	public Partida() {
		
	}
	
	public Partida(String usuario, int dinero, int puntuaciontotal, int dineroporsegundo, int standgalletitas,
			int vendedorgalletitas, int supermercadogalletitas, int mercadillogalletitas, int fabricagalletitas,
			int standpizza, int vendedorpizza, int supermercadopizza, int mercadillopizza, int fabricapizza,
			int standpanini, int vendedorpanini, int supermercadopanini, int mercadillopanini, int fabricapanini,
			int standnoodles, int vendedornoodles, int supermercadonoodles, int mercadillonoodles, int fabricanoodles) {
		this.usuario = usuario;
		this.dinero = dinero;
		this.puntuaciontotal = puntuaciontotal;
		this.dineroporsegundo = dineroporsegundo;
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
	}
	
	public boolean jugadorNuevo(String usuario) {
		Conexion.Conectar();
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
	
	public void nuevaPartida(String usuario) {
		Conexion.Conectar();
		Conexion.EjecutarUpdate("INSERT INTO partidasusuario" + " (nombreusuario,puntuaciontotal,dinero,tiempototal,standgalletitas,vendedorgalletitas,supermercadogalletitas,mercadillogalletitas,fabricagalletitas,standpizzas,vendedorpizzas,supermercadopizzas,mercadillopizzas,fabricapizzas,standpaninis,vendedorpaninis,supermercadopaninis,mercadillopaninis,fabricapaninis,standnoodles,vendedornoodles,supermercadonoodles,mercadillonoodles,fabricanoodles) VALUES"+ " ('"+ usuario +"',0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)");
		cargarDatos(usuario);
	}
	
	public void cargarDatos(String usuario) {
		Conexion.Conectar();
		
	}
		
}
