package co.edu.unbosque.model;

import java.util.ArrayList;

public class Jugador1DAO {

	private ArrayList<Jugador1DTO> list;

	public Jugador1DAO() {
		list = new ArrayList<>();
	}

	public void AgregarCartas(String color, String numero) {
		list.add(new Jugador1DTO(color, numero));
	}

	public void botarCarta(int index) {
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).equals(index)) {
				list.remove(i);
			}
		}
	}

	public String list() {
		StringBuilder sb = new StringBuilder();
		for (Jugador1DTO a : list) {
			sb.append(a.toString() + "\n");
		}
		return sb.toString();
	}

	public ArrayList<Jugador1DTO> getList() {
		return list;
	}

	public void setList(ArrayList<Jugador1DTO> list) {
		this.list = list;
	}

}
