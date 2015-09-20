package com.transmetro.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import org.transmetro.bean.Graficar;
import org.transmetro.manejador.Manejador;

import com.transmetro.estructuras.Informacion;
import com.transmetro.ws.ImplService;
import com.transmetro.ws.ImplServiceProxy;

/**
 * Servlet implementation class ServletAutenticarUsuario
 */
@WebServlet("/ServletAutenticarUsuario")
public class ServletAutenticarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private HttpSession sesionUsuario = null;
	public void doPost(HttpServletRequest peticion, HttpServletResponse respuesta) throws ServletException, IOException {
		ImplService webService = new ImplServiceProxy(Manejador.getInstancia().getProxy());
		Informacion user = null;
		String iduser = peticion.getParameter("txtLogin");
		user = webService.validaLogin(iduser, peticion.getParameter("txtPassword"), 1);
		if(user != null){
			sesionUsuario = peticion.getSession(true);
	    	sesionUsuario.setAttribute("usuario", iduser);
	    	respuesta.sendRedirect("home.jsp");
		}else{
			peticion.setAttribute("error", "USUARIO NO EXISTE, FAVOR REGISTRARSE");
	    	respuesta.sendRedirect("registro.jsp");
		}
	}
	public void doGet(HttpServletRequest peticion, HttpServletResponse respuesta)throws IOException, ServletException{
		doPost(peticion, respuesta);
	}

}
