<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">please register here.</h1>

	<form:form action="registration-success" method="GET" modelAttribute="userReg">
	
        <div align="center">
		<label>User :</label>
		<form:input path="name" />

		<br/>

		<label>User Name: </label>
		<form:input path="userName" />

		<br/>

		<label>Password : </label>
		<form:input path="password" />
		
		<br/>

		<label>Country : </label>
		<form:select path="countryName">
			<form:option value="Ind" label="India"></form:option>
			<form:option value="Usa" label="United States"></form:option>
			<form:option value="Lon" label="London"></form:option>
			<form:option value="Sri" label="Srilanka"></form:option>
			<form:option value="Pak" label="Pakistan"></form:option>


		</form:select>
		
		<br/>

		<label>Hobbies : </label>
		Cricket : <form:checkbox path="hobbies" value="cricket" />
		Reading : <form:checkbox path="hobbies" value="reading"/>
		Travel : <form:checkbox path="hobbies" value="travel"/>
		Programming : <form:checkbox path="hobbies" value="programming"/>
		
		<br/>
		<label>Gender : </label>
		Male<form:radiobutton path="gender" value="male"/>
		Female<form:radiobutton path="gender" value="female"/>
		
		<br/>
		
		<input type="submit" value="register">


    </div>
	</form:form>
	

</body>
</html>