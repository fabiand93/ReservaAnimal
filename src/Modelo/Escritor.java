package Modelo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Escritor {
	private File a;
	private FileWriter  fwriter ;
	private PrintWriter wr; 


	public Escritor(File in ) throws IOException{
		a=in;

		fwriter = new FileWriter(a,true);
		wr= new PrintWriter(fwriter); 

	}
	public void escribir(String write) throws IOException{
		fwriter.write(write);
		wr.append(write);

	}

	public void cerrar() throws IOException{
		fwriter.close();
	}

}
