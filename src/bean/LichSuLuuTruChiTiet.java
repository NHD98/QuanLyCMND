package bean;

import java.util.Date;

public class LichSuLuuTruChiTiet {
	private String cmndID;
	private String ten;
	private String ho;
	private Date thoiGianBatDau;
	private Date thoiGianKetThuc;
	private String tinh_TP;
	private String quan_Huyen;
	private String phuong_Xa;
	private String to_Thon;
	private String tenLoaiLuuTru;
	private String hoKhauID;

	public LichSuLuuTruChiTiet(String cmndID, String ten, String ho, Date thoiGianBatDau, Date thoiGianKetThuc,
            String tinh_TP, String quan_Huyen, String phuong_Xa, String to_Thon, String tenLoaiLuuTru,
            String hoKhauID) {
        super();
        this.cmndID = cmndID;
        this.ten = ten;
        this.ho = ho;
        this.thoiGianBatDau = thoiGianBatDau;
        this.thoiGianKetThuc = thoiGianKetThuc;
        this.tinh_TP = tinh_TP;
        this.quan_Huyen = quan_Huyen;
        this.phuong_Xa = phuong_Xa;
        this.to_Thon = to_Thon;
        this.tenLoaiLuuTru = tenLoaiLuuTru;
        this.hoKhauID = hoKhauID;
    }

    public String getHoKhauID() {
        return hoKhauID;
    }

    public void setHoKhauID(String hoKhauID) {
        this.hoKhauID = hoKhauID;
    }

    public LichSuLuuTruChiTiet() {
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

	public Date getThoiGianBatDau() {
		return thoiGianBatDau;
	}

	public void setThoiGianBatDau(Date thoiGianBatDau) {
		this.thoiGianBatDau = thoiGianBatDau;
	}

	public Date getThoiGianKetThuc() {
		return thoiGianKetThuc;
	}

	public void setThoiGianKetThuc(Date thoiGianKetThuc) {
		this.thoiGianKetThuc = thoiGianKetThuc;
	}

	public String getTinh_TP() {
		return tinh_TP;
	}

	public void setTinh_TP(String tinh_TP) {
		this.tinh_TP = tinh_TP;
	}

	public String getQuan_Huyen() {
		return quan_Huyen;
	}

	public void setQuan_Huyen(String quan_Huyen) {
		this.quan_Huyen = quan_Huyen;
	}

	public String getPhuong_Xa() {
		return phuong_Xa;
	}

	public void setPhuong_Xa(String phuong_Xa) {
		this.phuong_Xa = phuong_Xa;
	}

	public String getTo_Thon() {
		return to_Thon;
	}

	public void setTo_Thon(String to_Thon) {
		this.to_Thon = to_Thon;
	}

	public String getTenLoaiLuuTru() {
		return tenLoaiLuuTru;
	}

	public void setTenLoaiLuuTru(String tenLoaiLuuTru) {
		this.tenLoaiLuuTru = tenLoaiLuuTru;
	}
}
