package co.edu.unbosque.model;

import java.util.ArrayList;

public class CartaVerdeDAO implements CartaInterfaceDAO {

	private ArrayList<CartaVerdeDTO> list;

	public CartaVerdeDAO() {
		list = new ArrayList<>();
	}

	@Override
	public void determinarCarta() {
		for (int i = 0; i < 23; i++) {
			if (i == 0) {
				list.add(new CartaVerdeDTO("Verde", "0"));
			} else if (i >= 1 && i < 10) {
				list.add(new CartaVerdeDTO("Verde", i + ""));
				list.add(new CartaVerdeDTO("Verde", i + ""));
			} else if (i == 10) {
				list.add(new CartaVerdeDTO("Verde", "Toma2"));
				list.add(new CartaVerdeDTO("Verde", "Toma2"));
			} else if (i == 11) {
				list.add(new CartaVerdeDTO("Verde", "Reversa"));
				list.add(new CartaVerdeDTO("Verde", "Reversa"));
			} else if (i == 12) {
				list.add(new CartaVerdeDTO("Verde", "Salta"));
				list.add(new CartaVerdeDTO("Verde", "Salta"));
			}
		}
	}

	public ArrayList<CartaVerdeDTO> getList() {
		return list;
	}

	public void setList(ArrayList<CartaVerdeDTO> list) {
		this.list = list;
	}

}
