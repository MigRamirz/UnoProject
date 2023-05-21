package co.edu.unbosque.model;

import java.util.ArrayList;

public class JugadorDAO {

	private ArrayList<JugadorDTO> list;

	public JugadorDAO() {
		list = new ArrayList<>();
		crearJugadores();
	}

	private void crearJugadores() {
		list.add(new JugadorDTO(1, null));
		list.add(new JugadorDTO(2, null));
		list.add(new JugadorDTO(3, null));
	}

	public void asignarCartas(int jug, Object carta) {
		list.get(jug).setCarta(carta);
	}
	
	public Object darCarta(int jug, Object carta) {
		Object cartaent = null;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getIdjugador() == jug) {
				if (list.get(i).getCarta().equals(carta)) {
					cartaent = list.get(i).getCarta();
				}
			}
		}
		return cartaent;
	}

	public void list() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getIdjugador() + " " + list.get(i).getCarta());
		}
	}

	public ArrayList<JugadorDTO> getList() {
		return list;
	}

	public void setList(ArrayList<JugadorDTO> list) {
		this.list = list;
	}

}
