package ProyectoFinal;

import java.util.ArrayList;

public class Reserva {

	private ArrayList <Animal> animales;

	public Reserva(){
		animales = new ArrayList();
	}

	public Animal crearAnimal(String nombre, String tipoDeAlimento, String id, String descripcion, int edad){

		Animal animal = new Animal(nombre, tipoDeAlimento,  id,  descripcion, edad);
		return animal;
	}

	public void agregarAnimal(Animal animal){
		animales.add(animal);
	}

	public boolean modificarAnimal(int id, String tipoDeAlimento ,String descripcion){
		Animal animal=consultarAnimal(id);
		if(animal!=null){
			animales.remove(animal);
		}
		animal.setDescripcion(descripcion);
		animal.setTipoDeAlimento(tipoDeAlimento);
		animales.add(animal);
		return true;
	}

	public boolean eliminarAnimal(int id){
		boolean estado=false;
		animales.remove(this.consultarAnimal(id));
		if(this.consultarAnimal(id)==null){
			return false;
		}
		return true;

	}

	public Animal consultarAnimal(int id){
		Animal animal = null;
		for (int i = 0; i < animales.size(); i++) {
			if(id==animales.get(i).getId()){
				animal=animales.get(i);
			}
		}
		return animal;
	}


}
