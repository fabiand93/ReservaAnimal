package Modelo;

import java.util.ArrayList;

public class Taquilla {
	private int precioAdulto;
	private int precioNino;
	private Empleado encargado;
	private ArrayList<Boleta> boleteria;
	private ArrayList<Donacion> donaciones;
   public Taquilla(Empleado encargado){
	   this.encargado=encargado;
   }
   public void venderTiquete(Cliente c){
	   int p =0,n=0;
	   if (c.getEdad()<18){
		   p=this.precioNino;
		   
	   }else{
		   p=this.precioAdulto;
	   }
	   n=(int) Math.random()*100;
	for( int i=0; i<boleteria.size();i++){
		while(n==boleteria.get(i).getNumero()){
			n=(int) Math.random()*100;
		}
	
		
	}
	boleteria.add(new Boleta(n,p));
   }
   public void recibirDonacion(Cliente c ,int m ){
	   donaciones.add(new Donacion(m,c));
	   
   }
public Empleado getEncargado() {
	return encargado;
}
public void setEncargado(Empleado encargado) {
	this.encargado = encargado;
}
public ArrayList<Boleta> getBoleteria() {
	return boleteria;
}
public void setBoleteria(ArrayList<Boleta> boleteria) {
	this.boleteria = boleteria;
}
public ArrayList<Donacion> getDonaciones() {
	return donaciones;
}
public void setDonaciones(ArrayList<Donacion> donaciones) {
	this.donaciones = donaciones;
}
public int getPrecioAdulto() {
	return precioAdulto;
}
public void setPrecioAdulto(int precioAdulto) {
	this.precioAdulto = precioAdulto;
}
public int getPrecioNino() {
	return precioNino;
}
public void setPrecioNino(int precioNino) {
	this.precioNino = precioNino;
}
   
	

}
