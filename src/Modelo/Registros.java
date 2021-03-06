package Modelo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class Registros {
	private ArrayList<Cliente> clientes;
	private ArrayList<Empleado> empleados;

	public Registros() {
		clientes = new ArrayList<Cliente>();
		empleados = new ArrayList<Empleado>();
	}

	public Cliente crearCliente(String nombre, String apellido,
			String identificacion, String usuario, String contrasena, int edad) {

		return new Cliente(nombre, apellido, identificacion, usuario,
				contrasena, edad);
	}

	public static Empleado crearEmpleado(String nombre, String apellido,
			String identificacion, String usuario, String contrasena,
			 String cargo) {
		System.out.println(nombre+" "+apellido+" "+identificacion+" "+usuario+" "+contrasena+" "+cargo);
		return new Empleado(nombre, apellido, identificacion, usuario,
				contrasena,  cargo);
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
	
	public void cargarDatosCliente() throws Exception{
		String ruta = "Files/archivoC.txt";
        File archivoC = new File(ruta);
        BufferedWriter bw;
        if(archivoC.exists()) {
            bw = new BufferedWriter(new FileWriter(archivoC));
        } else {
            bw = new BufferedWriter(new FileWriter(archivoC));
        }
        bw.close();
        
        Lector l = new Lector(archivoC);
        l.leerLinea();
       
        String linea;

		while((linea=l.leerLinea())!=null){
			linea.split(",");
		}
	}
	
	public void cargarDatosEmpleado() throws Exception{
		String ruta = "Files/archivoE.txt";
        File archivoE = new File(ruta);
        BufferedWriter bw;
        if(archivoE.exists()) {
            bw = new BufferedWriter(new FileWriter(archivoE));
        } else {
            bw = new BufferedWriter(new FileWriter(archivoE));
        }
        bw.close();
        
        Lector l = new Lector(archivoE);
        l.leerLinea();
       
        String linea;

		while((linea=l.leerLinea())!=null){
			linea.split(",");
		}
	}
	
	public String authenticate(String username, String password) {
		if (("usuario".equalsIgnoreCase(username))
				&& ("password".equals(password))) {
			return "success";
		} else {
			return "failure";
		}
	}
	
}
