package co.edu.unbosque.model;

import java.util.ArrayList;

public class CartaEspecialDAO {

	private ArrayList<CartaEspecialDTO> list;

	public CartaEspecialDAO() {
		list = new ArrayList<>();
	}

	public void determinarCarta() {
		for (int i = 0; i < 4; i++) {
			if (i < 2) {
				list.add(new CartaEspecialDTO("CambioColor"));
			}
			if (i >= 2) {
				list.add(new CartaEspecialDTO("Toma4"));
			}
		}
	}

	public ArrayList<CartaEspecialDTO> getList() {
		return list;
	}

	public void setList(ArrayList<CartaEspecialDTO> list) {
		this.list = list;
	}

}
