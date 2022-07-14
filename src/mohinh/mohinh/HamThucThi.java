package mohinh.mohinh;

import java.util.ArrayList;

public interface HamThucThi<E> {
	void add(E e);
	void getAll();
	E getById(int id);
	ArrayList<E> DS();
	
}
