<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<!--[if lt IE 9]>
	<script src="js/html5.js"></script>
<![endif]-->
<html lang="es">
<head>
	<meta charset="utf-8" />
	<title>TRANSMETRO 2.0</title>
	<link type="image/x-icon" href="imagenes/gmail-ico.ico" rel="shortcut icon" />
	<link type="text/css" rel="stylesheet" href="estilos/styles.css" />
	<script type="text/javascript" src="js/jquery-1.7.1.min.js"></script>
    <script type="text/javascript" src="js/script.js"></script>

</head>
<body>
	<header>
		<aside id="top-header"></aside>
		<nav id="user-opt">
			<ul>
				<%
					
						String usuario = (String)session.getAttribute("usuario");
					if(usuario == null){
						out.println("<li id='usuario' class='smallBox'><a href='registro.jsp' title='Invitado'>Registrar</a></li>");
						out.println("<li id='login' class='smallBox'><span></span><a title='Iniciar Sesión' href='index.jsp'>Ingresar</a></li>");
					}else{	
						out.println("<li id='usuario' class='smallBox'><a href='#' title='"+ "Gmail" + "'>"+ usuario +"</a></li>");
						out.println("<li id='login' class='smallBox'><span></span><a title='Cerrar Sesión' href='ServletLogout.do'>Cerrar Sesión</a></li>");
					}
				%>
				
				
			</ul>
		</nav>
		<hgroup id="logo">
			<h1><a href="index.jsp">USACGmail</a></h1>
		</hgroup>
	</header>
	<div id="body-wrapper">
		<section id="sidebar">
			<nav id="menu-bar" class="smallBox">
				<ul>
					<li title="Nuevo Administrador" class="button" id="carrito"><span></span><a class="ajax" href="ServletNuevoAdmin.do">Nuevo Administrador</a></li>
					<li title="Nueva Estacion Clave" class="button" id="home"><span></span><a class="ajax" href="ServletNuevaEC.do">Nueva Estacion Clave</a></li>
					<li title="Nueva Estacion General" class="button" id="catalogo"><span></span><a class="ajax" href="ServletNuevaEG.do">Nueva Estacion General</a></li>
					<li title="Nuevo Chofer" class="button" id="nuevo"><span></span><a class="ajax" href="ServletNuevoChofer.do">Nuevo Chofer</a></li>
					<li title="Nuevo Bus" class="button" id="nuevo"><span></span><a class="ajax" href="ServletNuevoBus.do">Nuevo Bus</a></li>
					<li title="Nueva Ruta" class="button" id="nuevo"><span></span><a class="ajax" href="ServletNuevaRuta.do">Nueva Ruta</a></li>
					<li title="Lista Buses" class="button" id="nuevo"><span></span><a class="ajax" href="ServletListaBuses.do">Lista Buses</a></li>
					<li title="Lista Choferes" class="button" id="nuevo"><span></span><a class="ajax" href="ServletListaChofer.do">Lista Choferes</a></li>
				</ul>
			</nav>
		</section>
		
		<section id="content-wrapper">
		   <section id="contenido">
				<div id="bienvenida"></div>
				<div id="backboard">
					<h2>MI PRIMER TRANSMETRO</h2>
					<br>
					${usuario}
				</div>
				<p>${registro}</p>
		   </section>
		</section>
	</div>
	<footer>
		<p style="margin:0 auto;text-align:center;">UNIVERSIDAD DE SAN CARLOS DE GUATEMALA</p>
	</footer>
</body>
</html>