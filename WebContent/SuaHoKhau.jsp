<%@page import="bean.HoKhauBean"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<link href="assets/bootstrap.css" rel="stylesheet" />
</head>
<body>

	<%
		HoKhauBean hoKhau = (HoKhauBean) request.getAttribute("hoKhauDetail");
	%>

	<h1>Sửa hộ khẩu</h1>
	<form action="SuaHoKhauController" method="post">
		<label>Ho khau ID: </label><input name="txtHoKhauID" value="<%=hoKhau.getHoKhauID()%>" readonly><br>
		<label>Tinh TP: </label><input class="form-control" type="text" name="txtTinhTP" value="<%=hoKhau.getTinh_TP()%>"><br>
		<label>Quan Huyen: </label><input class="form-control" type="text" name="txtQuanHuyen" value="<%=hoKhau.getQuan_Huyen()%>"><br>
		<label>Phuong xa: </label><input class="form-control" type="text" name="txtPhuongXa" value="<%=hoKhau.getPhuong_Xa()%>"><br>
		<label>To thon: </label><input class="form-control" type="text" name="txtToThon" value="<%=hoKhau.getTo_Thon()%>"><br>
		<label>Chu ho ID: </label><input name = "txtChuHoID" value="<%=hoKhau.getChoHoID() %>" readonly><br>
		<button class="btn btn-info" type="submit">Sửa</button>
	</form>

</body>
</html>