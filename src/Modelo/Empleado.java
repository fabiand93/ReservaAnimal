package Modelo;

public class Empleado  extends Persona{
	private  Boolean tipo;
	private String cargo;
	public Empleado(String nombre, String apellido, String identificacion,
			String usuario, String contraseña,Boolean tipo,String cargo) {
		super(nombre, apellido, identificacion, usuario, contraseña);
		// TODO Auto-generated constructor stub
	this.tipo=tipo;
	this.cargo=cargo;
	}
	public Boolean getTipo() {
		return tipo;
	}
	public void setTipo(Boolean tipo) {
		this.tipo = tipo;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	

}
