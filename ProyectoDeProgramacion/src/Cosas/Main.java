package Cosas;

import java.awt.EventQueue;

public class Main {
	
	/**
	 * Lanza la aplicacion ejecutando el jframe de la ventana de login
	 */

	public static void main(String[] args) {
		Conexion.Conectar();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Acceso frame = new Acceso();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
