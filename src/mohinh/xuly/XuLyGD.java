package mohinh.xuly;



import java.util.ArrayList;

import mohinh.mohinh.HamThucThi;
import mohinh.mohinh.NoiLuuDuLieu;
import mohinh.thucthe.GiaoDich;

public class XuLyGD extends NoiLuuDuLieu<GiaoDich> implements HamThucThi<GiaoDich>{

	@Override
	public void add(GiaoDich e) {
		listData.add(e);
		
	}

	@Override
	public void getAll() {
		for (GiaoDich gd : listData) {
			System.out.println(gd);
		}
	}

	

	@Override
	public GiaoDich getById(int id) {
		// TODO Auto-generated method stub
		return listData.get(id);
	}

	@Override
	public ArrayList<GiaoDich> DS() {
		// TODO Auto-generated method stub
		ArrayList<GiaoDich> dsgd = new ArrayList<GiaoDich>();
		for (GiaoDich giaoDich : listData) {
			dsgd.add(giaoDich);
		}
		return dsgd;
	}

	


}
