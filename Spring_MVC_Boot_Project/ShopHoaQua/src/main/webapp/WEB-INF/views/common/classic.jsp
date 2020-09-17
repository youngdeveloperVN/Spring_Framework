<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link href="https://fonts.googleapis.com/css?family=Poppins:200,300,400,500,600,700,800&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Lora:400,400i,700,700i&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Amatic+SC:400,700&display=swap" rel="stylesheet">

    <title><tiles:getAsString name="title"/></title>
    <base href="${pageContext.request.contextPath}/" />

    <link rel="stylesheet" href="css/user/open-iconic-bootstrap.min.css">
    <link rel="stylesheet" href="css/user/animate.css">

    <link rel="stylesheet" href="css/user/owl.carousel.min.css">
    <link rel="stylesheet" href="css/user/owl.theme.default.min.css">
    <link rel="stylesheet" href="css/user/magnific-popup.css">

    <link rel="stylesheet" href="css/user/aos.css">

    <link rel="stylesheet" href="fonts/ionicons/css/ionicons.min.css">

    <link rel="stylesheet" href="css/user/bootstrap-datepicker.css">
    <link rel="stylesheet" href="css/user/jquery.timepicker.css">


    <link rel="stylesheet" href="css/user/flaticon.css">
    <link rel="stylesheet" href="css/user/icomoon.css">
    <link rel="stylesheet" href="css/user/style.css">
</head>

<body class="goto-here">
	<tiles:insertAttribute name="topbar"/>
    <tiles:insertAttribute name="menu"/>
    <tiles:insertAttribute name="body"/>
	<tiles:insertAttribute name="footer"/>
	<tiles:insertAttribute name="loader"/>

    <script src="js/user/jquery.min.js"></script>
    <script src="js/user/jquery-migrate-3.0.1.min.js"></script>
    <script src="js/user/popper.min.js"></script>
    <script src="js/user/bootstrap.min.js"></script>
    <script src="js/user/jquery.easing.1.3.js"></script>
    <script src="js/user/jquery.waypoints.min.js"></script>
    <script src="js/user/jquery.stellar.min.js"></script>
    <script src="js/user/owl.carousel.min.js"></script>
    <script src="js/user/jquery.magnific-popup.min.js"></script>
    <script src="js/user/aos.js"></script>
    <script src="js/user/jquery.animateNumber.min.js"></script>
    <script src="js/user/bootstrap-datepicker.js"></script>
    <script src="js/user/scrollax.min.js"></script>
    <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBVWaKrjvy3MaE7SQ74_uJiULgl1JY0H2s&sensor=false"></script>
    <script src="js/user/google-map.js"></script>
    <script src="js/user/main.js"></script>
</body>
</html>

