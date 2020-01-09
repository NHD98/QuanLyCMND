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
	if (request.getAttribute("themCongDan").equals("1")){
		out.print("<script>alert('Thêm mới thành công')</script>");
	} else if (request.getAttribute("themCongDan").equals("2")){
		out.print("<script>alert('Ngày không hợp lệ')</script>");
	}
%>

	<h1>Thêm mới công dân</h1>
	<form action="CongDan" method="post">
		<label>CMND:</label> <input class="form-control" type="text" name="txtCMND"><br>
		<label>Ten:</label> <input class="form-control" type="text" name="txtTen"><br>
		<label>Ho:</label> <input class="form-control" type="text" name="txtHo"><br>
		<label>Ngay Sinh:</label> <input class="form-control" type="date" name="datNgaySinh"><br>
		<label>Gioi Tinh:</label> <input type="checkbox" name="cbGioiTinh" value="Nam"><br>
		<label>Noi Sinh:</label> <input class="form-control" type="text" name="txtNoiSinh"><br>
		<label>Tinh trang hon nhan:</label> <input class="form-control" type="text" name="txtTinhTrangHonNhan"><br>
		<label>Nghe nghiep:</label> <input class="form-control" type="text" name="txtNgheNghiep"><br>
		<button class="btn btn-info" type="submit" name="btnTaoMoi" value="TaoMoi">Tạo mới</button>
	</form>

</body>
</html>