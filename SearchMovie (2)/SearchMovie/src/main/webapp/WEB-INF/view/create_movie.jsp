<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
<body body style="background-color:#DDA0DD">

    <br>
    <br>
    <div class="container">
        <div class="row">
            <div class="col-lg-6 col-md-6 col-sm-6 container justify-content-center card">
                <h1 class="text-center">Create New Movie</h1>
                <div class="card-body">
                    <form action="/movies" method="POST">
                        <div class="form-group">
                            <label>Movie ID</label>
                            <input type="text" name="movieId" class="form-control" placeholder="Enter Movie ID" />
                        </div>

                        <div class="form-group">
                            <label>Movie Name</label>
                            <input type="text" name="movieName" class="form-control" placeholder="Enter Movie Name" />
                        </div>

                        <div class="form-group">
                            <label>Collection Range</label>
                            <input type="text" name="collectionRange" class="form-control"
                                placeholder="Enter Collection Range" />
                        </div>

                        <div class="box-footer">
                            <button type="submit" class="btn btn-primary">Submit</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
