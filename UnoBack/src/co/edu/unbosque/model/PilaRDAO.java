package co.edu.unbosque.model;

import java.util.Iterator;
import java.util.Random;
import java.util.Stack;

public class PilaRDAO {

	private Stack<CGeneralDTO> stack;

	private AmDAO am;
	private AzDAO az;
	private RjDAO rj;
	private VdDAO vd;
	private EspDAO esp;

	private Jugador1DAO j1;
	private Jugador2DAO j2;
	private Jugador3DAO j3;

	public PilaRDAO() {
		stack = new Stack<>();

		am = new AmDAO();
		az = new AzDAO();
		rj = new RjDAO();
		vd = new VdDAO();
		esp = new EspDAO();

		j1 = new Jugador1DAO();
		j2 = new Jugador2DAO();
		j3 = new Jugador3DAO();

		formarPila();
	}

	public void formarPila() {
		for (int i = 0; i < 112; i++) {
			Random r = new Random();
			int color = r.nextInt(5);
			int numero = r.nextInt(25);
			int numeroesp = r.nextInt(8);
			int amlim = 0;
			int azlim = 0;
			int rjlim = 0;
			int vdlim = 0;
			int esplim = 0;
			if (color == 0 && amlim < 25) {
				stack.push(
						new CGeneralDTO(am.getList().get(numero).getColor(), am.getList().get(numero).getTiponumero()));
				amlim++;
			} else if (color == 1 && azlim < 25) {
				stack.push(
						new CGeneralDTO(az.getList().get(numero).getColor(), az.getList().get(numero).getTiponumero()));
				azlim++;
			} else if (color == 2 && rjlim < 25) {
				stack.push(
						new CGeneralDTO(rj.getList().get(numero).getColor(), rj.getList().get(numero).getTiponumero()));
				rjlim++;
			} else if (color == 3 && vdlim < 25) {
				stack.push(
						new CGeneralDTO(vd.getList().get(numero).getColor(), vd.getList().get(numero).getTiponumero()));
				vdlim++;
			} else if (color == 4 && esplim < 8) {
				stack.push(new CGeneralDTO(esp.getList().get(numeroesp).getColor(),
						esp.getList().get(numeroesp).getTiponumero()));
				esplim++;
			}
		}
	}

	public void darCarta() {
		for (int i = 0; i < 3; i++) {
			for (int k = 0; k < 7; k++) {
				if (i == 0) {
					j1.AgregarCartas(stack.peek().getColor(), stack.peek().getTiponumero());
					stack.pop();
				} else if (i == 1) {
					j2.AgregarCartas(stack.peek().getColor(), stack.peek().getTiponumero());
					stack.pop();
				} else if (i == 2) {
					j3.AgregarCartas(stack.peek().getColor(), stack.peek().getTiponumero());
					stack.pop();
				}

			}
		}

	}

	public void darCartaCasoMas2(int jug) {
		int carta = 0;
		if (jug == 0) {
			while (carta > 2) {
				j1.AgregarCartas(stack.peek().getColor(), stack.peek().getTiponumero());
				stack.pop();
			}
		} else if (jug == 1) {
			while (carta > 2) {
				j2.AgregarCartas(stack.peek().getColor(), stack.peek().getTiponumero());
				stack.pop();
			}
		} else if (jug == 2) {
			while (carta > 2) {
				j3.AgregarCartas(stack.peek().getColor(), stack.peek().getTiponumero());
				stack.pop();
			}
		}
	}
	
	public void darCartaCasoMas4(int jug) {
		int carta = 0;
		if (jug == 0) {
			while (carta > 4) {
				j1.AgregarCartas(stack.peek().getColor(), stack.peek().getTiponumero());
				stack.pop();
			}
		} else if (jug == 1) {
			while (carta > 4) {
				j2.AgregarCartas(stack.peek().getColor(), stack.peek().getTiponumero());
				stack.pop();
			}
		} else if (jug == 2) {
			while (carta > 4) {
				j3.AgregarCartas(stack.peek().getColor(), stack.peek().getTiponumero());
				stack.pop();
			}
		}
	}

	public String listarpila() {
		String a = "";
		Iterator<CGeneralDTO> it = stack.iterator();
		while (it.hasNext()) {
			a = a + it.next() + "\n";
		}
		return a;
	}

	public Jugador1DAO getJ1() {
		return j1;
	}

	public void setJ1(Jugador1DAO j1) {
		this.j1 = j1;
	}

	public Jugador2DAO getJ2() {
		return j2;
	}

	public void setJ2(Jugador2DAO j2) {
		this.j2 = j2;
	}

	public Jugador3DAO getJ3() {
		return j3;
	}

	public void setJ3(Jugador3DAO j3) {
		this.j3 = j3;
	}

	public Stack<CGeneralDTO> getStack() {
		return stack;
	}

	public void setStack(Stack<CGeneralDTO> stack) {
		this.stack = stack;
	}

}
