package Modelo;

public class Donacion {
	private int monto ;
	private Cliente donador;
	public Donacion(int monto , Cliente donador){
		this.monto=monto;
		this.donador=donador;
	}
	public int getMonto() {
		return monto;
	}
	public void setMonto(int monto) {
		this.monto = monto;
	}
	public Cliente getDonador() {
		return donador;
	}
	public void setDonador(Cliente donador) {
		this.donador = donador;
	}
	

}
