<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<a href="product/create">Create new product</a>
<table>
    <thead>
    <td>ID</td>
    <td>Name</td>
    <td>Image</td>
    <td>Action</td>
    </thead>
    <tbody>
    <c:forEach items="${allProducts}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td><img src="${pageContext.request.contextPath}/images/${user.image}"/></td>
            <td><a href="admin/product/edit/${user.id}">Edit</a> <a
                    href="admin/product/delete/${user.id}">Delete</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
