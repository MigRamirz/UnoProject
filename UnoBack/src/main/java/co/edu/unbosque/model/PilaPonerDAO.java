package co.edu.unbosque.model;

import java.util.Iterator;
import java.util.Stack;

public class PilaPonerDAO {

	private Stack<Object> stack;
	private PilaRobarDAO prdao;

	public PilaPonerDAO() {
		stack = new Stack<>();
		prdao = new PilaRobarDAO();
	}

	public void agregarCartaAPila(Object carta) {
		stack.push(carta);
	}

	public void listarpila() {
		Iterator<Object> it = stack.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public Object primeraCarta() {
		return stack.peek();
	}

	public static void main(String[] args) {
		PilaPonerDAO c = new PilaPonerDAO();
		c.prdao.formarPila();
		System.out.println("-----plia de cartas-----");
		c.prdao.listarpila();
		System.out.println("-----tamano pila--------");
		c.prdao.tamanopila();
		c.prdao.repartirCartas1raVez();
		System.out.println("-----jugadores con cartas-----");
		c.prdao.getJdao().list();
		System.out.println("-----nuevo tamano pila---------");
		c.prdao.tamanopila();
		System.out.println("-----pila actualizada-------");
		c.prdao.listarpila();
		System.out.println("----pila de poner----");
		c.agregarCartaAPila(c.prdao.cartaInicial());
		c.listarpila();
		System.out.println("-----plia de cartas actualizada-----");
		c.prdao.listarpila();
		System.out.println("-----tamano pila actualizado--------");
		c.prdao.tamanopila();
		System.out.println("----pila de poner actualizada----");
		c.agregarCartaAPila(c.prdao.getJdao().darCarta(1, c.primeraCarta()));
		c.listarpila();
	}

	public Stack<Object> getStack() {
		return stack;
	}

	public void setStack(Stack<Object> stack) {
		this.stack = stack;
	}

}
