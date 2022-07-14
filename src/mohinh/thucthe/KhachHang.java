package mohinh.thucthe;

import java.util.ArrayList;



public class KhachHang {
	private int maKH;
	private String tenKH;
	private String diaChiKH;
	private ChiNhanh chiNhanh;
	private ArrayList<TaiKhoan> dsTk;
	public KhachHang(int maKH, String tenKH, String diaChiKH) {
		super();
		this.maKH = maKH;
		this.tenKH = tenKH;
		this.diaChiKH = diaChiKH;
		dsTk = new ArrayList<TaiKhoan>();
	}
	public KhachHang() {
		super();
		dsTk = new ArrayList<TaiKhoan>();
	}
	
	public void ThemTaiKhoan(TaiKhoan tk) {
		this.dsTk.add(tk);
		tk.setKhachHang(this);
	}
	
	public ChiNhanh getChiNhanh() {
		return chiNhanh;
	}
	public void setChiNhanh(ChiNhanh chiNhanh) {
		this.chiNhanh = chiNhanh;
	}
	public int getMaKH() {
		return maKH;
	}
	public void setMaKH(int maKH) {
		this.maKH = maKH;
	}
	public String getTenKH() {
		return tenKH;
	}
	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}
	public String getDiaChiKH() {
		return diaChiKH;
	}
	public void setDiaChiKH(String diaChiKH) {
		this.diaChiKH = diaChiKH;
	}
	
	
	public ArrayList<TaiKhoan> getDsTk() {
		return dsTk;
	}
	@Override
	public String toString() {
		return "KhachHang [maKH=" + maKH + ", tenKH=" + this.tenKH + ", diaChiKH=" + diaChiKH + ", dsTk=" + dsTk + "]";
	}
	
	
	
}
