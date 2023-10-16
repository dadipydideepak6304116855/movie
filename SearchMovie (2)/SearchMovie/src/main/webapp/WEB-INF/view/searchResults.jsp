<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search Results</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body style="background-color:ligtgreen;">
	<div class="container mt-4">
		<h1>Search Results</h1>
		<c:if test="${not empty movies}">
			<table class="table table-striped">
				<thead>
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
		</c:if>
		<c:if test="${empty movies}">
			<p>No movies found with the given name.</p>
		</c:if>
	</div>
</body>
</html>
