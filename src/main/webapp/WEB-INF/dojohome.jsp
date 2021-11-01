<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Dojo</title>
	<link rel="stylesheet" href="./css/dojohome.css"/>
	</head>
	<body>
		<header>
            <nav class="navbar1">
                <h2 class="navbarTitle">
                    "Title here"
                </h2>
                <nav class="navDivSearch">
                    <input class="searchField" type="text" name="searchField" id="searchField" placeholder="Search">
                    <button class="searchButton" type="submit">
                        Search
                    </button>
                </nav>
                <nav class="navbarOptions">
                    <ul class="ulOptios">
                        <li class="liOption">
                            <a href="">Home</a>
                        </li>
                        <li class="liOption">
                            <a href="">Profile</a>
                        </li>
                        <li class="liOption">
                            <a href="">News</a>
                        </li>
                    </ul>
                </nav>
                <nav class="navbuttonLogOut">
                    <button class="buttonLogOut" type="submit">
                        LogOut
                    </button>
                </nav>
            </nav>
        </header>
        <main class="bg-dark">
            <div class="holdMainContent">
                <div class="mainTitle">
                    <h3  class="title">
                        Add New Dojo
                    </h3>
                </div>
                <div class="containForm1">
                    <form class="form1" action="/dojo/add" method="POST">
                        <div>
                            <label class="formLabel" for="dojos_name">
                            Dojo Name
                            </label>
                            <input class="formInput" type="text" name="dojos_name" id="dojos_name" placeholder="Dojo Name Here">
                        </div>
                        <input class="submitForm1" type="submit" name="" id="" value="Create">
                    </form>
                    <a href="/ninja">
                    	Add Ninja
                    </a>
                </div>
            </div>
		    <div>
		        <table>
			        <thead>
			            <tr>
			                <th>Dojo Name</th>
			                <th>Action</th>
			            </tr>
			        </thead>
			        <tbody>
			            <c:forEach items = "${ DojoList }" var = "dojo">
		                    <tr>
		                        <td>
		                        	<p>
					                	${dojo.dojos_name}
					                </p>
		                        </td>
		                        <td>
		                        	<a href="/dojos/${dojo.getId()}" value="${dojo.getId()}">
					                	See Students
					                </a>
		                        </td>
		                    </tr>
			            </c:forEach>
			        </tbody>
			    </table>
		    </div>
        </main>
        <footer class="bg-dark">
            <p>
                Author: Bryan Cascante Vargas
            </p>
        </footer>
	</body>
</html>