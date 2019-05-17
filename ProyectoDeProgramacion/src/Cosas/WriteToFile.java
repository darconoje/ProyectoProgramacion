package Cosas;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("ficheros/ejemplos/archivo.txt");
			String texto = "";
			texto += "asdawdas\n";
			texto += "quasdasdsl\n";
			texto += "adios";
			writer.write(texto);
			writer.close();
			System.out.println("se ha escrito el fichero");			

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
