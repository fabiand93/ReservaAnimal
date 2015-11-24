package Modelo;

public class Animal {

	private String nombre;
	private String id;
	private String tipoDeAlimento;
	private String descripcion;
	private String edad;
	
	public Animal(String nombre, String id, String tipoDeAlimento, String descripcion, String edad){
		this.nombre=nombre;
		this.id=id;
		this.tipoDeAlimento=tipoDeAlimento;
		this.descripcion=descripcion;
		this.edad=edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString(){
		return "Nombre: "+this.getNombre()+","+"Identificacion: "+this.getId()+","
	+"Tipo de alimento: "+this.getTipoDeAlimento()+","+"Descripcion: "+this.getDescripcion()+","+
				"Edad: "+this.getEdad();
	}
}
