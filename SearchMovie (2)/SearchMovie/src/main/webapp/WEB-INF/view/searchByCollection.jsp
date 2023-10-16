<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Search Movie by Collection Range</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
          crossorigin="anonymous">
</head>
<body style="background-color:#DDA0DD">
<div class="container mt-4">
    <h1>Search Movie by Collection Range</h1>
    <form action="/movies/searchByRange" method="post">
        <div class="form-group">
            <label for="minRange">Enter Min Range:</label>
            <input type="number" step="0.01" class="form-control" id="minRange" name="minRange" required>
        </div>
        <div class="form-group">
            <label for="maxRange">Enter Max Range:</label>
            <input type="number" step="0.01" class="form-control" id="maxRange" name="maxRange" required>
        </div>
        <button type="submit" class="btn btn-primary">Search</button>
    </form>
</div>
</body>
</html>
