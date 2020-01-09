package bean;

public class LoaiLuuTruBean {
	private String loaiLuuTru;
	private String tenLoaiLuuTru;

	public LoaiLuuTruBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoaiLuuTruBean(String loaiLuuTru, String tenLoaiLuuTru) {
		super();
		this.loaiLuuTru = loaiLuuTru;
		this.tenLoaiLuuTru = tenLoaiLuuTru;
	}

	public String getLoaiLuuTru() {
		return loaiLuuTru;
	}

	public void setLoaiLuuTru(String loaiLuuTru) {
		this.loaiLuuTru = loaiLuuTru;
	}

	public String getTenLoaiLuuTru() {
		return tenLoaiLuuTru;
	}

	public void setTenLoaiLuuTru(String tenLoaiLuuTru) {
		this.tenLoaiLuuTru = tenLoaiLuuTru;
	}

}
