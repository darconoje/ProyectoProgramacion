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

}
