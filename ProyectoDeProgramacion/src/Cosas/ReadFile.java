package Cosas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class ReadFile {
	public static void main(String[] args) {
		String ruta ="ficheros/ejemplos/archivo.txt";
		File fichero = new File(ruta);
		String textooriginal="";
		String textocopia="";
		try {			
			Scanner reader = new Scanner(fichero);
			while(reader.hasNextLine()) {
				String data = reader.nextLine();
				textooriginal = textooriginal+data;
				if(reader.hasNextLine()) {
					textooriginal += "\n";
				}
			}
			reader.close();
		}	catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Scanner reader = new Scanner(fichero);
			FileWriter writer = new FileWriter("ficheros/ejemplos/archivo2.txt");
	  		String[] partes =  textooriginal.split("\n");

			writer.write(textocopia);
			writer.close();
			System.out.println("se ha escrito el fichero");			

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
  		String[] partes =  textooriginal.split("\n");
		for(int i = 0; i<partes.length; i++) {
			System.out.println(partes[i]);
		}
	
	}
}
