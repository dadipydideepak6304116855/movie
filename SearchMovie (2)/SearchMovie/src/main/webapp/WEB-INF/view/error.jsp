<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel='stylesheet'
href='https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/css/bootstrap.min.css'>
<link rel='stylesheet' href='https://fonts.googleapis.com/css?family=Arvo'>
<title>Un-Authorized</title>
<style>
    .page_404 {
        padding: 40px 0;
        background: #fff;
        font-family: 'Arvo', serif;
    }

    .four_zero_four_bg h1 {
        font-size: 80px;
    }

    .four_zero_four_bg h3 {
        font-size: 60px;
    }

    .link_404 {
        color: #fff !important;
        display: inline-block;
    }

    .contant_box_404 {
        margin-top: -10px;
    }
</style>
</head>
<body>
    <section class="page_404">
        <div class="container">
            <div class="row">
                <div class="col-sm-12 ">
                    <div class="col-sm-10 col-sm-offset-1  text-center">
                        <div class="four_zero_four_bg">
                            <h1 class="text-center ">403</h1>
                        </div>
                        <div class="contant_box_404">
                            <h3 class="h2">
                                You're don't have access!
                            </h3>
                            <p>Please login with correct credentials and try again</p>
                            <p>${error}</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
</body>
</html>