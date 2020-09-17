<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title><tiles:getAsString name="title" /></title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/style.css"></link>
<script src="${pageContext.request.contextPath}/js/main.js"></script>

<!--  pageContext.request.contextPath = http://localhost:9999/ProductManagermenet/ -->

</head>

<body>


	<header>
		<tiles:insertAttribute name="header" />
	</header>

	<section>
		<tiles:insertAttribute name="menu" />

		<tiles:insertAttribute name="body" />
	</section>

	<footer>
		<tiles:insertAttribute name="footer" />
	</footer>


</body>
</html>