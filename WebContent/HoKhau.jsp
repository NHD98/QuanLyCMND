<%@page import="bean.HoKhauBean"%>
<%@page import="java.util.ArrayList"%>
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
		ArrayList<HoKhauBean> listHoKhau = (ArrayList<HoKhauBean>) request.getAttribute("listHoKhau");
	%>
	<h1>Hộ khẩu</h1>
	<table class="table table-hover">
		<thead>
			<th>HoKhauID</th>
			<th>Tinh_TP</th>
			<th>Quan_Huyen</th>
			<th>Phuong_Xa</th>
			<th>To_Thon</th>
			<th>ChuHoID</th>
			<th></th>
		</thead>
		<%
			for (int i = 0; i < listHoKhau.size(); i++) {
		%>
		<%
			HoKhauBean item = listHoKhau.get(i);
		%>
		<tr>
			<td><%=item.getHoKhauID()%></td>
			<td><%=item.getTinh_TP()%></td>
			<td><%=item.getQuan_Huyen()%></td>
			<td><%=item.getPhuong_Xa()%></td>
			<td><%=item.getTo_Thon()%></td>
			<td><%=item.getChoHoID()%></td>
			<td><a href="HoKhauController?id=<%=item.getHoKhauID()%>">Sửa</a></td>
		</tr>
		<%
			}
		%>
	</table>

</body>
</html>