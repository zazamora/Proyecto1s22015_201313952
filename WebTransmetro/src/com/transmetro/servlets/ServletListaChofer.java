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

/**
 * Servlet implementation class ServletListaChofer
 */
@WebServlet("/ServletListaChofer")
public class ServletListaChofer extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest peticion, HttpServletResponse respuesta)throws IOException, ServletException{
		doPost(peticion, respuesta);
	}
	private HttpSession sesionUsuario = null;
	protected void doPost(HttpServletRequest peticion, HttpServletResponse respuesta) throws ServletException, IOException {
		RequestDispatcher despachador = null;
    	sesionUsuario = peticion.getSession(false);
    	if(sesionUsuario!= null){
    		//Manejador.getInstancia().getBuses();
			peticion.setAttribute("listachoferes", Manejador.getInstancia().getChoferes());
		}
		despachador = peticion.getRequestDispatcher("choferes.jsp");
		despachador.forward(peticion, respuesta);
	}
}
