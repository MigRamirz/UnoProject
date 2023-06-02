package co.edu.unbosque.model;

import java.util.ArrayList;

public class VdDAO {

	private ArrayList<VdDTO> list;

	public VdDAO() {
		list = new ArrayList<>();
		grupoDeCartas();
	}

	public void grupoDeCartas() {
		for (int i = 0; i < 11; i++) {
			if (i == 0) {
				list.add(new VdDTO("Verde", "0"));
			} else if (i > 0 && i <= 9) {
				list.add(new VdDTO("Verde", i + ""));
				list.add(new VdDTO("Verde", i + ""));
			} else if (i == 10) {
				list.add(new VdDTO("Verde", "Toma2"));
				list.add(new VdDTO("Verde", "Toma2"));
				list.add(new VdDTO("Verde", "Reversa"));
				list.add(new VdDTO("Verde", "Reversa"));
				list.add(new VdDTO("Verde", "Salta"));
				list.add(new VdDTO("Verde", "Salta"));
			}
		}
	}

	public String list() {
		StringBuilder sb = new StringBuilder();
		for (VdDTO a : list) {
			sb.append(a.toString() + "\n");
		}
		return sb.toString();
	}

	public ArrayList<VdDTO> getList() {
		return list;
	}

	public void setList(ArrayList<VdDTO> list) {
		this.list = list;
	}

}
