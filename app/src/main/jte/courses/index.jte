@import org.example.hexlet.dto.courses.CoursesPage
@import org.example.hexlet.model.Course
@param CoursesPage page

@template.layout.main(
	page = page,
	content = @`
    <p>Фильтры</p>
		<form action="/courses" method="get">
			<input type="search" name="term" value="${page.getTerm()}" />
			<input type = "search", name="filter", value="${page.getFilter()}" />
			<input type="submit" value="Search" />
		</form>
		
		<p>Курсы</p>
		<div>
		<table border = "1">
			<tr>
				<th>ID</th>
				<th>NAME</th>
				<th>DESCRIPTION</th>
			</tr>
			@for(Course course : page.getCourses())
			<tr>
				<td>${course.getId()}</td>
				<td>${course.getName()}</td>
				<td>${course.getDescription()}</td>
			</tr>
			@endfor
		</table>
		</div>
		`)