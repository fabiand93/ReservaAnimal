package Modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lector {

	private FileReader  freader ;
	private BufferedReader breader;

	public Lector(File in) throws FileNotFoundException{

		freader = new FileReader (in);
		breader = new BufferedReader(freader);

	}
	public String  leerLinea() throws IOException{
		return breader.readLine();

	}
	public void cerrar() throws IOException{
		breader.close();
	}
}
