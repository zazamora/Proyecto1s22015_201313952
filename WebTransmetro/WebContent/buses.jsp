<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="org.transmetro.bean.Busito" %>
<!DOCTYPE html>
<!--[if lt IE 9]>
	<script src="js/html5.js"></script>
<![endif]-->
<html lang="es">
<head>
	<meta charset="utf-8" />
	<title>BUSES</title>
	<script type="text/javascript" src="js/jquery-1.7.1.min.js"></script>
    <script type="text/javascript" src="js/script.js"></script>

</head>
<body>
	<section id="tabla-catalogo" class="box-container">
		<form name="catalogo-libros" >
			<table id="catalogo">
				<caption>LISTA DE BUSES</caption>
				<thead>
					<tr>
						<th>ID BUS &nbsp;</th>
						<th>RUTA &nbsp;</th>
						<th>CLAVE CHOFER &nbsp;</th>
						<th>HORARIO INICIO &nbsp;</th>
						<th>HORARIO FIN &nbsp;</th>
						<th>FECHA</th>
					</tr>
				</thead>
				<tbody>
				
					<c:forEach var="bus" items="${listabuses}" varStatus="contador">	
						<tr>
							<td>${bus.getId()}</td>
							<td>${bus.getRuta()}</td>
							<td>${bus.getClaveChofer()}"</td>
							<td>${bus.getHorarioInicio()}</td>
							<td>${bus.getHorarioFin()}</td>
							<td>${bus.getFecha()}</td>
							<td><input name="productos" type="checkbox" value="${bus.getId()}" alt="525"></td>
						</tr>
					</c:forEach>
				</tbody>
				
				<tfoot>
					<tr>
						<td colspan="3" align="center">
							<input type="submit" name="agregar-carrito"  id="ServletEditarBus" class="button ajax" value="Editar Bus">					
						</td>
					</tr>
				</tfoot>
				
			</table>
		</form>
	</section>
</body>
</html>