package co.edu.unbosque.model;

import java.util.ArrayList;

public class CartaAzulDAO implements CartaInterfaceDAO {

	private ArrayList<CartaAzulDTO> list;

	public CartaAzulDAO() {
		list = new ArrayList<>();
	}

	@Override
	public void determinarCarta() {
		for (int i = 0; i < 23; i++) {
			if (i == 0) {
				list.add(new CartaAzulDTO("Azul", "0"));
			} else if (i >= 1 && i < 10) {
				list.add(new CartaAzulDTO("Azul", i + ""));
				list.add(new CartaAzulDTO("Azul", i + ""));
			} else if (i == 10) {
				list.add(new CartaAzulDTO("Azul", "Toma2"));
				list.add(new CartaAzulDTO("Azul", "Toma2"));
			} else if (i == 11) {
				list.add(new CartaAzulDTO("Azul", "Reversa"));
				list.add(new CartaAzulDTO("Azul", "Reversa"));
			} else if (i == 12) {
				list.add(new CartaAzulDTO("Azul", "Salta"));
				list.add(new CartaAzulDTO("Azul", "Salta"));
			}
		}
	}

	public ArrayList<CartaAzulDTO> getList() {
		return list;
	}

	public void setList(ArrayList<CartaAzulDTO> list) {
		this.list = list;
	}

}
