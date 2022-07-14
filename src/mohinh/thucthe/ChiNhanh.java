package mohinh.thucthe;

import java.util.ArrayList;



public class ChiNhanh {
	private int maCN;
	private String tenCN;
	private String diaChiCN;
	private ArrayList<KhachHang> dsKh;
	public ChiNhanh(int maCN, String tenCN, String diaChiCN) {
		super();
		this.maCN = maCN;
		this.tenCN = tenCN;
		this.diaChiCN = diaChiCN;
		dsKh = new ArrayList<KhachHang>();
	}
	public ChiNhanh() {
		super();
		dsKh = new ArrayList<KhachHang>();
	}
	
	public void ThemKhachHang(KhachHang kh) {
		this.dsKh.add(kh);
		kh.setChiNhanh(this);
	}
	
	public int getMaCN() {
		return maCN;
	}
	public void setMaCN(int maCN) {
		this.maCN = maCN;
	}
	public String getTenCN() {
		return tenCN;
	}
	public void setTenCN(String tenCN) {
		this.tenCN = tenCN;
	}
	public String getDiaChiCN() {
		return diaChiCN;
	}
	public void setDiaChiCN(String diaChiCN) {
		this.diaChiCN = diaChiCN;
	}
	public ArrayList<KhachHang> getDsKh() {
		return dsKh;
	}
	
	@Override
	public String toString() {
		return "ChiNhanh [maCN=" + maCN + ", tenCN=" + tenCN + ", diaChiCN=" + diaChiCN + "]";
	}
	
	
	

}
