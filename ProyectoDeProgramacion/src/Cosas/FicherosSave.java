package Cosas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.DefaultListModel;

/**
 * La clase FicherosSave contiene funciones referentes al manejo de ficheros csv para la exportacion e importacion de partidas
 * @author Dario
 *
 */

public class FicherosSave {
	
	public FicherosSave() {
		
	}
	
	public void exportar(Partida partida, String nombre) {
		try {
			FileWriter writer = new FileWriter("src/Saves/"+nombre+".csv");
			
			String texto = "";
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
	
	public boolean archivoRepetido(String nombre) {
		
		boolean repetido = false;
		
		File carpeta = new File("src/Saves");
		File[] listasaves = carpeta.listFiles(); 
		for(int i = 0 ; i<listasaves.length;i++) {
			if(listasaves[i].getName().equals(nombre+".csv")) {
				repetido = true;
			}
		}
		
		return repetido;
	}
	
	public void borrarPartida(String nombre) {
		File carpeta = new File("src/Saves");
		File[] listasaves = carpeta.listFiles();
		for(int i = 0 ; i<listasaves.length;i++) {
			if(listasaves[i].getName().equals(nombre+".csv")) {
				listasaves[i].delete();
			}
		}
	}
	
	public void importar(Partida partida, String nombre) {
		String ruta = "src/Saves/"+nombre+".csv";
		File fichero = new File(ruta);
		String texto = "";
		try {			
			Scanner reader = new Scanner(fichero);
			while(reader.hasNextLine()) {
				String data = reader.nextLine();
				texto = texto+data;
			}
			reader.close();
		}	catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		String[] partes = texto.split(";");
		
		for(int i = 0 ; i<partes.length ; i++) {
			if(i==0) {
				partida.setDinero(Integer.parseInt(partes[i]));
			}
			if(i==1) {
				partida.setPuntuaciontotal(Integer.parseInt(partes[i]));
			}
			if(i==2) {
				partida.setTiempototal(Integer.parseInt(partes[i]));
			}
			if(i==3) {
				partida.setStandgalletitas(Integer.parseInt(partes[i]));
			}
			if(i==4) {
				partida.setVendedorgalletitas(Integer.parseInt(partes[i]));
			}
			if(i==5) {
				partida.setSupermercadogalletitas(Integer.parseInt(partes[i]));
			}
			if(i==6) {
				partida.setMercadillogalletitas(Integer.parseInt(partes[i]));
			}
			if(i==7) {
				partida.setFabricagalletitas(Integer.parseInt(partes[i]));
			}
			if(i==8) {
				partida.setStandpizza(Integer.parseInt(partes[i]));
			}
			if(i==9) {
				partida.setVendedorpizza(Integer.parseInt(partes[i]));
			}
			if(i==10) {
				partida.setSupermercadopizza(Integer.parseInt(partes[i]));
			}
			if(i==11) {
				partida.setMercadillopizza(Integer.parseInt(partes[i]));
			}
			if(i==12) {
				partida.setFabricapizza(Integer.parseInt(partes[i]));
			}
			if(i==13) {
				partida.setStandpanini(Integer.parseInt(partes[i]));
			}
			if(i==14) {
				partida.setVendedorpanini(Integer.parseInt(partes[i]));
			}
			if(i==15) {
				partida.setSupermercadopanini(Integer.parseInt(partes[i]));
			}
			if(i==16) {
				partida.setMercadillopanini(Integer.parseInt(partes[i]));
			}
			if(i==17) {
				partida.setFabricapanini(Integer.parseInt(partes[i]));
			}
			if(i==18) {
				partida.setStandnoodles(Integer.parseInt(partes[i]));
			}
			if(i==19) {
				partida.setVendedornoodles(Integer.parseInt(partes[i]));
			}
			if(i==20) {
				partida.setSupermercadogalletitas(Integer.parseInt(partes[i]));
			}
			if(i==21) {
				partida.setMercadillonoodles(Integer.parseInt(partes[i]));
			}
			if(i==22) {
				partida.setFabricanoodles(Integer.parseInt(partes[i]));
			}
		}
	}
	
	public DefaultListModel<String> listarSaves(){
		DefaultListModel<String> lista = new DefaultListModel<String>();
		
		File carpeta = new File("src/Saves");
		File[] listasaves = carpeta.listFiles(); 		
		
		for(int i = 0 ; i<listasaves.length ; i++) {
			lista.addElement(listasaves[i].getName().substring(0,listasaves[i].getName().length()-4));
		}
		
		return lista;
	}
}
