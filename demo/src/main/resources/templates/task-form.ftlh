<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add new Task</title>
</head>
<body>
	<form action="/processForm" method="post">
		
		<div>
			<label>Description</label>
			<input type="text" name="desc">
		</div>
	
		<div>
			<label>Priority</label>
			<input type="number" name="priority">
		</div>
		
		<div>
			<label>Date</label>
			<input type="date" name="date">
		</div>
		
		<input type="submit" value="Add">
		
	</form>
</body>
</html>