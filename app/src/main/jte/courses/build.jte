@import org.example.hexlet.dto.courses.BuildCoursePage
@param BuildCoursePage page

<!DOCTYPE>
<html lang="ru">
<head>
	<meta charset="UTF-8">
	<title>Courses build</title>
</head>
<body>

@if(page.getErrors() != null)
    <ul>
        @for(var validator : page.getErrors().values())
            @for(var error : validator)
                <li>${error.getMessage()}</li>
            @endfor
        @endfor
    </ul>
@endif

<form action="/courses" method="post">

  <div>
    <label>
      Name
      <input type="text" required name="name" value="${page.getName()}"/>
    </label>
  </div>
  
  <div>
    <label>
      Description
      <input type="textarea" required name="description" value="${page.getDescription()}"/>
    </label>
  </div>
  
  
  <input type="submit" value="Create"/>
</form>

</body>
</html>