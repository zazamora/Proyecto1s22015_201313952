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
	<title>NUEVO BUS</title>
	<script type="text/javascript" src="js/jquery-1.7.1.min.js"></script>
    <script type="text/javascript" src="js/script.js"></script>
    
    <link rel="stylesheet" href="newStyle/css/style.css" type="text/css" media="screen">
    
</head>
<body>
	<section id="tabla-catalogo" class="box-container">
			<!-- <div class="main">
				<div class="indent-left">
					<div class="wrapper">-->
						<article class="col-1">
							<h3>Nuevo Bus</h3>
							<form id="contact-form" name="catalogo-libros" method="post" action="ServletCrearBus.do">
								<fieldset>
									<label>
										<input type='text' name='txtNombre' value="Nombre" onBlur="if(this.value=='') this.value='Nombre'" onFocus="if(this.value =='Nombre' ) this.value=''" id='name' class='myBoxSmall'>
									</label>
									<label>
										<input type='text' name='txtId' value="Id" onBlur="if(this.value=='') this.value='Id'" onFocus="if(this.value =='Id' ) this.value=''" id='id' class='myBoxSmall'>
									</label>
									<div class="buttons-wrapper">
										<input value='Agregar' type='submit' name='btnRegistro' class='button'>
										<input value='Reestablecer' type='reset' name='btnLimpiar' class='button'>
									</div>
								</fieldset>
							</form>
						</article>
					<!--</div>
				</div>
			</div>-->
		</section>
</body>
</html>