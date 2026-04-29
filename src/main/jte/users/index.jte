@import org.example.hexlet.dto.users.UsersPage
@import org.example.hexlet.model.User
@param UsersPage page

<html lang="ru">
    <head>
    	<meta charset = "UTF-8">
        <title>Hexlet</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">
    </head>    
    <body>
    	@if(page.getFlash() != null)
			<div class="alert alert-success">${page.getFlash()}</div>
		@endif
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
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"></script>
    </body>
</html>