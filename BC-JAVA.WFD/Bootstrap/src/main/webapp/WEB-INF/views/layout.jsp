<%--
  Created by IntelliJ IDEA.
  User: ryan
  Date: 04/12/2019
  Time: 13:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Layout</title>
    <link href="/CSS/layout.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<div class="container" style="height: auto">
    <header class="row">
        <div class="shopping-mall">
            <h1>Online shopping mall</h1>
            <h5>The center point of the professional programing</h5>
        </div>
<%--        <img class = "pull-right" src="https://c.wallhere.com/photos/c8/8a/1024x714_px_best_friends_bulldog_cute_dog_photos_dog_images_dog_wallpaper_doggy_dogs-802579.jpg!d"/>--%>
    </header>
    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#"><span class="glyphicon glyphicon-home"></span> Trang chủ</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li class="active"><a href="#"> <span class="glyphicon glyphicon-list-alt"></span> Giới thiệu<span class="sr-only">(current)</span></a></li>
                    <li><a href="#"><span class="glyphicon glyphicon-earphone"></span> Liên hệ</a></li>
                    <li><a href="#"><span class="glyphicon glyphicon-envelope"></span> Góp ý</a></li>
                    <li><a href="#"><span class="glyphicon glyphicon-question-sign"></span> Hỏi đáp</a></li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><span class="glyphicon glyphicon-user"></span> Tài khoản<span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="#">Đăng nhập</a></li>
                            <li><a href="#">Quên mật khẩu</a></li>
                            <li><a href="#">Đăng ký thành viên</a></li>
                            <li role="separator" class="divider"></li>
                            <li><a href="#">Đăng xuất</a></li>
                            <li><a href="#">Đổi mật khẩu</a></li>
                            <li><a href="#">Cập nhật hồ sơ</a></li>
                            <li role="separator" class="divider"></li>
                            <li><a href="#">Đơn hàng</a></li>
                            <li><a href="#">Hàng đã mua</a></li>
                        </ul>
                    </li>
                </ul>

                <ul class="nav navbar-nav navbar-right">
                    <li><a href="#">English</a></li>
                    <li><a href="#">Tiếng Việt</a></li>
                </ul>
            </div><!-- /.navbar-collapse -->
        </div><!-- /.container-fluid -->
    </nav>
    <div class="row">
        <article class="col-sm-9">

        </article>
        <aside class="col-sm-3">

        </aside>
    </div>
    <footer class="panel panel-default">
        <div class="panel-heading text-center">
            <p>Codegym &copy; 2017</p>
        </div>
    </footer>
</div>
</body>
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
        integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
        integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
        crossorigin="anonymous"></script>
</html>
