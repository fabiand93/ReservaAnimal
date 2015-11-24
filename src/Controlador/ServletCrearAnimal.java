package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Modelo.Animal;

/**
 * Servlet implementation class CrearAnimal
 */
@WebServlet("/ServletCrearAnimal")
public class ServletCrearAnimal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletCrearAnimal() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	     String nombre = request.getParameter("nombre");
	        String edad = request.getParameter("edad");
	        String identificacion = request.getParameter("id");
	        String descripcion = request.getParameter("des");
	        String alimento = request.getParameter("alimento");
	        new Animal(nombre,identificacion,alimento,descripcion,edad);
	        
			response.setContentType("text/html");
			PrintWriter pw = response.getWriter();
			String docType =
					"<!DOCTYPE html>\n";
			pw.println(docType+"<HTML><HEAD><TITLE>Creacion de animales</TITLE></HEAD>"+"<BODY BGCOLOR=\"#CCBBAA\">"
			+"<H2>Leyendo parametros desde un formulario html</H2><P>"+"<UL>\n"+"Verificacion de datos:"+
			"El nombre del animal es: "+nombre  + "<BR>"+"La edad es: " + edad + "<BR>"+"Identificacion: " + identificacion + "<BR>"
			+"El tipo de alimento que consume es: " +descripcion  + "<BR>"+"Descripcion del animal: " +alimento  + "</P><BR>"+"</BODY></HTML>");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Obtenemos un objeto Print Writer para enviar respuesta
		   		
				
			
	}

}
