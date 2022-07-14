package quanly;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import mohinh.mohinh.HamThucThi;
import mohinh.mohinh.HamThucThiGuiVsRut;
import mohinh.thucthe.ChiNhanh;
import mohinh.thucthe.GiaoDich;
import mohinh.thucthe.KhachHang;
import mohinh.thucthe.TaiKhoan;
import mohinh.xuly.XuLyGD;
import mohinh.xuly.XuLyKH;
import mohinh.xuly.XuLyTK;

public class QuanLy {
	private HamThucThi<KhachHang> ttkh;
	private HamThucThiGuiVsRut<TaiKhoan> tttk;
	private HamThucThi<GiaoDich> ttgd;
	private ChiNhanh cn;
	
	public QuanLy(ChiNhanh cn) {
		this.ttkh = new XuLyKH();
		this.tttk = new XuLyTK();
		this.ttgd = new XuLyGD();
		this.cn = cn;
	}
	
	
	public void ThemKH(KhachHang e) {
		ttkh.add(e);
		cn.ThemKhachHang(e);
	}
	
	public void ThemTk(KhachHang e, TaiKhoan t) {
		tttk.add(t);
		e.ThemTaiKhoan(t);
		
	}
	public void ThemGD(TaiKhoan t, GiaoDich g) {
		ttgd.add(g);
		t.ThemGiaoDich(g);
	}
	
		
	public void GuiTien(int stk,int tien) {
		
		tttk.GuiTien(stk, tien);
	}
	public void RutTien(int stk, int tien) {
		tttk.RutTien(stk, tien);
	}
	// yeu cau
	public void XuatKHTheoMa(int id) {
		System.out.println(ttkh.getById(id));
	}
	// yeu cau
	public void XuatTTKH() {
		ttkh.getAll();
	}
	// yeu cau
	public void LietKeCacTKCoSoDuLonNhatCuaTungKH() {
		//cn = new ChiNhanh();
		int TkMax = 0;
		for (KhachHang kh : ttkh.DS()) {
			
			for(TaiKhoan tk : kh.getDsTk()) {
				
				if(TkMax < tk.getDoDu()) {
					TkMax = tk.getDoDu();
				
				}
				
			}
			System.out.println("khach hang : ma khach hang: " +kh.getMaKH() + " - ten:" + kh.getTenKH() );
			System.out.println("tai khoan co so du lon nhat la : "+TkMax);
			TkMax =0;
		}
		
	}
	
	public int TongSoDu(KhachHang kh) {
		int sum = 0;
		for (TaiKhoan tk : kh.getDsTk()) {
			sum = sum + tk.getDoDu();
		}
		return sum;
	}
	//yeu cau
	public void SapXepTangDanTheoTongSoDu() {
		ArrayList<KhachHang> listKH = ttkh.DS();
		Comparator<KhachHang> comp = new Comparator<KhachHang>() {

			@Override
			public int compare(KhachHang o1, KhachHang o2) {
				// TODO Auto-generated method stub
				return TongSoDu(o1) > TongSoDu(o2) ? 1 : -1;
			}
			
		};
		Collections.sort(listKH,comp);
		
		for (KhachHang kh : listKH) {
			System.out.println("khach hang : ma khach hang: " +kh.getMaKH() + " - ten:" + kh.getTenKH() );
			System.out.println("tong so du : " + TongSoDu(kh));
		}
		
	}
	
	public void KHGiaoDichNhieuNhat() {
		int maxgd = 0;
		KhachHang KH = new KhachHang();
		for (KhachHang kh : ttkh.DS()) {
			int gd = 0;
			for(TaiKhoan tk : kh.getDsTk()) {
				
				gd = gd + tk.getDsGd().size();
			}
			if(gd > maxgd) {
				maxgd = gd;
				KH = kh;
			}
		}
		System.out.println("khach hang : ma khach hang: " +KH.getMaKH() + " - ten:" + KH.getTenKH() );
		System.out.println("tong giao dich : " + maxgd);
	}
	
	
	
}
