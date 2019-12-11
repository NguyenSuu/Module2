<%--
  Created by IntelliJ IDEA.
  User: ryan
  Date: 04/12/2019
  Time: 14:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <style>
        div.gallery {
            border: 1px solid #ccc;
        }

        div.gallery:hover {
            border: 1px solid #777;
        }

        /*div.gallery img {*/
        /*    width: 100%;*/
        /*    height: auto;*/
        /*}*/

        div.desc {
            padding: 15px;
            text-align: center;
        }

        * {
            box-sizing: border-box;
        }

        .responsive {
            padding: 0 6px;
            float: left;
            width: 24.99999%;
        }

        @media only screen and (max-width: 700px){
            .responsive {
                width: 49.99999%;
                margin: 6px 0;
            }
        }

        @media only screen and (max-width: 500px){
            .responsive {
                width: 100%;
            }
        }

        .clearfix:after {
            content: "";
            display: table;
            clear: both;
        }
    </style>
</head>
<body>
    <h2>Responsive Image Gallery
    </h2>
<h5>Resize the browser window to see the effect</h5>
    <div class="responsive">
        <div class="gallery">
            <a target="_blank" href="https://images.pexels.com/photos/291732/pexels-photo-291732.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500">
                <img src="https://images.pexels.com/photos/291732/pexels-photo-291732.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500" alt="Trolltunga Norway" width="464.2" height="200">
            </a>
            <div class="desc">Add a description of the image here</div>
        </div>
    </div>
    <div class="responsive">
        <div class="gallery">
            <a target="_blank" href="https://q-cf.bstatic.com/images/hotel/max1024x768/136/136294750.jpg">
                <img src="https://q-cf.bstatic.com/images/hotel/max1024x768/136/136294750.jpg" alt="Trolltunga Norway" width="464.2" height="200">
            </a>
            <div class="desc">Add a description of the image here</div>
        </div>
    </div>
    <div class="responsive">
        <div class="gallery">
            <a target="_blank" href="https://media.istockphoto.com/photos/misty-blue-mountains-on-sunrise-picture-id613111906?k=6&m=613111906&s=612x612&w=0&h=lSW2IMqdHTkgNwASaXW6t85pmETw1ZeNTAc1Bzd5PSI=">
                <img src="https://media.istockphoto.com/photos/misty-blue-mountains-on-sunrise-picture-id613111906?k=6&m=613111906&s=612x612&w=0&h=lSW2IMqdHTkgNwASaXW6t85pmETw1ZeNTAc1Bzd5PSI=" alt="Trolltunga Norway" width="464.2" height="200">
            </a>
            <div class="desc">Add a description of the image here</div>
        </div>
    </div>
    <div class="responsive">
        <div class="gallery">
            <a target="_blank" href="https://images.unsplash.com/photo-1455044372794-d981761b5bc6?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&w=1000&q=80">
                <img src="https://images.unsplash.com/photo-1455044372794-d981761b5bc6?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&w=1000&q=80" alt="Trolltunga Norway" width="464.2" height="200">
            </a>
            <div class="desc">Add a description of the image here</div>
        </div>
    </div>
    <div class="clearfix"></div>

    <div style="padding:6px;">
        <p>This example use media queries to re-arrange the images on different screen sizes: for screens larger than 700px wide, it will show four images side by side, for screens smaller than 700px, it will show two images side by side. For screens smaller than 500px, the images will stack vertically (100%).</p>
    </div>
</body>
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
        integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
        integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
        crossorigin="anonymous"></script>
</html>
