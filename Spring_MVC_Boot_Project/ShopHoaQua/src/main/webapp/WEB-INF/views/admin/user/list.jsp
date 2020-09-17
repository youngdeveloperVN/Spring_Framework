<%@ page contentType="text/html; charset=utf8" pageEncoding="utf8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${not empty msg}">
    <c:out value="${msg}"/><br>
</c:if>
<c:remove var="msg"/>

<a href="user/create">Create new user</a>
<table>
    <thead>
    <td>ID</td>
    <td>Name</td>
    <td>Username</td>
    <td>Active</td>
    <td>Action</td>
    </thead>
    <tbody>
    <c:forEach items="${allUsers}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td><c:out value="${user.username}"/></td>
            <td><c:out value="${user.active}"/></td>
            <td><a href="admin/user/edit/${user.id}">Edit</a> <a
                    href="admin/user/delete/${user.id}">Delete</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
