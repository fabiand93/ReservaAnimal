package Modelo;

public class Boleta {
	private int numero;
	private int precioAdulto;
	private int precioNi�o;
    public Boleta(int numero ,int precio){
    	this.numero=numero;
    	this.precioAdulto=precioAdulto;
    	this.precioNi�o=precioNi�o;
    	
    }
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getPrecioAdulto() {
		return precioAdulto;
	}
	public void setPrecioAdulto(int precioAdulto) {
		this.precioAdulto = precioAdulto;
	}
	public int getPrecioNi�o() {
		return precioNi�o;
	}
	public void setPrecioNi�o(int precioNi�o) {
		this.precioNi�o = precioNi�o;
	}

}
