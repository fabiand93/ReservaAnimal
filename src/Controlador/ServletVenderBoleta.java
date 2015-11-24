package controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Modelo.Cliente;
import Modelo.Empleado;
import Modelo.Registros;
import Modelo.Taquilla;

/**
 * Servlet implementation class ServletVenderBoleta
 */
@WebServlet("/ServletVenderBoleta")
public class ServletVenderBoleta extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletVenderBoleta() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession sesion = request.getSession();
		response.getWriter().append("Served at: ").append(request.getContextPath());
		Registros reg = new Registros();
		
		String id = request.getParameter("identificacion");
		Cliente cliente = reg.ConsultarCliente(id) 	;
		//cargarDatos
		if(cliente==null){
			response.setContentType("text/html");
			PrintWriter pw = response.getWriter();
			String docType =
					"<!DOCTYPE html>\n";
			pw.println(docType+"<HTML><HEAD><TITLE>Error</TITLE></HEAD>"+"<BODY BGCOLOR=\"#CCBBAA\">"
					+"<H2>Leyendo parametros desde un formulario html</H2><P>"+"<UL>\n"+"Verificacion de datos: No se encontro Cliente"  + "</P><BR>"+"</BODY></HTML>");
		}else {
			;
			Taquilla taq = new Taquilla((Empleado) sesion.getAttribute("empleado"));
			//cargar Datos
			taq.venderTiquete(cliente);
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
