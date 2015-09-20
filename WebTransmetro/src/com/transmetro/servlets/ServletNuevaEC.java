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
 * Servlet implementation class ServletNuevaEC
 */
@SuppressWarnings("serial")
public class ServletNuevaEC extends HttpServlet {
	protected void doGet(HttpServletRequest peticion, HttpServletResponse respuesta) throws ServletException, IOException {
		doPost(peticion, respuesta);
	}
	private HttpSession sesionUsuario = null;
	protected void doPost(HttpServletRequest peticion, HttpServletResponse respuesta) throws ServletException, IOException {
		RequestDispatcher despachador = null;
		sesionUsuario = peticion.getSession(false);
		if(sesionUsuario!= null){
			peticion.setAttribute("contacto", "contacto");
		}
		despachador = peticion.getRequestDispatcher("nuevaEC.jsp");
		despachador.forward(peticion, respuesta);
	}
}
