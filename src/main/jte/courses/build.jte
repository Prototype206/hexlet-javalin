<!DOCTYPE>
<html lang="ru">
<head>
	<meta charset="UTF-8">
	<title>Courses build</title>
</head>
<body>

<form action="/courses" method="post">

  <div>
    <label>
      Name
      <input type="text" required name="nAme" />
    </label>
  </div>
  
  <div>
    <label>
      Description
      <input type="textarea" name="dEscription" />
    </label>
  </div>
  
  
  <input type="submit" value="Create" />
</form>

</body>
</html>