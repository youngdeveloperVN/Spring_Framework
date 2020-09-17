<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form"
	prefix="springform"%>
	<h4>Create User</h4>
	<springform:form modelAttribute="userModelAttribute" action="admin/user/create"
		method="POST">
		<div class="form-group">
			<span class="label">Username:</span>
			<springform:input type="text" path="username" />
		</div>

		<div class="form-group">
			Pass:
			<springform:input type="password" path="password" />
		</div>
		<div class="form-group">
			Role:
			<springform:select path="roleId" items="${allRoles}" itemValue="id"
				itemLabel="name" />
		</div>
		<input type="submit" value="Create">
	</springform:form>
