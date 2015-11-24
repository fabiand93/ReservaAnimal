package Controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Modelo.Empleado;
import Modelo.Registros;

/**
 * Servlet implementation class ServletCrearEmpleado
 */
@WebServlet("/ServletCrearEmpleado")
public class ServletCrearEmpleado extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletCrearEmpleado() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String identificacion = request.getParameter("id");
        String usuario = request.getParameter("usuario");
        String contrasena = request.getParameter("contrasena");
        String cargo = request.getParameter("cargo");
        
        System.out.println(nombre+" "+apellido+" "+identificacion+" "+usuario+" "+contrasena+" "+cargo);
        
        HttpSession sesion = request.getSession();
        
        Empleado nuevoEmpleado = new Empleado(nombre,apellido,identificacion,usuario,contrasena,cargo);
        
        Registros.crearEmpleado(nombre, apellido, identificacion, usuario, contrasena, cargo);
        
        sesion.setAttribute(usuario, nuevoEmpleado);
        
		response.setContentType("text/html");
		
		PrintWriter pw = response.getWriter();
		String docType =
				"<!DOCTYPE html>\n";
		pw.println(docType+"<HTML><HEAD><TITLE>Creacion de empleados</TITLE></HEAD>"+"<Body>"+"</P><BR>"+"</BODY></HTML>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
