package Cosas;
import java.sql.ResultSet;
import java.sql.SQLException;

import Cosas.Conexion;
import java.util.ArrayList;
public class UsuariosBBDD {
	
	private ArrayList<String> nombres;
	private ArrayList<String> claves;
	
	public ArrayList<String> getNombres() {
		return nombres;
	}

	public ArrayList<String> getClaves() {
		return claves;
	}

	public void setClaves(ArrayList<String> claves) {
		this.claves = claves;
	}

	public void setNombres(ArrayList<String> nombres) {
		this.nombres = nombres;
	}

	public UsuariosBBDD() {
		
	}
	
	public UsuariosBBDD(ArrayList<String> nombres, ArrayList<String> claves) {
		super();
		this.nombres = nombres;
		this.claves = claves;
	}
	
	public ArrayList<String> obtenerNombres() {
		ArrayList<String> nombres = new ArrayList<String>();
		Conexion.Conectar();
		ResultSet resultado = Conexion.EjecutarSentencia("SELECT nombreusuario FROM accesousuario");
		try {
			while(resultado.next()) {
				nombres.add(resultado.getString("nombreusuario"));
			}	
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return nombres;
	}
	
	public ArrayList<String> obtenerClaves(){
		ArrayList<String> claves = new ArrayList<String>();
		Conexion.Conectar();
		ResultSet resultado = Conexion.EjecutarSentencia("SELECT clave FROM accesousuario");
		try {
			while(resultado.next()) {
				claves.add(resultado.getString("clave"));
			}	
		}catch(SQLException e) {
			e.printStackTrace();
		}		
		return claves;		
	}

	public ArrayList<String> obtenerPartidas(){
		ArrayList<String> partidas = new ArrayList<String>();
		Conexion.Conectar();
		ResultSet resultado = Conexion.EjecutarSentencia("SELECT nombreusuario FROM partidasusuario");
		return partidas;
	}
	
	public static void registrarse(String nombre, String clave) {
		Conexion.EjecutarUpdate("INSERT INTO accesousuario" + " (nombreusuario,clave) VALUES"+ " (\""+nombre+"\",\""+clave+"\")");
	}
	
	public String obtenerUsuarioPartida(String usuario) {
		String nombre = "";
		Conexion.Conectar();
		ResultSet resultado = Conexion.EjecutarSentencia("SELECT nombreusuario FROM partidasusuario where nombreusuario='"+usuario+"'");
		try {
			nombre=resultado.getString("nombreusuario");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return nombre;
	}
	
	public int obtenerPuntuacionTotal(String usuario) {
		int puntuaciontotal = 0;
		Conexion.Conectar();
		ResultSet resultado = Conexion.EjecutarSentencia("SELECT puntuaciontotal FROM partidasusuario where nombreusuario='"+usuario+"'");
		try {
			puntuaciontotal=resultado.getInt("puntuaciontotal");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return puntuaciontotal;
	}
	
	public int obtenerDinero(String usuario) {
		int dinero = 0;
		Conexion.Conectar();
		ResultSet resultado = Conexion.EjecutarSentencia("SELECT dinero FROM partidasusuario where nombreusuario='"+usuario+"'");
		try {
			dinero=resultado.getInt("dinero");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dinero;
	}
	
	public int obtenerTiempoTotal(String usuario) {
		int tiempototal = 0;
		Conexion.Conectar();
		ResultSet resultado = Conexion.EjecutarSentencia("SELECT tiempototal FROM partidasusuario where nombreusuario='"+usuario+"'");
		try {
			tiempototal=resultado.getInt("tiempototal");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return tiempototal;
	}
	
	//falta poner dinero por segundo
	
	public int obtenerStandGalletitas(String usuario) {
		int standgalletitas = 0;
		Conexion.Conectar();
		ResultSet resultado = Conexion.EjecutarSentencia("SELECT standgalletitas FROM partidasusuario where nombreusuario='"+usuario+"'");
		try {
			standgalletitas=resultado.getInt("standgalletitas");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return standgalletitas;
	}
	
	public int obtenerVendedorGalletitas(String usuario) {
		int vendedorgalletitas = 0;
		Conexion.Conectar();
		ResultSet resultado = Conexion.EjecutarSentencia("SELECT vendedorgalletitas FROM partidasusuario where nombreusuario='"+usuario+"'");
		try {
			vendedorgalletitas=resultado.getInt("vendedorgalletitas");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vendedorgalletitas;
	}
	
	public int obtenerSupermercadoGalletitas(String usuario) {
		int supermercadogalletitas = 0;
		Conexion.Conectar();
		ResultSet resultado = Conexion.EjecutarSentencia("SELECT supermercadogalletitas FROM partidasusuario where nombreusuario='"+usuario+"'");
		try {
			supermercadogalletitas=resultado.getInt("supermercadogalletitas");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return supermercadogalletitas;
	}
}
