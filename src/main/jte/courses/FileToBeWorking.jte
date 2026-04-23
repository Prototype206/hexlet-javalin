@import org.example.hexlet.dto.courses.CoursesPage
@import java.util.List
@import org.example.hexlet.model.Course
@param CoursesPage page

<!DOCTYPE html>
<html lang="ru">
<head>
	<meta charset="UTF-8">
	<title>Big name</title>
</head>
<body>
	<h1>${page.getHeader()}</h1>
	<ul>
		@for(Course course : page.getCourses())
			<li>id = ${course.getId()} <a href = "/courses/${course.getId()}">name = ${course.getName()}</a> description = ${course.getDescription()}</li>
		@endfor
		
		@if(page.getCourses().size() == 0)
			<div>Nothing to watch</div>
		@endif
	</ul>
</body>
</html>