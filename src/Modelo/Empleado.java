package Modelo;

public class Empleado  extends Persona{

	private String cargo;
	public Empleado(String nombre, String apellido, String identificacion,
			String usuario, String contrasena,String cargo) {
		super(nombre, apellido, identificacion, usuario, contrasena);
		// TODO Auto-generated constructor stub
	
	this.cargo=cargo;
	}
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	@Override
	public String toString(){
		return this.getNombre()+","+this.getApellido()+","+this.getIdentificacion()+","+this.getUsuario()
		+","+this.getContrasena()+","+this.getCargo()+"\n";
	}

}
