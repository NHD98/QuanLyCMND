package bo;

import java.util.ArrayList;

import bean.HoKhauBean;
import dao.HoKhauDao;

public class HoKhauBo {
	HoKhauDao hoKhauDao = new HoKhauDao();

	public ArrayList<HoKhauBean> getHoKhau() {
		return hoKhauDao.getHoKhau();
	}
	
	public HoKhauBean getHoKhauByID(String id) {
		return hoKhauDao.getHoKhauByID(id);
	}
	
	public int suaHoKhauByID(String id, String tinhTP, String quanHuyen, String phuongXa, String toThon) {
		return hoKhauDao.suaHoKhauByID(id, tinhTP, quanHuyen, phuongXa, toThon);
	}
}
