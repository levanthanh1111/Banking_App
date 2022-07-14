package giaodien;



import mohinh.thucthe.ChiNhanh;
import mohinh.thucthe.GiaoDich;
import mohinh.thucthe.KhachHang;
import mohinh.thucthe.TaiKhoan;
import quanly.QuanLy;

public class GiaoDien {

		public static void main(String[] args) {
			
			ChiNhanh cn1 = new ChiNhanh(1, "1", "1");
			 QuanLy ql = new QuanLy(cn1);
			 KhachHang kh1 = new KhachHang(1, "thanh", "qn");
			 KhachHang kh2 = new KhachHang(2, "trang", "qn");
			 KhachHang kh3 = new KhachHang(3, "quin", "qn");
			 
			 TaiKhoan tk1 = new TaiKhoan(01, 190);
			 TaiKhoan tk2 = new TaiKhoan(02, 290);
			 TaiKhoan tk3 = new TaiKhoan(03, 390);
			 TaiKhoan tk4 = new TaiKhoan(04, 18000);
			 TaiKhoan tk5 = new TaiKhoan(05, 590);
			 
			 ql.ThemKH(kh1);
			 ql.ThemTk(kh1, tk1);
			 ql.ThemTk(kh1, tk5);
			 
			 ql.ThemKH(kh2);
			 ql.ThemTk(kh2, tk2);
			 ql.ThemTk(kh2, tk3);
			 
			 ql.ThemKH(kh3);
			 ql.ThemTk(kh3, tk4);
			 
			 ql.XuatTTKH();
			 System.out.println("=================================");
			 ql.XuatKHTheoMa(3);
			 System.out.println("=================================");
			 ql.GuiTien(01, 900);
			 ql.ThemGD(tk1, new GiaoDich(1, "20", 900, "gui"));
			 
			 ql.RutTien(05, 90);
			 ql.ThemGD(tk5, new GiaoDich(2, "20", 90, "rut"));
			 
			 ql.RutTien(04, 600);
			 ql.ThemGD(tk4, new GiaoDich(3, "20", 600, "rut"));
			 
			 ql.GuiTien(02, 900);
			 ql.ThemGD(tk2, new GiaoDich(4, "20", 900, "gui"));
			 
			 ql.GuiTien(02, 1000);
			 ql.ThemGD(tk2, new GiaoDich(5, "20", 1000, "gui"));
			 
			 ql.GuiTien(03, 900);
			 ql.ThemGD(tk3, new GiaoDich(1, "20", 900, "gui"));
			 
			 ql.RutTien(03, 90000);
			 ql.ThemGD(tk3, new GiaoDich(1, "20", 90000, "rut"));
			 ql.XuatTTKH();	
			 System.out.println("=================================");
			 ql.LietKeCacTKCoSoDuLonNhatCuaTungKH();
			 System.out.println("=================================");
			 ql.SapXepTangDanTheoTongSoDu();
			 System.out.println("=================================");
			 ql.KHGiaoDichNhieuNhat();
			 
		}
	

}
