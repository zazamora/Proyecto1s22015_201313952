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

import com.transmetro.estructuras.Ruta;
import com.transmetro.ws.ImplService;
import com.transmetro.ws.ImplServiceProxy;

/**
 * Servlet implementation class ServletCrearRuta
 */
@SuppressWarnings("serial")
public class ServletCrearRuta extends HttpServlet {
	public void doGet(HttpServletRequest peticion, HttpServletResponse respuesta)throws IOException, ServletException{
		doPost(peticion, respuesta);
	}
	private HttpSession sesionUsuario = null;
	protected void doPost(HttpServletRequest peticion, HttpServletResponse respuesta) throws ServletException, IOException {
		RequestDispatcher despachador = null;
		sesionUsuario = peticion.getSession(false);
		ImplService webService = new ImplServiceProxy(Manejador.getInstancia().getProxy());
		Ruta ruta = new Ruta();
		if(sesionUsuario!= null){
			ruta.setNombre(peticion.getParameter("txtNombre"));
			//Falta agregar las estaciones posibles que puede tener la ruta.
			webService.crearRuta(ruta);
		}
		despachador = peticion.getRequestDispatcher("home.jsp");
		despachador.forward(peticion, respuesta);
	}

}
