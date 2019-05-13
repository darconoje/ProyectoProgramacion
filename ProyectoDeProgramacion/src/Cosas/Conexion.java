package Cosas;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;


	public class Conexion {
		
		static String timeZone = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		static String dbName="proyectoprogramacion";
		//3307
		static String url="jdbc:mysql://localhost:3306/"+dbName+timeZone;
		static String user = "root";
		static String pass = "manolo";

		static Connection conexion;
		static Statement consulta;
		static ResultSet resultado;
		
		public static void Conectar() {
			try {
				conexion = DriverManager.getConnection(url,user,pass);
				consulta = conexion.createStatement();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		public static ResultSet EjecutarSentencia(String sentencia) {
			try {
				resultado = consulta.executeQuery(sentencia);
			}catch (SQLException e) {
				e.printStackTrace();
			}
			return resultado;
		}
		
		public static void EjecutarUpdate(String sentencia) {
			try {
				consulta.executeUpdate(sentencia);
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		public static void CerrarConexion() {
			try {
				consulta.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
