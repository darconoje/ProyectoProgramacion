package Cosas;

import java.io.FileWriter;
import java.io.IOException;

public class FicherosSave {
	public void exportar(Partida partida, String nombre) {
		try {
			FileWriter writer = new FileWriter("src/Saves/"+nombre+".csv");
			
			String texto = "";
			texto += partida.getUsuario();
			texto += ";";
			texto += Integer.toString(partida.getDinero());
			texto += ";";
			texto += Integer.toString(partida.getPuntuaciontotal());
			texto += ";";
			texto += Integer.toString(partida.getTiempototal());
			texto += ";";
			texto += Integer.toString(partida.getStandgalletitas());
			texto += ";";
			texto += Integer.toString(partida.getVendedorgalletitas());
			texto += ";";
			texto += Integer.toString(partida.getSupermercadogalletitas());
			texto += ";";
			texto += Integer.toString(partida.getMercadillogalletitas());
			texto += ";";
			texto += Integer.toString(partida.getFabricagalletitas());
			texto += ";";
			texto += Integer.toString(partida.getStandpizza());
			texto += ";";
			texto += Integer.toString(partida.getVendedorpizza());
			texto += ";";
			texto += Integer.toString(partida.getSupermercadopizza());
			texto += ";";
			texto += Integer.toString(partida.getMercadillopizza());
			texto += ";";
			texto += Integer.toString(partida.getFabricapizza());
			texto += ";";
			texto += Integer.toString(partida.getStandpanini());
			texto += ";";
			texto += Integer.toString(partida.getVendedorpanini());
			texto += ";";
			texto += Integer.toString(partida.getSupermercadopanini());
			texto += ";";
			texto += Integer.toString(partida.getMercadillopanini());
			texto += ";";
			texto += Integer.toString(partida.getFabricapanini());
			texto += ";";
			texto += Integer.toString(partida.getStandnoodles());
			texto += ";";
			texto += Integer.toString(partida.getVendedornoodles());
			texto += ";";
			texto += Integer.toString(partida.getSupermercadonoodles());
			texto += ";";
			texto += Integer.toString(partida.getMercadillonoodles());
			texto += ";";
			texto += Integer.toString(partida.getFabricanoodles());
			
			writer.write(texto);
			writer.close();
		}catch (IOException e){
			e.printStackTrace();
		}
	}
	
	public void importar() {
		
	}
}
