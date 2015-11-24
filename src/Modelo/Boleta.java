package Modelo;

public class Boleta {
	private int numero;
	private int precio;
    public Boleta(int numero ,int precio){
    	this.numero=numero;
    	this.precio=precio;
    	
    }
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	@Override
	public String toString(){
		return this.getNumero()+","+this.getPrecio()+"\n";
	}
}
