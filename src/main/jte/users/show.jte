@import org.example.hexlet.dto.users.UserPage
@import org.example.hexlet.model.User
@param UserPage page

<html>
    <head>
        <title>Hexlet</title>
    </head>
    <body>
		
		<div>
		<table border = "1">
			<tr>
				<th>ID</th>
				<th>NAME</th>
				<th>EMAIL</th>
				<th>PASSWORD</th>
			</tr>
			<tr>
				<td>${page.getUser().getId()}</td>
				<td>${page.getUser().getName()}</td>
				<td>${page.getUser().getEmail()}</td>
				<td>${page.getUser().getPassword()}</td>
			</tr>
		</table>
		</div>
		
    </body>
</html>