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
	
	public void formarPila(String carta) {
		if (stack.isEmpty()) {
			stack.push(prdao.repartirCartas1raVez());
		} else {
			stack.push(carta);
		}
	}
	
	public void listarpila() {
		Iterator<Object> it = stack.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}	
	}
	
	public static void main(String[] args) {
		PilaPonerDAO c = new PilaPonerDAO();
		c.prdao.formarPila();
		c.prdao.tamanopila();
		c.prdao.repartirCartas1raVez();
		c.prdao.getJdao().list();
		c.prdao.tamanopila();
		System.out.println();
		c.prdao.listarpila();
		System.out.println("lista de pila poner");
		c.formarPila(null);
		c.listarpila();
	}
}
