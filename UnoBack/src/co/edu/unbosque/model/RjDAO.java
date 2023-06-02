package co.edu.unbosque.model;

import java.util.ArrayList;

public class RjDAO {

	private ArrayList<RjDTO> list;

	public RjDAO() {
		list = new ArrayList<>();
		grupoDeCartas();
	}

	public void grupoDeCartas() {
		for (int i = 0; i < 11; i++) {
			if (i == 0) {
				list.add(new RjDTO("Rojo", "0"));
			} else if (i > 0 && i <= 9) {
				list.add(new RjDTO("Rojo", i + ""));
				list.add(new RjDTO("Rojo", i + ""));
			} else if (i == 10) {
				list.add(new RjDTO("Rojo", "Toma2"));
				list.add(new RjDTO("Rojo", "Toma2"));
				list.add(new RjDTO("Rojo", "Reversa"));
				list.add(new RjDTO("Rojo", "Reversa"));
				list.add(new RjDTO("Rojo", "Salta"));
				list.add(new RjDTO("Rojo", "Salta"));
			}
		}
	}

	public String list() {
		StringBuilder sb = new StringBuilder();
		for (RjDTO a : list) {
			sb.append(a.toString() + "\n");
		}
		return sb.toString();
	}

	public ArrayList<RjDTO> getList() {
		return list;
	}

	public void setList(ArrayList<RjDTO> list) {
		this.list = list;
	}

}
