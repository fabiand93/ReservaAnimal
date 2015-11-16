package Modelo;

import java.util.ArrayList;

public class Reserva {

	private ArrayList <Animal> animales;

	public Reserva(){
		animales = new ArrayList();
	}

	public Animal crearAnimal(String nombre, String id, String tipoDeAlimento, String descripcion, String edad){

		return new Animal(nombre,id, tipoDeAlimento, descripcion, edad);
	}

	public void agregarAnimal(Animal animal){
		animales.add(animal);
	}
	
	public Animal consultarAnimal(String id){
		Animal animal = null;
		for (int i = 0; i > animales.size(); i++) {
			if(id==animales.get(i).getId()){
				animal=animales.get(i);
			}
		}
		return animal;
	}

	public boolean modificarAnimal(String id, String tipoDeAlimento ,String descripcion){
		boolean estado=false;
		Animal animal=this.consultarAnimal(id);
		if(animal!=null){
			animales.remove(this.consultarAnimal(id));
			animal.setDescripcion(descripcion);
			animal.setTipoDeAlimento(tipoDeAlimento);
			animales.add(animal);
			estado= true;
		}
		return estado;
	}
	

	public boolean eliminarAnimal(String id){
		boolean estado=false;
		Animal a = this.consultarAnimal(id);
		if(a!=null){
		animales.remove(a);
		estado=true;
		}
		return estado;
	}

}
