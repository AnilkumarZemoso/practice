<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<html>

<head>
	<title>Student Registration Form</title>

	<style>
	    .error (color:red}
	</style>

</head>

<body>

	<form:form action="processForm" modelAttribute="student">
	
		First name(*): <form:input path="firstName" />
		<form:errors path="firstName" cssClass="error" />
		
		<br><br>
	
		Last name(*): <form:input path="lastName" />
		<form:errors path="lastName" cssClass="error" />
		
		<br><br>

		Gender(*):

		Female <form:radiobutton path="gender" value="Female"/>
		Male <form:radiobutton path="gender" value="Male"/>
		Other <form:radiobutton path="gender" value="Other"/>
		<form:errors path="gender" cssClass="error" />

		<br><br>

		Age:

		<form:input path="age" />
		<form:errors path="age" cssClass="error" />

		<br><br>

		Email:

        <form:input path="email" />
        <form:errors path="email" cssClass="error" />

        <br><br>

        StudentId:

        <form:input path="studentId" />
        <form:errors path="studentId" cssClass="error" />

        <br><br>
	
		Country:
		
		<form:select path="country">
		
			<form:options items="${student.countryOptions}" />
			
		</form:select>
				
		<br><br>

		Favorite Language:
		
		Java <form:radiobutton path="favoriteLanguage" value="Java" />
		Python <form:radiobutton path="favoriteLanguage" value="Python" />
		PHP <form:radiobutton path="favoriteLanguage" value="PHP" />
		C <form:radiobutton path="favoriteLanguage" value="C" />

		<br><br>

		Operating Systems:
		
		Linux <form:checkbox path="operatingSystems" value="Linux" />
		Mac OS <form:checkbox path="operatingSystems" value="Mac OS" />
		MS Windows <form:checkbox path="operatingSystems" value="MS Window" />

		<br><br>
	
		<input type="submit" value="Submit" />
	
	</form:form>


</body>

</html>












