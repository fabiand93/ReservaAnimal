package Modelo;

public class Cliente extends Persona{
	private int edad;

	public Cliente(String nombre, String apellido, String identificacion,
			String usuario, String contrase�a,int edad) {
		super(nombre, apellido, identificacion, usuario, contrase�a);
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

}
