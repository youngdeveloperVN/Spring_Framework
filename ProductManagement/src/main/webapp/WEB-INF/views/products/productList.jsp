<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<%@page import="java.util.List"%>
<%@page import="product.spring.demo.entities.Product"%>

<h2>
	<a href="/home">Home</a> > <a href="/products">Products</a>
</h2>
<p></p>
<table>
	<thead>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Image</th>
			<th>Price</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="productItem" items="${productList}">
			<tr>
				<td>${productItem.id}</td>
				<td>${productItem.name}</td>
				<td>${productItem.image}</td>
				<td>${productItem.price}</td>
			</tr>
		</c:forEach>

	</tbody>
</table>
