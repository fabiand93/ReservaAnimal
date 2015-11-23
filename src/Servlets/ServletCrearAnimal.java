package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CrearAnimal
 */
@WebServlet("CrearAnimal")
public class ServletCrearAnimal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletCrearAnimal() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Obtenemos un objeto Print Writer para enviar respuesta
		        String nombre = request.getParameter("nombre");
		        String edad = request.getParameter("edad");
		        String identificacion = request.getParameter("id");
		        String descripcion = request.getParameter("des");
		        String alimento = request.getParameter("alimento");
		        Animal a = new Animal(nombre,identificacion,alimento,descripcion,edad);
		        
				response.setContentType("text/html");
				PrintWriter pw = response.getWriter();
				pw.println(response+"<HTML><HEAD><TITLE>Creacion de animales</TITLE></HEAD>");
				pw.println("<BODY BGCOLOR=\"#CCBBAA\">");
				pw.println("<H2>Leyendo par�metros desde un formulario html</H2><P>");
				pw.println("<UL>\n");
				pw.println("Verificacion de datos:");
				pw.println("El nombre del animal es: " +nombre  + "<BR>");
				pw.println("La edad es: " + edad + "<BR>");
				pw.println("Identificacion: " + identificacion + "<BR>");
				pw.println("El tipo de alimento que consume es: " +descripcion  + "<BR>");
				pw.println("Descripcion del animal: " +alimento  + "<BR>");
				pw.println("</BODY></HTML>");
				pw.close();
	}

}
