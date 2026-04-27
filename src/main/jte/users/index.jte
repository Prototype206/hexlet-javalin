@import java.util.List
@import org.example.hexlet.dto.users.UsersPage
@import org.example.hexlet.model.User
@param UsersPage page

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
			@for(User user : page.getUsers())
			<tr>
				<td>${user.getId()}</td>
				<td>${user.getName()}</td>
				<td>${user.getEmail()}</td>
				<td>${user.getPassword()}</td>
			</tr>
			@endfor
		</table>
		</div>
		
    </body>
</html>