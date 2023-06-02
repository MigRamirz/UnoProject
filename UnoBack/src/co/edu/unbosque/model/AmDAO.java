package co.edu.unbosque.model;

import java.util.ArrayList;

public class AmDAO {

	private ArrayList<AmDTO> list;

	public AmDAO() {
		list = new ArrayList<>();
		grupoDeCartas();
	}

	public void grupoDeCartas() {
		for (int i = 0; i < 11; i++) {
			if (i == 0) {
				list.add(new AmDTO("Amarillo", "0"));
			} else if (i > 0 && i <= 9) {
				list.add(new AmDTO("Amarillo", i + ""));
				list.add(new AmDTO("Amarillo", i + ""));
			} else if (i == 10) {
				list.add(new AmDTO("Amarillo", "Toma2"));
				list.add(new AmDTO("Amarillo", "Toma2"));
				list.add(new AmDTO("Amarillo", "Reversa"));
				list.add(new AmDTO("Amarillo", "Reversa"));
				list.add(new AmDTO("Amarillo", "Salta"));
				list.add(new AmDTO("Amarillo", "Salta"));
			}
		}
	}

	public String list() {
		StringBuilder sb = new StringBuilder();
		for (AmDTO a : list) {
			sb.append(a.toString() + "\n");
		}
		return sb.toString();
	}

	public ArrayList<AmDTO> getList() {
		return list;
	}

	public void setList(ArrayList<AmDTO> list) {
		this.list = list;
	}

}
