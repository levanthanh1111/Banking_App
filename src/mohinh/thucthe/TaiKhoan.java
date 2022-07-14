package mohinh.thucthe;

import java.util.ArrayList;

public class TaiKhoan {
	private int maTK;
	private int doDu;
	private KhachHang khachHang;
	private ArrayList<GiaoDich> dsGd;
	
	
	public TaiKhoan() {
		super();
		dsGd = new ArrayList<GiaoDich>();
	}
	public TaiKhoan(int maTK, int doDu) {
		super();
		this.maTK = maTK;
		this.doDu = doDu;
	
		dsGd = new ArrayList<GiaoDich>();
	}
	
	public void ThemGiaoDich(GiaoDich gd) {
		dsGd.add(gd);
		gd.setTaiKhoan(this);
	}
	
	public KhachHang getKhachHang() {
		return khachHang;
	}
	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}
	public int getMaTK() {
		return maTK;
	}
	public void setMaTK(int maTK) {
		this.maTK = maTK;
	}
	public int getDoDu() {
		return doDu;
	}
	public void setDoDu(int doDu) {
		this.doDu = doDu;
	}
	public ArrayList<GiaoDich> getDsGd() {
		return dsGd;
	}
	@Override
	public String toString() {
		return "TaiKhoan [maTK=" + maTK + ", doDu=" + doDu + ", dsGd=" + dsGd + "]";
	}
	
	
	
	
	
	
	
	
}
