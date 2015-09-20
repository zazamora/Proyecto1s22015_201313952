package com.transmetro.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@SuppressWarnings("serial")
public class ServletLogout extends HttpServlet {
	private HttpSession sesionUsuario = null;
	protected void doGet(HttpServletRequest peticion,HttpServletResponse respuesta) throws ServletException, IOException {
		doPost(peticion,respuesta);
	}

	protected void doPost(HttpServletRequest peticion,HttpServletResponse respuesta) throws ServletException, IOException {
		sesionUsuario = peticion.getSession(false);
		if(sesionUsuario!= null){
			sesionUsuario.invalidate();	
			respuesta.sendRedirect("index.jsp");
		}
	}

}
