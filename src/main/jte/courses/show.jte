@import org.example.hexlet.model.Course
@param Course page

@template.layout.main(
	content = @`
		<table border="1">
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>DESCRIPTION</th>
		</tr>
		<tr>
			<td>${page.getId()}</td>
			<td>${page.getName()}</td>
			<td>${page.getDescription()}</td>
		</tr>	
		</table>
	`
)
