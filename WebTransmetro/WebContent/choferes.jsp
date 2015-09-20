<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="org.transmetro.bean.Choferito" %>
<!DOCTYPE html>
<!--[if lt IE 9]>
	<script src="js/html5.js"></script>
<![endif]-->
<html lang="es">
<head>
	<meta charset="utf-8" />
	<title>CHOFERES</title>
	<script type="text/javascript" src="js/jquery-1.7.1.min.js"></script>
    <script type="text/javascript" src="js/script.js"></script>

</head>
<body>
	<section id="tabla-catalogo" class="box-container">
		<form name="catalogo-libros" >
			<table id="catalogo">
				<caption>LISTA DE CHOFERES</caption>
				<thead>
					<tr>
						<th>ID CHOFER &nbsp;</th>
						<th>NOMBRE &nbsp;</th>
						<th>APELLIDO</th>
					</tr>
				</thead>
				<tbody>
				
					<c:forEach var="chofer" items="${listachoferes}" varStatus="contador">	
						<tr>
							<td>${chofer.getClave()}</td>
							<td>${chofer.getNombre()}</td>
							<td>${chofer.getApellido()}"</td>
							<td><input name="productos" type="checkbox" value="${chofer.getClave()}" alt="525"></td>
						</tr>
					</c:forEach>
				</tbody>
				
				<tfoot>
					<tr>
						<td colspan="3" align="center">
							<input type="submit" name="agregar-carrito"  id="ServletEditarChofer" class="button ajax" value="Editar Chofer">					
						</td>
					</tr>
				</tfoot>
				
			</table>
		</form>
	</section>
</body>
</html>