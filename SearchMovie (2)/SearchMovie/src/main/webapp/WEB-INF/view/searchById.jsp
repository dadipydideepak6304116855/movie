<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Search Movie by Name</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
          crossorigin="anonymous">
</head>
<body style="background-color:#DDA0DD">
<div class="container mt-4">
    <h1>Search Movie by Id</h1>
    <form action="/movies/searchById" method="post">
        <div class="form-group">
            <label for="movieId">Enter Movie Id:</label>
            <input type="text" class="form-control" id="movieId" name="movieId" required>
        </div>
        <button type="submit" class="btn btn-primary">Search</button>
    </form>
</div>
</body>
</html>
