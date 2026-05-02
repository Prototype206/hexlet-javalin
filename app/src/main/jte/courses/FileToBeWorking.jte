@import org.example.hexlet.NamedRoutes
@import java.util.List
@import org.example.hexlet.model.Course

@param List<Course> courses


@template.layout.main(
	content = @`
	<h1>List of courses</h1>
	@if(courses.isEmpty())
    	<p>There is no course here yet</p>
	@else
		<table border = "1">
			<tr>
				<th>ID</th>
				<th>NAME</th>
				<th>DESCRIPTION</th>
			</tr>
			@for(Course course : courses)
				<tr>
					<td>${course.getId()}</td>
					<td><a href="${NamedRoutes.coursePath(course.getId())}">${course.getName()}</a></td>
					<td>${course.getDescription()}</td>
				</tr>
			@endfor
		</table>
	@endif
	`
)