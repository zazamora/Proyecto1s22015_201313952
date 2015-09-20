package com.transmetro.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.transmetro.manejador.Manejador;

import com.transmetro.estructuras.Informacion;
import com.transmetro.ws.ImplService;
import com.transmetro.ws.ImplServiceProxy;

/**
 * Servlet implementation class ServletRegistrarUsuario
 */
@WebServlet("/ServletRegistrarUsuario")
public class ServletRegistrarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest peticion, HttpServletResponse respuesta)throws IOException, ServletException{
		doPost(peticion, respuesta);
	}

    public void doPost(HttpServletRequest peticion, HttpServletResponse respuesta) throws ServletException, IOException {
    	ImplService webService = new ImplServiceProxy(Manejador.getInstancia().getProxy());
    	RequestDispatcher despachador = null;
    	Informacion usuario = new Informacion();
    	usuario.setNombre(peticion.getParameter("txtNombre"));
    	usuario.setApellido(peticion.getParameter("txtApellido"));
    	usuario.setCorreo(peticion.getParameter("txtEmail"));
    	usuario.setContrasena(peticion.getParameter("txtPassword"));
    	webService.crearAdmin(usuario);
    	despachador = peticion.getRequestDispatcher("home.jsp");
		despachador.forward(peticion, respuesta);
	}

}
