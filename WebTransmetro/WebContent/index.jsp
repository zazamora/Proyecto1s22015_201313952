<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ingreso de Usuario</title>
<link type="text/css" rel="stylesheet" href="estilos/styles.css" />
		<script type="text/javascript" src="js/jquery-1.7.1.min.js"></script>
		<script type="text/javascript" src="js/script.js"></script>
<style type="text/css">
body{
	color:#fff;
	font-size:16px;
	background: #ADD926 url(imagenes/bg.png);
	background-repeat:no-repeat;
	background-position:top center;
}
form{
	position:relative;
	margin: 5% 15%;
}

</style>
</head>
<body>
	<section id="login-ext">
		<div id="login-box-ext" class="box-container-ext">
			<h1>Ingreso de Usuario</h1>
			<% 
			HttpSession sesion = null;
			sesion = request.getSession(false);
			
			if(sesion == null || sesion.getAttribute("usuario") == null){
				out.println("<form name='login-form' method='post' action='ServletAutenticarUsuario.do'>" +
				"<table>"+
					"<tr>"+
						"<td>Nombre de Usuario</td>"+
						"<td><input type='text' name='txtLogin'  id='username' class='myBoxSmall'></td>"+
					"</tr>"+
					"<tr>"+
						"<td>Contraseña</td>"+
						"<td><input type='password' name='txtPassword' id='password' class='myBoxSmall'></td>"+
					"</tr>"+
					"<tr>"+
						"<td><a href='register.jsp' title='Registrar'>Crear una Cuenta</a></td>"+
						"<td><input value='ENTRAR' type='submit' name='loguear' class='MyBoxSmall button'></td>"+
					"</tr>"+
				"</table>"+
			"</form>");
			}else{
				out.println("<p>Usted ya ha iniciado Sesión</p>");
				out.println("<form name='login-form' method='post' action='ServletLogout.do'>" +
						"<input value='SALIR' type='submit' name='loguear' class='MyBoxSmall button'>" +
						"</form>");
			}
				
			%>
		</div>
	</section>
</body>
</html>