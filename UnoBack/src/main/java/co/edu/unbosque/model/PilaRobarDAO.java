package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Stack;

public class PilaRobarDAO {

	private Stack<Object> stack;
	private CartaAmarillaDAO amarilla;
	private CartaRojaDAO roja;
	private CartaAzulDAO azul;
	private CartaVerdeDAO verde;
	private CartaEspecialDAO especial;
	private JugadorDAO jdao;

	public PilaRobarDAO() {
		stack = new Stack<>();
		amarilla = new CartaAmarillaDAO();
		roja = new CartaRojaDAO();
		azul = new CartaAzulDAO();
		verde = new CartaVerdeDAO();
		especial = new CartaEspecialDAO();
		setJdao(new JugadorDAO());
	}
	
	public void repartirCartas1raVez() {
		int jug = 0;
		for (int i = 0; i < 3; i++) {
			int lim = 0;
			ArrayList<String> cartasjugador = new ArrayList<>();
			while (lim < 7) {
				cartasjugador.add(stack.pop() + "");
				lim++;
			}
			getJdao().asignarCartas(jug, cartasjugador);
			if (lim == 7) {
				jug++;
			}
		}
	}

	public void tamanopila() {
		System.out.println(stack.size());
	}

	public void formarPila() {
		amarilla.determinarCarta();
		roja.determinarCarta();
		azul.determinarCarta();
		verde.determinarCarta();
		especial.determinarCarta();
		int amcont = 0;
		int rojcont = 0;
		int azulcont = 0;
		int verdecont = 0;
		int especialcont = 0;
		for (int i = 0; i < 108; i++) {
			Random r = new Random();
			int color = r.nextInt(5);
			int numero = r.nextInt(25);
			int especiall = r.nextInt(4);
			if (color == 0 && amcont < 25) {// 108
				// amarillo
				ArrayList<Object> carta = amarilla.getList().get(numero);
				stack.push(amarilla.getList().get(numero).getColor() + " "
						+ amarilla.getList().get(numero).getTipounumero());
				
				amcont++;
			} else if (color == 1 && rojcont < 25) {
				// rojo
				stack.push(roja.getList().get(numero).getColor() + " " + roja.getList().get(numero).getTipounumero());
				rojcont++;
			} else if (color == 2 && azulcont < 25) {
				// azul
				stack.push(azul.getList().get(numero).getColor() + " " + azul.getList().get(numero).getTipounumero());
				azulcont++;
			} else if (color == 3 && azulcont < 25) {
				// verde
				stack.push(verde.getList().get(numero).getColor() + " " + verde.getList().get(numero).getTipounumero());
				verdecont++;
			} else if (color == 4 && especialcont < 4) {
				stack.push(especial.getList().get(especiall).getTipounumero());
				especialcont++;
			}
			if (i == 24) {
				i = 0;
			}
			if (stack.size() == 50) {
				i = 25;
			}
		}
	}
	
	public void listarpila() {
		Iterator<Object> it = stack.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}	
	}
	
	public String cartaInicial() {
		return stack.pop()+"";
	}

	public JugadorDAO getJdao() {
		return jdao;
	}

	public void setJdao(JugadorDAO jdao) {
		this.jdao = jdao;
	}
}
