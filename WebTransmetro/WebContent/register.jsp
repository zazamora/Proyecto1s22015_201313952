<%@ page language='java' contentType='text/html; charset=ISO-8859-1'
    pageEncoding='ISO-8859-1'%>
<!DOCTYPE html>
<html>
<head>
<meta charset='ISO-8859-1'>
<title>Registro de Usuario</title>
<link type='text/css' rel='stylesheet' href='estilos/styles.css' />
</head>
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
	margin: 1% 15%;
}

</style>
<body>
<section id='register-ext'>
		<div id='backtologin'><a href='index.jsp' class='button'>Iniciar Sesión</a></div>
		<div class='box-container-ext'>
			<h1>Formulario de Registro</h1>
			<% 
			HttpSession sesion = null;
			sesion = request.getSession(false);
			
			if(sesion == null || sesion.getAttribute("usuario") == null){
				out.println("<form name='frm-registro' method='post' action='ServletRegistrarUsuario.do'>" +
					"<table>"+
						"<tr>"+
							"<td>Nombre</td>"+
							"<td><input type='text' name='txtNombre'></td>"+
						"</tr>"+
						"<tr>"+
						"<td>Apellido</td>"+
						"<td><input type='text' name='txtApellido'></td>"+
						"</tr>	"+
						"<tr>"+
							"<td>Email</td>"+
							"<td><input type='text' name='txtEmail'></td>"+
						"</tr>	"+	
						"<tr>"+
							"<td>Password</td>"+
							"<td><input type='password' name='txtPassword'></td>"+
						"</tr>"+		
						"<tr>"+
							"<td><input value='Registrar' type='submit' name='btnRegistro' class='button'></td>"+
							"<td><input value='Reestablecer' type='reset' name='btnLimpiar' class='button'></td>"+
						"</tr>	"+
					"</table>"+
				"</form>");
			}else{
				out.println("<p>Usted ya tiene registrada una cuenta</p>");
				out.println("<form name='frm-registro' method='post' action='ServletRegistrarUsuario.do'>" +
						"<input value='Registrar' type='submit' name='btnRegistro' class='button'>" + 
				"</form>");
			}
			%>
		</div>
	</section>

</body>
</html>