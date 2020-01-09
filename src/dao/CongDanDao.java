package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import bean.CongDanBean;
import bean.LichSuLuuTruChiTiet;

public class CongDanDao {

	public int themCongDan(CongDanBean congDan) {
		Connection conn = ConnectToDB.getConnection();
		int rs = 0;
		String sql = "INSERT INTO CONGDAN(CmndID, Ten, Ho, NgaySinh, GioiTinh, NoiSinh, TTHonNhan, NgheNghiep)VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			PreparedStatement cmd = conn.prepareStatement(sql);
			cmd.setString(1, congDan.getCmndID());
			cmd.setString(2, congDan.getTen());
			cmd.setString(3, congDan.getHo());

			String ngaySinh = sdf.format(congDan.getNgaySinh());
			cmd.setDate(4, java.sql.Date.valueOf(ngaySinh));

			cmd.setBoolean(5, congDan.isGioiTinh());
			cmd.setString(6, congDan.getNoiSinh());
			cmd.setString(7, congDan.getTinhTrangHonNhan());
			cmd.setString(8, congDan.getNgheNghiep());

			rs = cmd.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}

}
