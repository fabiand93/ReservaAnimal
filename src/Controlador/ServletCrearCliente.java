package Controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Modelo.Animal;
import Modelo.Cliente;
import Modelo.Registros;

/**
 * Servlet implementation class ServletCrearCliente
 */
@WebServlet("/ServletCrearCliente")
public class ServletCrearCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletCrearCliente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String docType =
				"<!DOCTYPE html>\n";
		Registros reg = new Registros();
		try {
			reg.cargarDatosCliente();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			
		}
		String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String identificacion = request.getParameter("id");
        String usuario = request.getParameter("usuario");
        String contrasena = request.getParameter("contrasena");
        int edad = new Integer(request.getParameter("edad")).intValue();
        HttpSession sesion = request.getSession();
        Cliente nuevoCliente = new Cliente(nombre,apellido,identificacion,usuario,contrasena,edad);
        sesion.setAttribute("usuario", nuevoCliente);
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		pw.println(docType+"<HTML><HEAD><TITLE>Creacion de Clientes</TITLE></HEAD>"+"<Body>"+"</P><BR>"+"</BODY></HTML>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
