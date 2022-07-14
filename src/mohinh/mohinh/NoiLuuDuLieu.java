package mohinh.mohinh;

import java.util.ArrayList;

import java.util.List;


public abstract class NoiLuuDuLieu<E> {
	protected List<E> listData;

	public NoiLuuDuLieu() {
		listData = new ArrayList<E>();
	}

	public List<E> getListData() {
		return listData;
	}

	
	
	

}
