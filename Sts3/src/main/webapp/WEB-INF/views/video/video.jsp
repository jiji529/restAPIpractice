<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Video</title>
<style>
	.t1 {
		border: 1px solid black;
	}
</style>
</head>
<body>
	<table class="t1">
		<thead>
			<tr>
				<th>bro_no</th>
				<th>news_day</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="list" items="${videoList}">
			<tr>
				<td>${list.broNo}</td>
				<td>${list.newsDay}</td>
			</tr>
		</c:forEach>
		</tbody>
		
	</table>
</body>
</html>