package Modelo;

public class Boleta {
	private int numero;
	private int precioAdulto;
	private int precioNino;
    public Boleta(int numero ,int precio){
    	this.numero=numero;
    	this.precioAdulto=precioAdulto;
    	this.precioNino=precioNino;
    	
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
	public int getPrecioNino() {
		return precioNino;
	}
	public void setPrecioNino(int precioNino) {
		this.precioNino = precioNino;
	}

}
