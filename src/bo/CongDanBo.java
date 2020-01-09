package bo;

import java.util.ArrayList;

import bean.CongDanBean;
import bean.LichSuLuuTruChiTiet;
import dao.CongDanDao;

public class CongDanBo {
	CongDanDao cd = new CongDanDao();

	public int themCongDan(CongDanBean congDan) {
		return cd.themCongDan(congDan);
	}
	
}
