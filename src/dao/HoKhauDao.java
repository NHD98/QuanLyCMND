package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.HoKhauBean;

public class HoKhauDao {
	public ArrayList<HoKhauBean> getHoKhau() {
		Connection conn = ConnectToDB.getConnection();
		String sql = "SELECT * FROM HOKHAU";
		ArrayList<HoKhauBean> list = new ArrayList<HoKhauBean>();
		try {
			PreparedStatement cmd = conn.prepareStatement(sql);
			ResultSet rs = cmd.executeQuery();

			while (rs.next()) {
				String hoKhauID = rs.getString("HoKhauID");
				String tinh_TP = rs.getString("Tinh_TP");
				String quan_Huyen = rs.getString("Quan_Huyen");
				String phuong_Xa = rs.getString("Phuong_Xa");
				String to_Thon = rs.getString("To_Thon");
				String chuHoID = rs.getString("ChuHoID");
				HoKhauBean temp = new HoKhauBean(hoKhauID, tinh_TP, quan_Huyen, phuong_Xa, to_Thon, chuHoID);
				list.add(temp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public HoKhauBean getHoKhauByID(String id) {
		// TODO Auto-generated method stub
		Connection conn = ConnectToDB.getConnection();
		String sql = "SELECT * FROM HOKHAU WHERE HoKhauID = ?";
		try {
			PreparedStatement cmd = conn.prepareStatement(sql);
			cmd.setString(1, id);
			ResultSet rs = cmd.executeQuery();
			rs.next();
			HoKhauBean temp = new HoKhauBean(rs.getString("HoKhauID"), rs.getString("Tinh_TP"), rs.getString("Quan_Huyen"), rs.getString("Phuong_Xa"), rs.getString("To_Thon"), rs.getString("ChuHoID"));
			return temp;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public int suaHoKhauByID(String id, String tinhTP, String quanHuyen, String phuongXa, String toThon) {
		Connection conn = ConnectToDB.getConnection();
		int rs = 0;
		String sql = "UPDATE HOKHAU SET Tinh_TP = ?, Quan_Huyen = ?, Phuong_Xa = ?, To_Thon = ? WHERE HoKhauID = ?";
		try {
			PreparedStatement cmd = conn.prepareStatement(sql);
			cmd.setString(1, tinhTP);
			cmd.setString(2, quanHuyen);
			cmd.setString(3, phuongXa);
			cmd.setString(4, toThon);
			cmd.setString(5, id);
			rs = cmd.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	
}
