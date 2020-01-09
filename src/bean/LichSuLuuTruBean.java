package bean;

import java.util.Date;

public class LichSuLuuTruBean {
	private String cmndID;
	private String hoKhauID;
	private String loaiLuuTruID;
	private Date thoiGianBatDau;
	private Date thoaiGianKetThuc;
	private String quanHeVoiChuHo;

	public LichSuLuuTruBean(String cmndID, String hoKhauID, String loaiLuuTruID, Date thoiGianBatDau, Date thoaiGianKetThuc,
			String quanHeVoiChuHo) {
		super();
		this.cmndID = cmndID;
		this.hoKhauID = hoKhauID;
		this.loaiLuuTruID = loaiLuuTruID;
		this.thoiGianBatDau = thoiGianBatDau;
		this.thoaiGianKetThuc = thoaiGianKetThuc;
		this.quanHeVoiChuHo = quanHeVoiChuHo;
	}

	public LichSuLuuTruBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCmndID() {
		return cmndID;
	}

	public void setCmndID(String cmndID) {
		this.cmndID = cmndID;
	}

	public String getHoKhauID() {
		return hoKhauID;
	}

	public void setHoKhauID(String hoKhauID) {
		this.hoKhauID = hoKhauID;
	}

	public String getLoaiLuuTruID() {
		return loaiLuuTruID;
	}

	public void setLoaiLuuTruID(String loaiLuuTruID) {
		this.loaiLuuTruID = loaiLuuTruID;
	}

	public Date getThoiGianBatDau() {
		return thoiGianBatDau;
	}

	public void setThoiGianBatDau(Date thoiGianBatDau) {
		this.thoiGianBatDau = thoiGianBatDau;
	}

	public Date getThoaiGianKetThuc() {
		return thoaiGianKetThuc;
	}

	public void setThoaiGianKetThuc(Date thoaiGianKetThuc) {
		this.thoaiGianKetThuc = thoaiGianKetThuc;
	}

	public String getQuanHeVoiChuHo() {
		return quanHeVoiChuHo;
	}

	public void setQuanHeVoiChuHo(String quanHeVoiChuHo) {
		this.quanHeVoiChuHo = quanHeVoiChuHo;
	}
}
