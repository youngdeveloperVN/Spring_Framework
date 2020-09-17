<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form"
	prefix="springform"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h4>Create User</h4>
	<springform:form modelAttribute="productModelAttribute" action="admin/product/edit" method="POST" enctype="multipart/form-data">
		<springform:input type="hidden" path="id" />

		<div class="form-group">
			Name:
			<springform:input type="text" path="name" />
		</div>

		<div class="form-group">
			<img src="${pageContext.request.contextPath}/images/${productModelAttribute.image}">
		</div>
		
		<div class="form-group">
			Name:
			<springform:input type="file" path="image" />
		</div>
		
		<input type="submit" value="Create">
	</springform:form>
</body>
</html>
