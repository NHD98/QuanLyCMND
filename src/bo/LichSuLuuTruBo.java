package bo;

import java.util.ArrayList;

import bean.LichSuLuuTruChiTiet;
import dao.LichSuLuuTruDao;

public class LichSuLuuTruBo {
    LichSuLuuTruDao lsDao = new LichSuLuuTruDao();

    public ArrayList<LichSuLuuTruChiTiet> getLichSuLuuTru(String cmndID) throws Exception {
        return lsDao.getLichSuLuuTru(cmndID);
    }

    public int xoaLichSuLuuTru(String cmndID, String hoKhauID, String thoiGianBatDauLT) throws Exception {
        return lsDao.xoaLichSuLuuTru(cmndID, hoKhauID, thoiGianBatDauLT);
    }
}
