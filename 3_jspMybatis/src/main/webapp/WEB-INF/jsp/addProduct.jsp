<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
			<form action="add" method="post">
				<table width=400 border=1>
					<tr>
						<td colspan=2 align=center>
						新增產品
					<tr>
						<td>產品編號
						<td><input type="text" name="productno">
					<tr>
						<td>產品名
						<td><input type="text" name="productname">
					<tr>
						<td>價格
						<td><input type="text" name="price">
					<tr>
						<td colspan=2 align=center>
						<input type="submit" value="ok">
				</table>
			</form>
		</div>
	</div>
	<div class="footer"></div>
</body>
</html>