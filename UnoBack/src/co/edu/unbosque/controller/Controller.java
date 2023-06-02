package co.edu.unbosque.controller;

import java.util.Scanner;

import co.edu.unbosque.model.CGeneralDTO;
import co.edu.unbosque.model.Jugador1DTO;
import co.edu.unbosque.model.PilaPDAO;
import co.edu.unbosque.model.PilaRDAO;

public class Controller {

	private PilaRDAO pr;
	private PilaPDAO pp;

	public Controller() {
		pr = new PilaRDAO();
		pp = new PilaPDAO();
		primerCarta();
	}

	public void primerCarta() {
		pp.recibirCarta(pr.getStack().peek().getColor(), pr.getStack().peek().getTiponumero());
		pr.getStack().pop();
//		pp.getStack().push(new CGeneralDTO("Rojo", "Reversa"));
	}

	public boolean partida() {
		boolean finpartida = false;
		while (!finpartida) {
			for (int i = 0; i < 3; i++) {
				if (i == 0) {
					for (int j = 0; j < pr.getJ1().getList().size(); j++) {
						if (pp.getStack().peek().getColor().equals(pr.getJ1().getList().get(j).getColor())
								|| pp.getStack().peek().getTiponumero()
										.equals(pr.getJ1().getList().get(j).getTiponumero())) {
							pp.recibirCarta(pr.getJ1().getList().get(j).getColor(),
									pr.getJ1().getList().get(j).getTiponumero());
							if (verificarSalta(pr.getJ1().getList().get(j).getTiponumero()) == true) {
								i = i + 2;
							}
							if (verificarToma2(pr.getJ1().getList().get(j).getTiponumero()) == true) {
								pr.darCartaCasoMas2(1);
							}
							if (verificarEspToma4(pr.getJ1().getList().get(j).getTiponumero()) == true) {
								pr.darCartaCasoMas4(1);
							}
							if (verificarEspCambioColor(pr.getJ1().getList().get(j).getTiponumero()) == true) {
								pp.recibirCarta(pr.getJ1().getList().get(j).getColor(),
										pr.getJ1().getList().get(j).getTiponumero());
							}
							pr.getJ1().botarCarta(j);
							if (pr.getJ1().getList().size() == 1) {
								System.out.println("jugador " + (i + 1) + ":" + avisoUno());
							}
							if (pr.getJ1().getList().size() == 0) {
								finpartida = false;
								System.out.println("¡Gana jugador " + (i + 1) + "!");
							}
						}
					}
				}
				if (i == 1) {
					for (int j = 0; j < pr.getJ2().getList().size(); j++) {
						if (pp.getStack().peek().getColor().equals(pr.getJ2().getList().get(j).getColor())
								|| pp.getStack().peek().getTiponumero()
										.equals(pr.getJ2().getList().get(j).getTiponumero())) {
							pp.recibirCarta(pr.getJ2().getList().get(j).getColor(),
									pr.getJ2().getList().get(j).getTiponumero());
							if (verificarSalta(pr.getJ2().getList().get(j).getTiponumero()) == true) {
								i = 0;
							}
							if (verificarToma2(pr.getJ2().getList().get(j).getTiponumero()) == true) {
								pr.darCartaCasoMas2(2);
							}
							if (verificarEspToma4(pr.getJ2().getList().get(j).getTiponumero()) == true) {
								pr.darCartaCasoMas4(2);
							}
							if (verificarEspCambioColor(pr.getJ2().getList().get(j).getTiponumero()) == true) {
								pp.recibirCarta(pr.getJ2().getList().get(j).getColor(),
										pr.getJ2().getList().get(j).getTiponumero());
							}
							pr.getJ2().botarCarta(j);
							if (pr.getJ2().getList().size() == 1) {
								System.out.println("jugador " + (i + 1) + ":" + avisoUno());
							}
							if (pr.getJ2().getList().size() == 0) {
								finpartida = false;
								System.out.println("¡Gana jugador " + (i + 1) + "!");
							}
						}
					}
				}
				if (i == 2) {
					for (int j = 0; j < pr.getJ3().getList().size(); j++) {
						if (pp.getStack().peek().getColor().equals(pr.getJ3().getList().get(j).getColor())
								|| pp.getStack().peek().getTiponumero()
										.equals(pr.getJ3().getList().get(j).getTiponumero())) {
							pp.recibirCarta(pr.getJ3().getList().get(j).getColor(),
									pr.getJ3().getList().get(j).getTiponumero());
							if (verificarSalta(pr.getJ3().getList().get(j).getTiponumero()) == true) {
								i = 0;
							}
							if (verificarToma2(pr.getJ3().getList().get(j).getTiponumero()) == true) {
								pr.darCartaCasoMas2(0);
							}
							if (verificarEspToma4(pr.getJ3().getList().get(j).getTiponumero()) == true) {
								pr.darCartaCasoMas4(0);
							}
							if (verificarEspCambioColor(pr.getJ3().getList().get(j).getTiponumero()) == true) {
								pp.recibirCarta(pr.getJ3().getList().get(j).getColor(),
										pr.getJ3().getList().get(j).getTiponumero());
							}
							pr.getJ3().botarCarta(j);
							if (pr.getJ3().getList().size() == 1) {
								System.out.println("jugador " + (i + 1) + ":" + avisoUno());
							}
							if (pr.getJ3().getList().size() == 0) {
								finpartida = false;
								System.out.println("¡Gana jugador " + (i + 1) + "!");
							}
						}
					}
				}
			}
		}
		return finpartida;
	}

	public int seleccionJugador3() {
		Scanner sc = new Scanner(System.in);
		System.out.println(pr.getJ3().list());
		int pos = sc.nextInt();
		return pos;
	}

	public boolean verificarReversa(String tipo) {
		String r = "Reversa";
		boolean reversa = false;
		if (tipo.equals(r)) {
			reversa = true;
		}
		return reversa;
	}

	public boolean verificarSalta(String tipo) {
		String s = "Salta";
		boolean salta = false;
		if (tipo.equals(s)) {
			salta = true;
		}
		return salta;
	}

	public boolean verificarToma2(String tipo) {
		String t2 = "Toma2";
		boolean toma2 = false;
		if (tipo.equals(t2)) {
			toma2 = true;
		}
		return toma2;
	}

	public boolean verificarEspToma4(String tipo) {
		String t4 = "Toma4";
		boolean toma4 = false;
		if (tipo.equals(t4)) {
			toma4 = true;
		}
		return toma4;
	}

	public boolean verificarEspCambioColor(String tipo) {
		String cc = "CambioColor";
		boolean cambiocolor = false;
		if (tipo.equals(cc)) {
			cambiocolor = true;
		}
		return cambiocolor;
	}

	public String avisoUno() {
		return "¡Uno!";
	}

//	public void darCartaJug(int turnojug) {// más 2 o más 4
//		
//	}

//	public void recibirCartaJugadorEnPila() {
//		
//	}

	public void DarCartasIniciales() {
		pr.darCarta();
	}

	public void OrganizarJuego() {
		DarCartasIniciales();
		// más sentencias
	}

	public static void main(String[] args) {
		Controller c = new Controller();
		c.OrganizarJuego();
//		c.partida();
		while (c.partida() != false) {
			System.out.println("...................pila poner");
			System.out.println(c.pp.listarpila());
			System.out.println("...................cartas j1");
			System.out.println(c.pr.getJ1().list());
			System.out.println("...................cartas j2");
			System.out.println(c.pr.getJ2().list());
			System.out.println("...................cartas j3");
			System.out.println(c.pr.getJ3().list());
		}

//		c.partida();
		System.out.println("...................pila poner");
		System.out.println(c.pp.listarpila());
	}
}
