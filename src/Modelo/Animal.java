package ProyectoFinal;

public class Animal {

	private String nombre;
	private int id;
	private String tipoDeAlimento;
	private String descripcion;
	private int edad;
	
	public Animal(String nombre, String id, String tipoDeAlimento, String descripcion, int edad){
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipoDeAlimento() {
		return tipoDeAlimento;
	}

	public void setTipoDeAlimento(String tipoDeAlimento) {
		this.tipoDeAlimento = tipoDeAlimento;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}
