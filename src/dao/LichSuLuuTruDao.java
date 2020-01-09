package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import bean.LichSuLuuTruChiTiet;

public class LichSuLuuTruDao {

    public ArrayList<LichSuLuuTruChiTiet> getLichSuLuuTru(String key) throws Exception {
        String sql = "SELECT CONGDAN.CmndID, CONGDAN.Ten, CONGDAN.Ho, LichSuLuuTru.HoKhauID, HOKHAU.Tinh_TP, HOKHAU.Quan_Huyen, HOKHAU.Phuong_Xa, HOKHAU.To_Thon, LichSuLuuTru.ThoiGianBatDauLT, LichSuLuuTru.ThoiGianKetThucLT, "
                + " LoaiLuuTru.TenLoaiLuuTru" + " FROM CONGDAN INNER JOIN"
                + " HOKHAU ON CONGDAN.CmndID = HOKHAU.ChuHoID INNER JOIN"
                + " LichSuLuuTru ON CONGDAN.CmndID = LichSuLuuTru.CmndID INNER JOIN"
                + " LoaiLuuTru ON LichSuLuuTru.LoaiLuuTruID = LoaiLuuTru.LoaiLuuTruID"
                + " WHERE LichSuLuuTru.CmndID = ?";
        Connection conn = ConnectToDB.getConnection();
        PreparedStatement cmd = conn.prepareStatement(sql);
        cmd.setString(1, key);
        ArrayList<LichSuLuuTruChiTiet> list = new ArrayList<LichSuLuuTruChiTiet>();
        ResultSet result = cmd.executeQuery();
        while (result.next()) {
            String cmndID = result.getString("CmndID");
            String ten = result.getString("Ten");
            String ho = result.getString("Ho");
            Date thoiGianBatDau = result.getDate("ThoiGianBatDauLT");
            Date thoiGianKetThuc = result.getDate("ThoiGianKetThucLT");
            String tinh_TP = result.getString("Tinh_TP");
            String quan_Huyen = result.getString("Quan_Huyen");
            String phuong_Xa = result.getString("Phuong_Xa");
            String to_Thon = result.getString("To_Thon");
            String tenLoaiLuuTru = result.getString("TenLoaiLuuTru");
            String hoKhauID = result.getString("HoKhauID");
            LichSuLuuTruChiTiet temp = new LichSuLuuTruChiTiet(cmndID, ten, ho, thoiGianBatDau, thoiGianKetThuc,
                    tinh_TP, quan_Huyen, phuong_Xa, to_Thon, tenLoaiLuuTru, hoKhauID);
            list.add(temp);
        }
        return list;
    }

    public int xoaLichSuLuuTru(String cmndID, String hoKhauID, String thoiGianBatDauLT) throws Exception {
        String sql = "DELETE FROM LichSuLuuTru WHERE CmndID = ? AND HoKhauID = ? AND ThoiGianBatDauLT = ?";
        Connection conn = ConnectToDB.getConnection();
        PreparedStatement cmd = conn.prepareStatement(sql);
        cmd.setString(1, cmndID);
        cmd.setString(2, hoKhauID);
        cmd.setString(3, thoiGianBatDauLT);
        int result = cmd.executeUpdate();
        conn.close();
        return result;
    }

}
