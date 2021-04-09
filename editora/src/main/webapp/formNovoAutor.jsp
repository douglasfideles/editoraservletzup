<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:url value="/novoAutor" var="linkNovoAutor"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form to add a new Enterprise</title>
</head>
<body>

	<form action="${linkNovoAutor}" value="/novoAutor" method="POST"/>
	Name: <input type="text" name="nome"/>
	E-mail: <input type="text" name="email"/>
	<input type="submit" />
	</form>

</body>
</html>