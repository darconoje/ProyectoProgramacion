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
		try {
			while(resultado.next()){
				partidas.add(resultado.getString("nombreusuario"));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
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
	
	public int obtenerMercadilloGalletitas(String usuario) {
		int mercadillogalletitas = 0;
		Conexion.Conectar();
		ResultSet resultado = Conexion.EjecutarSentencia("SELECT mercadillodogalletitas FROM partidasusuario where nombreusuario='"+usuario+"'");
		try {
			mercadillogalletitas=resultado.getInt("mercadillogalletitas");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return mercadillogalletitas;
	}
	
	public int obtenerFabricaGalletitas(String usuario) {
		int fabricagalletitas = 0;
		Conexion.Conectar();
		ResultSet resultado = Conexion.EjecutarSentencia("SELECT fabricagalletitas FROM partidasusuario where nombreusuario='"+usuario+"'");
		try {
			fabricagalletitas=resultado.getInt("fabricagalletitas");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return fabricagalletitas;
	}
	
	public int obtenerStandPizzas(String usuario) {
		int standpizzas = 0;
		Conexion.Conectar();
		ResultSet resultado = Conexion.EjecutarSentencia("SELECT standpizzas FROM partidasusuario where nombreusuario='"+usuario+"'");
		try {
			standpizzas=resultado.getInt("standpizzas");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return standpizzas;
	}
	
	public int obtenerVendedorPizzas(String usuario) {
		int vendedorpizzas = 0;
		Conexion.Conectar();
		ResultSet resultado = Conexion.EjecutarSentencia("SELECT vendedorpizzas FROM partidasusuario where nombreusuario='"+usuario+"'");
		try {
			vendedorpizzas=resultado.getInt("vendedorpizzas");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vendedorpizzas;
	}
	
	public int obtenerSupermercadoPizzas(String usuario) {
		int supermercadopizzas = 0;
		Conexion.Conectar();
		ResultSet resultado = Conexion.EjecutarSentencia("SELECT supermercadopizzas FROM partidasusuario where nombreusuario='"+usuario+"'");
		try {
			supermercadopizzas=resultado.getInt("supermercadopizzas");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return supermercadopizzas;
	}
	
	public int obtenerMercadilloPizzas(String usuario) {
		int mercadillopizzas = 0;
		Conexion.Conectar();
		ResultSet resultado = Conexion.EjecutarSentencia("SELECT mercadillodopizzas FROM partidasusuario where nombreusuario='"+usuario+"'");
		try {
			mercadillopizzas=resultado.getInt("mercadillopizzas");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return mercadillopizzas;
	}
	
	public int obtenerFabricaPizzas(String usuario) {
		int fabricapizzas = 0;
		Conexion.Conectar();
		ResultSet resultado = Conexion.EjecutarSentencia("SELECT fabricapizzas FROM partidasusuario where nombreusuario='"+usuario+"'");
		try {
			fabricapizzas=resultado.getInt("fabricapizzas");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return fabricapizzas;
	}
	public int obtenerStandPaninis(String usuario) {
		int standpaninis = 0;
		Conexion.Conectar();
		ResultSet resultado = Conexion.EjecutarSentencia("SELECT standpaninis FROM partidasusuario where nombreusuario='"+usuario+"'");
		try {
			standpaninis=resultado.getInt("standpaninis");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return standpaninis;
	}
	
	public int obtenerVendedorPaninis(String usuario) {
		int vendedorpaninis = 0;
		Conexion.Conectar();
		ResultSet resultado = Conexion.EjecutarSentencia("SELECT vendedorpaninis FROM partidasusuario where nombreusuario='"+usuario+"'");
		try {
			vendedorpaninis=resultado.getInt("vendedorpaninis");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vendedorpaninis;
	}
	
	public int obtenerSupermercadoPaninis(String usuario) {
		int supermercadopaninis = 0;
		Conexion.Conectar();
		ResultSet resultado = Conexion.EjecutarSentencia("SELECT supermercadopaninis FROM partidasusuario where nombreusuario='"+usuario+"'");
		try {
			supermercadopaninis=resultado.getInt("supermercadopaninis");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return supermercadopaninis;
	}
	
	public int obtenerMercadilloPaninis(String usuario) {
		int mercadillopaninis = 0;
		Conexion.Conectar();
		ResultSet resultado = Conexion.EjecutarSentencia("SELECT mercadillodopaninis FROM partidasusuario where nombreusuario='"+usuario+"'");
		try {
			mercadillopaninis=resultado.getInt("mercadillopaninis");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return mercadillopaninis;
	}
	
	public int obtenerFabricaPaninis(String usuario) {
		int fabricapaninis = 0;
		Conexion.Conectar();
		ResultSet resultado = Conexion.EjecutarSentencia("SELECT fabricapaninis FROM partidasusuario where nombreusuario='"+usuario+"'");
		try {
			fabricapaninis=resultado.getInt("fabricapaninis");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return fabricapaninis;
	}
	public int obtenerStandNoodles(String usuario) {
		int standnoodles = 0;
		Conexion.Conectar();
		ResultSet resultado = Conexion.EjecutarSentencia("SELECT standnoodles FROM partidasusuario where nombreusuario='"+usuario+"'");
		try {
			standnoodles=resultado.getInt("standnoodles");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return standnoodles;
	}
	
	public int obtenerVendedorNoodles(String usuario) {
		int vendedornoodles = 0;
		Conexion.Conectar();
		ResultSet resultado = Conexion.EjecutarSentencia("SELECT vendedornoodles FROM partidasusuario where nombreusuario='"+usuario+"'");
		try {
			vendedornoodles=resultado.getInt("vendedornoodles");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vendedornoodles;
	}
	
	public int obtenerSupermercadoNoodles(String usuario) {
		int supermercadonoodles = 0;
		Conexion.Conectar();
		ResultSet resultado = Conexion.EjecutarSentencia("SELECT supermercadonoodles FROM partidasusuario where nombreusuario='"+usuario+"'");
		try {
			supermercadonoodles=resultado.getInt("supermercadonoodles");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return supermercadonoodles;
	}
	
	public int obtenerMercadilloNoodles(String usuario) {
		int mercadillonoodles = 0;
		Conexion.Conectar();
		ResultSet resultado = Conexion.EjecutarSentencia("SELECT mercadillonoodles FROM partidasusuario where nombreusuario='"+usuario+"'");
		try {
			mercadillonoodles=resultado.getInt("mercadillonoodles");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return mercadillonoodles;
	}
	
	public int obtenerFabricaNoodles(String usuario) {
		int fabricanoodles = 0;
		Conexion.Conectar();
		ResultSet resultado = Conexion.EjecutarSentencia("SELECT fabricanoodles FROM partidasusuario where nombreusuario='"+usuario+"'");
		try {
			fabricanoodles=resultado.getInt("fabricanoodles");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return fabricanoodles;
	}
}
