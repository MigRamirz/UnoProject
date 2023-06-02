package co.edu.unbosque.model;

import java.util.ArrayList;

public class EspDAO {

	private ArrayList<EspDTO> list;

	public EspDAO() {
		list = new ArrayList<>();
		grupoDeCartas();
	}

	public void grupoDeCartas() {
		for (int i = 0; i < 8; i++) {
			if (i < 4) {
				list.add(new EspDTO("Especial", "CambioColor"));
			} else if (i >= 4) {
				list.add(new EspDTO("Especial", "Toma4"));
			}
		}
	}

	public String list() {
		StringBuilder sb = new StringBuilder();
		for (EspDTO a : list) {
			sb.append(a.toString() + "\n");
		}
		return sb.toString();
	}

	public ArrayList<EspDTO> getList() {
		return list;
	}

	public void setList(ArrayList<EspDTO> list) {
		this.list = list;
	}

}
