@import gg.jte.Content
@import org.example.hexlet.NamedRoutes
@import org.example.hexlet.dto.courses.CoursesPage
@import org.example.hexlet.dto.BasePage

@param Content content
@param BasePage page

<!DOCTYPE html>
<html lang="ru">
	<head>
		<meta charset="UTF-8">
		<title>TITLE</title>
		
	</head>
	<body>
		@if(page.getFlash() != null)
    		<div>${page.getFlash()}</div>
    	@endif
		<h1>Javalin</h1>
		<h2><a href = "${NamedRoutes.coursesPath()}">Come back to main</a></h2>
		<div>
			${content}
		</div>
		<div><a href = "https://github.com/Prototype206/hexlet-javalin.git">Welcome to my page</a></div>
		
	</body>
</html>