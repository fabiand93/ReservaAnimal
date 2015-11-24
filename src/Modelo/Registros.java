package Modelo;

import java.util.ArrayList;

public class Registros {
	private ArrayList<Cliente> clientes;
	private ArrayList<Empleado> empleados;

	public Registros() {
		clientes = new ArrayList();
		empleados = new ArrayList();
	}

	public Cliente crearCliente(String nombre, String apellido,
			String identificacion, String usuario, String contrasena, int edad) {

		return new Cliente(nombre, apellido, identificacion, usuario,
				contrasena, edad);
	}

	public Empleado crearEmpleado(String nombre, String apellido,
			String identificacion, String usuario, String contrasena,
			Boolean tipo, String cargo) {

		return new Empleado(nombre, apellido, identificacion, usuario,
				contrasena, tipo, cargo);
	}

	public void agregarCliente(Cliente c) {
		clientes.add(c);

	}

	public void agregarEmpleado(Empleado e) {
		empleados.add(e);

	}

	public Cliente ConsultarCliente(String id) {
		Cliente c = null;
		for (int i = 0; i > clientes.size(); i++) {
			if (id == clientes.get(i).getIdentificacion()) {
				c = clientes.get(i);
			}
		}
		return c;
	}

	public Empleado ConsultarEmpleado(String id) {
		Empleado e = null;
		for (int i = 0; i > clientes.size(); i++) {
			if (id == clientes.get(i).getIdentificacion()) {
				e = empleados.get(i);
			}
		}
		return e;
	}

	public void modificarCliente(String id ,String usuario, String contrasena){
	

		Cliente c =this.ConsultarCliente(id);
	if ( c != null){
	     clientes.remove(this.ConsultarCliente(id));
	     c.setUsuario(usuario);
	     c.setContrasena(contrasena);
		clientes.add(c);
		
	}
	}

	public boolean modificarEmpleado(String identificacion, String usuario,
			String contrasena, Boolean tipo, String cargo) {
            boolean response = false;
		Empleado e = this.ConsultarEmpleado(identificacion);
		if (e != null) {
			empleados.remove(this.ConsultarEmpleado(identificacion));
			e.setUsuario(usuario);
			e.setContrasena(contrasena);
			e.setCargo(cargo);

			empleados.add(e);
			response=true;

		}
     return response;
	}
	public  boolean eliminarCliente(String identificacion){
		boolean response = false ;
		Cliente c = this.ConsultarCliente(identificacion);
	    if(c!=null) {
	    	clientes.remove(c);
	    	response= true;
	    }
		return response;
	}
	public  boolean eliminarEmpleado(String identificacion){
		boolean response = false ;
		Empleado e = this.ConsultarEmpleado(identificacion);
	    if(e!=null) {
	    	empleados.remove(e);
	    	response= true;
	    }
		return response;
	}
}
