@import java.util.List
@import org.example.hexlet.model.Course

@param List<Course> courses


@template.layout.main(
	content = @`
		<table border = "1">
			<tr>
				<th>ID</th>
				<th>NAME</th>
				<th>DESCRIPTION</th>
			</tr>
			@for(Course course : courses)
				<tr>
					<td><a href = "/courses/${course.getId()}">${course.getId()}</a></td>
					<td>${course.getName()}</td>
					<td>${course.getDescription()}</td>
				</tr>
			@endfor
		</table>
	`
)