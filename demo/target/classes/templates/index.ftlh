<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<a href="newTask">Add new task</a>
		
	<h2>TO do list</h2>
	
	<br/>
	<br/>
	<a href="/sortByPriority">Sort by priority</a>
	
	<table>
		<tr>
			<td>priority</td>
			<td>description</td>
			<td>date</td>
		</tr>	
		
		<#list tasks as task>
			<tr>
				<td>${task.priority}</td>
				<td>${task.desc}</td>
				<td>${task.date}</td>
				<td><a href="${'tasks/'+task.id}">Done</a></td>
			</tr>
		</#list>
	</table>
</body>
</html>