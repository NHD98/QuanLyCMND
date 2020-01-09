package bean;

import java.util.Date;

public class CongDanBean {
	private String cmndID;
	private String ten;
	private String ho;
	private Date ngaySinh;
	private boolean gioiTinh;
	private String noiSinh;
	private String tinhTrangHonNhan;
	private String ngheNghiep;

	public CongDanBean(String cmndID, String ten, String ho, Date ngaySinh, boolean gioiTinh, String noiSinh,
			String tinhTrangHonNhan, String ngheNghiep) {
		super();
		this.cmndID = cmndID;
		this.ten = ten;
		this.ho = ho;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.noiSinh = noiSinh;
		this.tinhTrangHonNhan = tinhTrangHonNhan;
		this.ngheNghiep = ngheNghiep;
	}

	public CongDanBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCmndID() {
		return cmndID;
	}

	public void setCmndID(String cmndID) {
		this.cmndID = cmndID;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getHo() {
		return ho;
	}

	public void setHo(String ho) {
		this.ho = ho;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public boolean isGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getNoiSinh() {
		return noiSinh;
	}

	public void setNoiSinh(String noiSinh) {
		this.noiSinh = noiSinh;
	}

	public String getTinhTrangHonNhan() {
		return tinhTrangHonNhan;
	}

	public void setTinhTrangHonNhan(String tinhTrangHonNhan) {
		this.tinhTrangHonNhan = tinhTrangHonNhan;
	}

	public String getNgheNghiep() {
		return ngheNghiep;
	}

	public void setNgheNghiep(String ngheNghiep) {
		this.ngheNghiep = ngheNghiep;
	}
}
