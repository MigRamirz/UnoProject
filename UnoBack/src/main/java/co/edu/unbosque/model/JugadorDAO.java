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

	public void list() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getIdjugador() + " " + list.get(i).getCarta());
		}
	}

}
