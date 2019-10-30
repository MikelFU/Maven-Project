<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de personas</title>
</head>
<body>
	<h1>Personas encontradas</h1>
	<p><a href="personas">Ver lista de personas</a><p>
	<table border="1">
		<tr>
			<td>ID</td>
			<td>Nombre</td>
			<td>Apellido</td>
			<td>Email</td>
			<td>Dni</td>
			<td></td>
		</tr>
		<c:forEach items="${personas}" var="personas">
			<tr>
				<td>${personas.id}</td>
				<td>${personas.nombre}</td>
				<td>${personas.apellido}</td>
				<td>${personas.email}</td>
				<td>${personas.dni}</td>
				<td><a href="modificar?id=<c:out value='${personas.id}'/>">
					<img src="imagenes/modificar.png" alt="modificar" height="20px" title="Modificar"/></a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>