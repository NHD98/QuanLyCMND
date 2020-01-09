package bean;

public class HoKhauBean {
	private String hoKhauID;
	private String tinh_TP;
	private String quan_Huyen;
	private String phuong_Xa;
	private String to_Thon;
	private String chuHoiID;

	public HoKhauBean(String hoKhauID, String tinh_TP, String quan_Huyen, String phuong_Xa, String to_Thon,
			String chuHoiID) {
		super();
		this.hoKhauID = hoKhauID;
		this.tinh_TP = tinh_TP;
		this.quan_Huyen = quan_Huyen;
		this.phuong_Xa = phuong_Xa;
		this.to_Thon = to_Thon;
		this.chuHoiID = chuHoiID;
	}

	public HoKhauBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getHoKhauID() {
		return hoKhauID;
	}

	public void setHoKhauID(String hoKhauID) {
		this.hoKhauID = hoKhauID;
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

	public String getChoHoID() {
		return chuHoiID;
	}

	public void setChoHoID(String choHoID) {
		this.chuHoiID = choHoID;
	}

}
