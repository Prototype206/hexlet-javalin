@import org.example.hexlet.NamedRoutes



<html lang = "ru">
	<head>
		<meta charset = "UTF-8">
		<title>Cars</title>
	</head>
	
	<body>
		<form action="${NamedRoutes.carsPath()}" method="post">
			<input type="text" name="make" placeholder="car make"/>
			<input type="text" name="model" placeholder="car model"/>
			<input type="submit" value="Create"/>
		</form>
	</body>
	
</html>