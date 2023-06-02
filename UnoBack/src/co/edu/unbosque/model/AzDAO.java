package co.edu.unbosque.model;

import java.util.ArrayList;

public class AzDAO {

	private ArrayList<AzDTO> list;

	public AzDAO() {
		list = new ArrayList<>();
		grupoDeCartas();
	}

	public void grupoDeCartas() {
		for (int i = 0; i < 11; i++) {
			if (i == 0) {
				list.add(new AzDTO("Azul", "0"));
			} else if (i > 0 && i <= 9) {
				list.add(new AzDTO("Azul", i + ""));
				list.add(new AzDTO("Azul", i + ""));
			} else if (i == 10) {
				list.add(new AzDTO("Azul", "Toma2"));
				list.add(new AzDTO("Azul", "Toma2"));
				list.add(new AzDTO("Azul", "Reversa"));
				list.add(new AzDTO("Azul", "Reversa"));
				list.add(new AzDTO("Azul", "Salta"));
				list.add(new AzDTO("Azul", "Salta"));
			}
		}
	}

	public String list() {
		StringBuilder sb = new StringBuilder();
		for (AzDTO a : list) {
			sb.append(a.toString() + "\n");
		}
		return sb.toString();
	}

	public ArrayList<AzDTO> getList() {
		return list;
	}

	public void setList(ArrayList<AzDTO> list) {
		this.list = list;
	}

}
