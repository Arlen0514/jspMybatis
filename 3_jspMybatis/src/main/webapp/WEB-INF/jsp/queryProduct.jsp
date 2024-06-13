<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String Show=session.getAttribute("SHOW").toString();
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="st1.css">
</head>
<body>
	<div class="header"></div>
	<div class="content">
		<div class="content_1">
		<form action="" mehtod="get">
		<table  width=400 border=1>
			<tr>
				<td>id<td>產品編號<td>產品名稱<td>價格
				<%=Show %>
		
		</table>
		
		</form>
		</div>
	</div>
	<div class="footer"></div>
</body>
</html>