package mohinh.thucthe;

public class GiaoDich {
	private int maGd;
	private String ngayGD;
	private int tienGd;
	private String loaiGD;
	private TaiKhoan taiKhoan;
	public GiaoDich(int maGd, String ngayGD, int tienGd, String loaiGD) {
		super();
		this.maGd = maGd;
		this.ngayGD = ngayGD;
		this.tienGd = tienGd;
		this.loaiGD = loaiGD;
	}
	
	
	public GiaoDich() {
		super();
	}
	
	
	public TaiKhoan getTaiKhoan() {
		return taiKhoan;
	}


	public void setTaiKhoan(TaiKhoan taiKhoan) {
		this.taiKhoan = taiKhoan;
	}


	public int getMaGd() {
		return maGd;
	}
	public void setMaGd(int maGd) {
		this.maGd = maGd;
	}
	public String getNgayGD() {
		return ngayGD;
	}
	public void setNgayGD(String ngayGD) {
		this.ngayGD = ngayGD;
	}
	public int getTienGd() {
		return tienGd;
	}
	public void setTienGd(int tienGd) {
		this.tienGd = tienGd;
	}
	public String getLoaiGD() {
		return loaiGD;
	}
	public void setLoaiGD(String loaiGD) {
		this.loaiGD = loaiGD;
	}
	@Override
	public String toString() {
		return "GiaoDich [maGd=" + maGd + ", ngayGD=" + ngayGD + ", tienGd=" + tienGd + ", loaiGD=" + loaiGD + "]";
	}
	
	

}
