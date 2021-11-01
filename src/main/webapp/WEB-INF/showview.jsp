<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Show</title>
	</head>
	<body>
		<h1>${ DojoList.getDojos_name() } Ninjas</h1>
		<table>
	        <thead>
	            <tr>
	                <th>First Name</th>
	                <th>Last Name</th>
	                <th>Age</th>
	            </tr>
	        </thead>
	        <tbody>
	            <c:forEach items="${ DojoList.getNinjas() }" var="ninja">
		             <tr>
		                 <td>${ ninja.getFirstName() }</td> 
		                 <td>${ ninja.getLastName() }</td>
		                 <td>${ ninja.getAge() }</td>
		             </tr>
	            </c:forEach>
	        </tbody>
	    </table>
	    <a href="/dojo">Home</a>
	</body>
</html>
