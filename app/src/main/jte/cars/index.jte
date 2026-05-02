@import java.util.List
@import org.example.hexlet.dto.cars.CarsPage
@import org.example.hexlet.model.Car


@param CarsPage page

<html lang = "ru">
	<head>
		<meta charset = "UTF-8">
		<title>Cars</title>
	</head>
	<body>
	<div>Cars</div>
	<ul>
		@for(Car car : page.getCars())
			<li>${car.getId()}, ${car.getMake()}, ${car.getModel()}</li>
		@endfor
	</ul>
	</body>

</html>