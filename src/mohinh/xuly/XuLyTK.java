package mohinh.xuly;




import java.util.ArrayList;

import mohinh.mohinh.HamThucThiGuiVsRut;
import mohinh.mohinh.NoiLuuDuLieu;
import mohinh.thucthe.KhachHang;
import mohinh.thucthe.TaiKhoan;

public class XuLyTK extends NoiLuuDuLieu<TaiKhoan> implements HamThucThiGuiVsRut<TaiKhoan>{

	@Override
	public void add(TaiKhoan e) {
		// TODO Auto-generated method stub
		listData.add(e);
	}

	@Override
	public void getAll() {
		// TODO Auto-generated method stub
		for (TaiKhoan tk : listData) {
			System.out.println(tk);
		}
		
	}


	@Override
	public TaiKhoan getById(int id) {
		// TODO Auto-generated method stub
		TaiKhoan taiKhoan = new TaiKhoan();
		for (TaiKhoan tk : listData) {
			if(tk.getMaTK() == id) {
				taiKhoan = tk;
			}
		}
		return taiKhoan;
	}



	@Override
	public void GuiTien(int stk, int tien) {
		// TODO Auto-generated method stub
	
		for (TaiKhoan tk : listData) {
			if(tk.getMaTK() == stk) {
				int sum = tk.getDoDu();
		
				sum = sum + tien;
				tk.setDoDu(sum);
				System.out.println("giao dich thanh cong !");
			}
		}
		
		
	}

	@Override
	public void RutTien(int stk, int tien) {
		// TODO Auto-generated method stub
		for (TaiKhoan tk : listData) {
			if(tk.getMaTK() == stk) {
				int sum = tk.getDoDu();
				if(tien < sum) {
					sum = sum - tien;
					tk.setDoDu(sum);
					System.out.println("giao dich thanh cong !");
				}
				else {
					System.out.println("giao dich that bai !");
					tk.setDoDu(sum);
				}
			}
		}
	}

	@Override
	public ArrayList<TaiKhoan> DS() {
		// TODO Auto-generated method stub
		ArrayList<TaiKhoan> dstk = new ArrayList<TaiKhoan>();
		for (TaiKhoan tk : listData) {
			dstk.add(tk);
		}
		return dstk;
	}


}
