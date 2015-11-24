package Modelo;

public class Cliente extends Persona{
	private int edad;

	public Cliente(String nombre, String apellido, String identificacion,
			String usuario, String contrasena,int edad) {
		super(nombre, apellido, identificacion, usuario, contrasena);
		// TODO Auto-generated constructor stub
	this.edad=edad;	
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String toString(){
		return "nombre :"+this.getNombre()+"Apellido :"+this.getApellido()+"identificacion :"
				+this.getIdentificacion()+"Nombre de Usuario : "+this.getUsuario()+"Edad :"+this.edad;
	}
	
	public String toStringArchivos(){
		return "Nombre: "+this.getNombre()+","+"Apellido: "+this.getApellido()+","
	+"Identificacion: "+this.getIdentificacion()+","+"Nombre de usuario: "+this.getUsuario()+","+
				"Edad: "+this.getEdad();
	}

}
