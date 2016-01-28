<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="scripts/jquery-1.9.1.min.js"></script>
</head>
<body>
	
	
	<c:if test="${empty list }">
		没有任何员工信息.
	</c:if>
	<c:if test="${!empty list }">
		<table border="1" cellpadding="10" cellspacing="0">
			<tr>
				<th>ID</th>
				<th>名字</th>
				<th>性别</th>
				<th>电话</th>
				<th>身份证</th>
				<th>增加</th>
				<th>删除</th>
			</tr>
			
			<c:forEach items="${list }" var="emp">
				<tr>
					<td>${emp.id }</td>
					<td>${emp.name }</td>
					<td>${emp.sex }</td>
					<td>${emp.phone}</td>
					<td>${emp.idcard }</td>
					<td><a href="${pageConte.request.contextPath }/employee/getAll.html?${emp.id}">Edit</a></td>
					<td><a class="delete" href="emp/${emp.id}">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
	
	<br><br>
	
	<a href="emp">Add New Employee</a>
	
</body>
</html>