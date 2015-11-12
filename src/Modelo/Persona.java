package Modelo;

public class Persona {
	private String nombre ;
	private String apellido;
	private String identificacion;
	private String usuario;
	private String contrase�a;
	
	public Persona(String nombre , String apellido,String identificacion,String usuario,String contrase�a){
		this.nombre=nombre;
		this.apellido=apellido;
		this.identificacion=identificacion;
		this.usuario=usuario;
		this.contrase�a=contrase�a;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	

}
