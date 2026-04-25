@import org.example.hexlet.dto.courses.CoursesPage
@import java.util.List
@import org.example.hexlet.model.Course

@param CoursesPage page


@template.layout.main(
	content = @`
		<h1>${page.getHeader()}</h1>
		<table border = "1">
			<tr>
				<th>ID</th>
				<th>NAME</th>
				<th>DESCRIPTION</th>
			</tr>
			@for(Course course : page.getCourses())
				<tr>
					<td><a href = "/courses/${course.getId()}">${course.getId()}</a></td>
					<td>${course.getName()}</td>
					<td>${course.getDescription()}</td>
				</tr>
			@endfor
		</table>
	`
)