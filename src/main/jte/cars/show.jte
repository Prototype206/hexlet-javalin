@import org.example.hexlet.dto.cars.CarPage
@import org.example.hexlet.model.Car

@param CarPage page

<html lang="ru">
	<head>
		<meta charset = "UTF-8">
		<title>Cars</title>
	</head>
	
	<body>
		<div>
			<p>${page.getCar().getId()}</p>
			<p>${page.getCar().getMake()}</p>
			<p>${page.getCar().getModel()}</p>
		</div>
	</body>
	
</html>