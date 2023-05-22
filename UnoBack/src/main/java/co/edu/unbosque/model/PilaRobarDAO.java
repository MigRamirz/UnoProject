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
				stack.push(amarilla.getList().get(numero));
				amcont++;
			} else if (color == 1 && rojcont < 25) {
				// rojo
				stack.push(roja.getList().get(numero));
				rojcont++;
			} else if (color == 2 && azulcont < 25) {
				// azul
				stack.push(azul.getList().get(numero));
				azulcont++;
			} else if (color == 3 && verdecont < 25) {
				// verde
				stack.push(verde.getList().get(numero));
				verdecont++;
			} else if (color == 4 && especialcont < 4) {
				stack.push(especial.getList().get(especiall));
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
			Object obj = it.next();
			if (obj instanceof CartaAmarillaDTO) {
				CartaAmarillaDTO am = (CartaAmarillaDTO) obj;
				System.out.println(am.getColor() + " " + am.getTipounumero());
			} else if (obj instanceof CartaAzulDTO) {
				CartaAzulDTO az = (CartaAzulDTO) obj;
				System.out.println(az.getColor() + " " + az.getTipounumero());
			} else if (obj instanceof CartaVerdeDTO) {
				CartaVerdeDTO ver = (CartaVerdeDTO) obj;
				System.out.println(ver.getColor() + " " + ver.getTipounumero());
			} else if (obj instanceof CartaRojaDTO) {
				CartaRojaDTO roj = (CartaRojaDTO) obj;
				System.out.println(roj.getColor() + " " + roj.getTipounumero());
			} else if (obj instanceof CartaEspecialDTO) {
				CartaEspecialDTO esp = (CartaEspecialDTO) obj;
				System.out.println(esp.getTipounumero());
			}
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
