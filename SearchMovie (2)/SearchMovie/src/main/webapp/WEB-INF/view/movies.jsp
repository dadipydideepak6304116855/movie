<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Movie Management System</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body style="background-color:ligtgreen;">
	<nav class="navbar navbar-expand-md bg-dark navbar-dark">
		<!-- Brand -->
		<a class="navbar-brand" href="#">Movie Management System</a>

		<!-- Toggler/collapsible Button -->
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#collapsibleNavbar">
			<span class="navbar-toggler-icon"></span>
		</button>
	</nav>

	<div class="container">
		<div class="row">
			<h1>List Movies</h1>
		</div>

		<div class="row">
			<div class="col-lg-3">
				<a href="/movies/new" class="btn btn-primary btn-sm mb-3"> Add
					Movie</a>
			</div>
		</div>
		<div>
		<div><a href="/searchById">Search By ID</a></div>
		<div><a href="/searchByName">Search By Name</a></div>
		<div><a href="/searchByCollection">Search By Collection</a></div>
		</div>
		<table class="table table-striped table-bordered">
			<thead class="table-dark">
				<tr>
					<th>Movie ID</th>
					<th>Movie Name</th>
					<th>Collection Range</th>
				
				</tr>
			</thead>

			<tbody>
				<c:forEach items="${movies}" var="movie">
                    <tr>
                    	<td>${movie.movieId}</td>
						<td>${movie.movieName}</td>
						<td>${movie.collectionRange}</td>
				
					</tr>
				</c:forEach>
			</tbody>
		</table>

	</div>
</body>
</html>
