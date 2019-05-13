package Cosas;

import java.awt.EventQueue;

public class Main {
	
	/**
	 * Launch the application.
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
