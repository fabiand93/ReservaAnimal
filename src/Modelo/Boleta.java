package Modelo;

public class Boleta {
	private int numero;
	private int precioAdulto;
	private int precioNiņo;
    public Boleta(int numero ,int precio){
    	this.numero=numero;
    	this.precioAdulto=precioAdulto;
    	this.precioNiņo=precioNiņo;
    	
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
	public int getPrecioNiņo() {
		return precioNiņo;
	}
	public void setPrecioNiņo(int precioNiņo) {
		this.precioNiņo = precioNiņo;
	}

}
