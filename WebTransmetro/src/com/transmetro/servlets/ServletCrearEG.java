package com.transmetro.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.transmetro.manejador.Manejador;

import com.transmetro.estructuras.Estacion;
import com.transmetro.ws.ImplService;
import com.transmetro.ws.ImplServiceProxy;

/**
 * Servlet implementation class ServletCrearEG
 */
@WebServlet("/ServletCrearEG")
public class ServletCrearEG extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void doGet(HttpServletRequest peticion, HttpServletResponse respuesta)throws IOException, ServletException{
		doPost(peticion, respuesta);
	}
	private HttpSession sesionUsuario = null;
	protected void doPost(HttpServletRequest peticion, HttpServletResponse respuesta) throws ServletException, IOException {
		RequestDispatcher despachador = null;
		sesionUsuario = peticion.getSession(false);
		ImplService webService = new ImplServiceProxy(Manejador.getInstancia().getProxy());
		Estacion estacion = new Estacion();
		if(sesionUsuario!= null){
			estacion.setId(peticion.getParameter("txtId"));
			//estacion.setNombre(peticion.getParameter("txtNombre"));
			estacion.setPass(peticion.getParameter("txtPassword"));
			estacion.setTipo("General");
			webService.crearEstacion(estacion);
			peticion.setAttribute("contacto", "contacto");
		}
		despachador = peticion.getRequestDispatcher("home.jsp");
		despachador.forward(peticion, respuesta);
	}

}
