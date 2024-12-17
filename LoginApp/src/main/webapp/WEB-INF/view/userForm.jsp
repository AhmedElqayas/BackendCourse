<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>
<h2>Hello</h2><br>
<form:form action="processForm" modelAttribute="userModel">
    <form:input type="text" placeholder="Username" path="username"/>
    <br>
    <form:input type="text" placeholder="Password" path="password"/>
    <br>
    <form:select path="country">
        <form:option value="Egypt" label="Egy"/>
        <form:option value="Unites States" label="UAE"/>
        <form:option value="Saudi Arabia" label="KSA"/>
    </form:select>
    <br>
    <form:radiobutton path="programmingLanguage" value="Java" label="Java"/>
    <form:radiobutton path="programmingLanguage" value="C#" label="C#"/>
    <form:radiobutton path="programmingLanguage" value="Python" label="Python"/>
    <br>
    <form:checkbox path="operatingSystems" value="Windows" label="Windows"/>
    <form:checkbox path="operatingSystems" value="Mac" label="Mac"/>
    <form:checkbox path="operatingSystems" value="Linux" label="Linux"/>
    <br>
    <input type="submit"/>
</form:form>

</body>
</html>
