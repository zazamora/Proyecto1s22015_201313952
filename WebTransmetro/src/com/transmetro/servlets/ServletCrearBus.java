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

import com.transmetro.estructuras.Bus;
import com.transmetro.ws.ImplService;
import com.transmetro.ws.ImplServiceProxy;

/**
 * Servlet implementation class ServletCrearBus
 */
@WebServlet("/ServletCrearBus")
public class ServletCrearBus extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void doGet(HttpServletRequest peticion, HttpServletResponse respuesta)throws IOException, ServletException{
		doPost(peticion, respuesta);
	}
	private HttpSession sesionUsuario = null;
	protected void doPost(HttpServletRequest peticion, HttpServletResponse respuesta) throws ServletException, IOException {
		ImplService webService = new ImplServiceProxy(Manejador.getInstancia().getProxy());
		RequestDispatcher despachador = null;
		sesionUsuario = peticion.getSession(false);
		if(sesionUsuario!= null){
			Bus bus = new Bus();
			bus.setId(peticion.getParameter("txtId"));
			webService.crearBus(bus);
		}
		despachador = peticion.getRequestDispatcher("home.jsp");
		despachador.forward(peticion, respuesta);
	}

}
