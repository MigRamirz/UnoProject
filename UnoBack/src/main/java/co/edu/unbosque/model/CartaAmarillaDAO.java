package co.edu.unbosque.model;

import java.util.ArrayList;

public class CartaAmarillaDAO implements CartaInterfaceDAO {

	private ArrayList<CartaAmarillaDTO> list;

	public CartaAmarillaDAO() {
		list = new ArrayList<>();
	}

	@Override
	public void determinarCarta() {
		for (int i = 0; i < 23; i++) {
			if (i == 0) {
				list.add(new CartaAmarillaDTO("Amarillo", "0"));
			} else if (i >= 1 && i < 10) {
				list.add(new CartaAmarillaDTO("Amarillo", i + ""));
				list.add(new CartaAmarillaDTO("Amarillo", i + ""));
			} else if (i == 10) {
				list.add(new CartaAmarillaDTO("Amarillo", "Toma2"));
				list.add(new CartaAmarillaDTO("Amarillo", "Toma2"));
			} else if (i == 11) {
				list.add(new CartaAmarillaDTO("Amarillo", "Reversa"));
				list.add(new CartaAmarillaDTO("Amarillo", "Reversa"));
			} else if (i == 12) {
				list.add(new CartaAmarillaDTO("Amarillo", "Salta"));
				list.add(new CartaAmarillaDTO("Amarillo", "Salta"));
			}
		}
	}

	public ArrayList<CartaAmarillaDTO> getList() {
		return list;
	}

	public void setList(ArrayList<CartaAmarillaDTO> list) {
		this.list = list;
	}

}
