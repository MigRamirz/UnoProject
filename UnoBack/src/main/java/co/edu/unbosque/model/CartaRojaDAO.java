package co.edu.unbosque.model;

import java.util.ArrayList;

public class CartaRojaDAO implements CartaInterfaceDAO {

	private ArrayList<CartaRojaDTO> list;

	public CartaRojaDAO() {
		list = new ArrayList<>();
	}

	@Override
	public void determinarCarta() {
		for (int i = 0; i < 23; i++) {
			if (i == 0) {
				list.add(new CartaRojaDTO("Rojo", "0"));
			} else if (i >= 1 && i < 10) {
				list.add(new CartaRojaDTO("Rojo", i + ""));
				list.add(new CartaRojaDTO("Rojo", i + ""));
			} else if (i == 10) {
				list.add(new CartaRojaDTO("Rojo", "Toma2"));
				list.add(new CartaRojaDTO("Rojo", "Toma2"));
			} else if (i == 11) {
				list.add(new CartaRojaDTO("Rojo", "Reversa"));
				list.add(new CartaRojaDTO("Rojo", "Reversa"));
			} else if (i == 12) {
				list.add(new CartaRojaDTO("Rojo", "Salta"));
				list.add(new CartaRojaDTO("Rojo", "Salta"));
			}
		}
	}

	public ArrayList<CartaRojaDTO> getList() {
		return list;
	}

	public void setList(ArrayList<CartaRojaDTO> list) {
		this.list = list;
	}

}
