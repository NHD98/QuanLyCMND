<%@page import="bean.LichSuLuuTruChiTiet"%>
<%@page import="bean.CongDanBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf8">
<title>Insert title here</title>
<link href="assets/bootstrap.css" rel="stylesheet" />
</head>
<body>

	<%
	    ArrayList<LichSuLuuTruChiTiet> list = (ArrayList<LichSuLuuTruChiTiet>) request.getAttribute("list");
	%>

	<h1 align="center">Lich Su Luu Tru</h1>

	<div class="container mt-5">
		<form action="LichSuLuuTruController" method="post">
			<input type="text" name="txtCmndID" class="form-control">
			<button class="btn btn-info">Tim</button>
		</form>
		<table class="table table-hover">
			<thead>
				<th>CMND ID</th>
				<th>Ten</th>
				<th>Ho</th>
				<th>Thoi gian bat dau</th>
				<th>Thoi gian ket thuc</th>
				<th>Tinh, TP</th>
				<th>Quan Huyen</th>
				<th>Phuong Xa</th>
				<th>To thon</th>
				<th>Ten loai luu tru</th>
				<th></th>
			</thead>
			<tbody>
				<%
				    for (int i = 0; i < list.size(); i++) {
				        LichSuLuuTruChiTiet temp = list.get(i);
				%>
				<tr>
					<td><%=temp.getCmndID()%></td>
					<td><%=temp.getTen()%></td>
					<td><%=temp.getHo()%></td>
					<td><%=temp.getThoiGianBatDau()%></td>
					<td><%=temp.getThoiGianKetThuc()%></td>
					<td><%=temp.getTinh_TP()%></td>
					<td><%=temp.getQuan_Huyen()%></td>
					<td><%=temp.getPhuong_Xa()%></td>
					<td><%=temp.getTo_Thon()%></td>
					<td><%=temp.getTenLoaiLuuTru()%></td>
					<td><a href="LichSuLuuTruController?cmndID=<%=temp.getCmndID()%>&HoKhauID=<%=temp.getHoKhauID()%>&ThoiGianBatDauLT=<%=temp.getThoiGianBatDau()%>">Xoa</a>
				</tr>
				<%
				    }
				%>
			</tbody>
		</table>
	</div>

</body>
</html>