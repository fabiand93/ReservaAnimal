package Controlador;

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
	        Animal a = new Animal(nombre,identificacion,alimento,descripcion,edad);
	        
			response.setContentType("text/html");
			PrintWriter pw = response.getWriter();
			String docType =
					"<!DOCTYPE html>\n";
			pw.println(docType+"<html><head><meta charset=\"ISO-8859-1\"><title>Crear Animal</title>"
			+"<link rel=\"stylesheet\" href=\"assets/css/main.css\" /></head>"
			+"<body><body class=\"no-sidebar\"><div id=\"page-wrapper\"><div id=\"header\">"
			+"<div class=\"inner\"><header><h1><a href=\"index.html\" id=\"logo\">Reserva Animal</a></h1>"
			+"</header></div><nav id=\"nav\"><ul><li><a href=\"index.html\">Inicio</a></li>"
			+"<li><a href=\"#\">Sobre Nosotros</a><ul><li><a href=\"mision.html\">Misión</a></li>"
			+"<li><a href=\"vision.html\">Visión</a></li><li><a href=\"comprar-entradas.html\">Comprar Entradas</a></li>"
			+"<li><a href=\"donaciones.html\">Donaciones</a></li><li><a href=\"login.html\">Login</a>"
			+"<li><a>Empleados</a><ul><li><a href=\"CrearAnimal.html\"> Crear Animal </a> </li>"
			+"<li><a href=\"ModificarAnimal.html\"> Modificar Animal </a> </li><li><a href=\"VentaBoleta.html\"> Venta Boleta </a> </li>"
			+"<li><a href=\"donaciones.html\"> Donaciones </a></li></ul></li></ul></nav></div><div class=\"wrapper style1\">"
			+"<div class=\"container\"><article id=\"main\" class=\"special\"><header><h2><a href=\"#\">Animal Creado</a></h2>"
			+"</header><section><div class=\"Login\"><div id=\"check-accordion\" class=\"ui-accordion ui-widget ui-helper-reset\" role=\"tablist\">"
			+"<div class=\"clearfix ui-accordion-content ui-helper-reset ui-widget-content ui-corner-bottom ui-accordion-content-active\" id=\"ui-accordion-check-accordion-panel-0\" aria-labelledby=\"ui-accordion-check-accordion-header-0\" role=\"tabpanel\" aria-expanded=\"true\"aria-hidden=\"false\" style=\"display: block; height: 305px;\">"
			+"<div class=\"span6 cheakout clearfix register\"><h6><p>El animal ha sido creado</p> &nbsp<span>El animal se ha creado con los siguientes datos:</span> </h6>"
			+"<p>&nbsp &nbsp</p><label>Nombre del animal:"+ nombre+" </label><br><label>Identificacion:"+identificacion+"</label>"
			+"<br><label>Alimento al que esta acostumbrado: "+alimento+"</label> <br><label>Descripcion del animal:"+descripcion+"</label>"
			+"<br><label>Edad del animal:"+ edad +" </label><br><br/>"
			+"<a href=\"CrearAnimal.html\" target=\"_self\"> <input type=\"button\" name=\"boton\" value=\"Volver\" /> </a>"
			+"</div></div></div></div></section></article><div class=\"row\"></div></div></div><div id=\"footer\"><div class=\"container\">"
			+"<div class=\"row\"></div><hr /><div class=\"row\"><div class=\"12u\"><section class=\"contact\">"
			+"<header><h3>Ponte en contacto con nosotros</h3></header><p>Siguenos en nuestras redes sociales para que siempre estes al dia de nuestras acciones.</p>"
			+"<ul class=\"icons\"><li><a href=\"#\" class=\"icon fa-twitter\"><span class=\"label\">Twitter</span></a></li>"
			+"<li><a href=\"#\" class=\"icon fa-facebook\"><span class=\"label\">Facebook</span></a></li>"
			+"<li><a href=\"#\" class=\"icon fa-instagram\"><span class=\"label\">Instagram</span></a></li></ul></section>"
			+"<div class=\"copyright\"><ul class=\"menu\"><li>Design: <a>Fabian Diaz</a></li></ul></div></div></div></div></div></div>"
			+"<script src=\"assets/js/jquery.min.js\"></script><script src=\"assets/js/jquery.dropotron.min.js\"></script><script src=\"assets/js/jquery.scrolly.min.js\"></script>"
			+"<script src=\"assets/js/jquery.onvisible.min.js\"></script><script src=\"assets/js/skel.min.js\"></script>"
			+"<script src=\"assets/js/util.js\"></script><script src=\"assets/js/main.js\"></script></body></html>");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Obtenemos un objeto Print Writer para enviar respuesta
		   		
				
			
	}

}
