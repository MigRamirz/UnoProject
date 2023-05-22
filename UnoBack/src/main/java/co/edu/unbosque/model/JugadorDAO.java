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
	
	public void manipularCadaCarta(int jug) {
		ArrayList<String> cartas = (ArrayList<String>) list.get(jug).getCarta();
		for (String carta : cartas) {
			System.out.println(carta);
		}
		System.out.println();
		System.out.println(cartas.get(3));
	}

	public Object darCarta(int jug, Object carta) {
		Object cartaent = null;
		ArrayList<Object> cartas = (ArrayList<Object>) list.get(jug).getCarta();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getIdjugador() == jug) {
				for (int j = 0; j < cartas.size(); j++) {
					if (cartas.get(i).equals(carta));
					cartaent = cartas.get(i);
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
