package mohinh.xuly;


import java.util.ArrayList;

import mohinh.mohinh.HamThucThi;
import mohinh.mohinh.NoiLuuDuLieu;
import mohinh.thucthe.KhachHang;

public class XuLyKH extends NoiLuuDuLieu<KhachHang> implements HamThucThi<KhachHang>{

	@Override
	public void add(KhachHang e) {
		// TODO Auto-generated method stub
		listData.add(e);
		
	}

	@Override
	public void getAll() {
		// TODO Auto-generated method stub
		for (KhachHang kh : listData) {
			System.out.println(kh);
		}
		
	}

	@Override
	public KhachHang getById(int id) {
		// TODO Auto-generated method stub
		KhachHang khachHang = new KhachHang();
		for (KhachHang kh : listData) {
			if(kh.getMaKH() == id) {
				khachHang = kh;
			}
		}
		return khachHang;
	}

	@Override
	public ArrayList<KhachHang> DS() {
		// TODO Auto-generated method stub
		ArrayList<KhachHang> dskh = new ArrayList<KhachHang>();
		for (KhachHang kh : listData) {
			dskh.add(kh);
		}
		return dskh;
	}









}
