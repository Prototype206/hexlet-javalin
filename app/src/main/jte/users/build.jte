@import org.example.hexlet.dto.users.BuildUserPage
@param BuildUserPage page

<!DOCTYPE>
<html lang="ru">
<head>
	<meta charset="UTF-8">
	<title>title</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	@if(page.getFlash() != null)
		<div class="alert alert-danger">${page.getFlash()}</div>
	@endif

	@if(page.getErrors() != null)
	    <ul>
	        @for(var validator : page.getErrors().values())
	            @for(var error : validator)
	                <li>${error.getMessage()}</li>
	            @endfor
	        @endfor
	    </ul>
	@endif
	
	<form action="/users" method="post">
	
	  <div>
	    <label>
	      Name
	      <input type="text" name="name" value="${page.getName()}"/>
	    </label>
	  </div>
	  
	  <div>
	    <label>
	      Email
	      <input type="email" required name="email" value="${page.getEmail()}"/>
	    </label>
	  </div>
	  
	  <div>
	    <label>
	      Password
	      <input type="password" required name="password" value="${page.getPassword()}"/>
	    </label>
	  </div>
	  
	  <div>
	    <label>
	      Password confirmation
	      <input type="password" required name="passwordConfirmation" />
	    </label>
	  </div>
	  
	  <input type="submit" value="Register" />
	</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>