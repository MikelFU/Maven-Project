<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Añada una nueva persona</title>
</head>
<body>
	<form action="" method="post">
		<label>Nombre</label>
		<input type="text" name="nombre"/>
		<label>Apellido</label>
		<input type="text" name="apellido"/>
		<label>Email</label>
		<input type="text" name="email"/>
		<label>DNI</label>
		<input type="text" name="dni"/>
		<button>Añadir</button>
	</form>
	<p><a href="personas">Ver lista de personas</a><p>
</body>
</html>