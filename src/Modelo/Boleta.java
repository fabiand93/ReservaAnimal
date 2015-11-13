package Modelo;

public class Boleta {
	private int numero;
	private int precioAdulto;
	private int precioNiño;
    public Boleta(int numero ,int precio){
    	this.numero=numero;
    	this.precioAdulto=precioAdulto;
    	this.precioNiño=precioNiño;
    	
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
	public int getPrecioNiño() {
		return precioNiño;
	}
	public void setPrecioNiño(int precioNiño) {
		this.precioNiño = precioNiño;
	}

}
