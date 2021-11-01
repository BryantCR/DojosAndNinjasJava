<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Ninja</title>
	<link rel="stylesheet" href="./css/dojohome2.css"/>
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
                            <a href="/dojo">Home</a>
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
                    <form class="form1" action="/ninja/add" method="POST">
                    	<div>
                            <label class="formLabel" for="dojoName">
                            Dojo
                            </label>
                            <select name="dojos_id">
					            <c:forEach var = "dojo" items = "${DojoList}">
					                <option value="${dojo.getId()}">
					                	<c:out value = "${dojo.getDojos_name()}" ></c:out>
					                </option>
					            </c:forEach>
					        </select>  
                        </div>
                        <div>
                            <label class="formLabel" for="first_name">
                            First Name
                            </label>
                            <input class="formInput" type="text" name="first_name" id="dojoName" placeholder="Ninja Name Here">
                        </div>
                        <div>
                            <label class="formLabel" for="last_name">
                            Last Name
                            </label>
                            <input class="formInput" type="text" name="last_name" id="dojoName" placeholder="Ninja Last Name Here">
                        </div>
                        <div>
                            <label class="formLabel" for="age">
                            Age
                            </label>
                            <input class="formInput" type="text" name="age" id="dojoName" placeholder="Ninja age here">
                        </div>
                        <input class="submitForm1" type="submit" name="" id="" value="Create">
                    </form>
                </div>
            </div>
        </main>
        <footer class="bg-dark">
            <p>
                Author: Bryan Cascante Vargas
            </p>
        </footer>
	</body>
</html>