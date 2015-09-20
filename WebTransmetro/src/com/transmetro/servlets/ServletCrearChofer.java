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

import com.transmetro.estructuras.Chofer;
import com.transmetro.ws.ImplService;
import com.transmetro.ws.ImplServiceProxy;

/**
 * Servlet implementation class ServletCrearChofer
 */
@WebServlet("/ServletCrearChofer")
public class ServletCrearChofer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void doGet(HttpServletRequest peticion, HttpServletResponse respuesta)throws IOException, ServletException{
		doPost(peticion, respuesta);
	}
	private HttpSession sesionUsuario = null;
	protected void doPost(HttpServletRequest peticion, HttpServletResponse respuesta) throws ServletException, IOException {
		RequestDispatcher despachador = null;
		sesionUsuario = peticion.getSession(false);
		ImplService webService = new ImplServiceProxy(Manejador.getInstancia().getProxy());
		Chofer chofer = new Chofer();
		if(sesionUsuario!= null){
			chofer.setNombre(peticion.getParameter("txtNombre"));
			chofer.setApellido(peticion.getParameter("txtApellido"));
			chofer.setClave(Integer.parseInt(peticion.getParameter("txtClave")));
			chofer.setContrasena(peticion.getParameter("txtPassword"));
			webService.crearChofer(chofer);
		}
		despachador = peticion.getRequestDispatcher("home.jsp");
		despachador.forward(peticion, respuesta);
	}

}
