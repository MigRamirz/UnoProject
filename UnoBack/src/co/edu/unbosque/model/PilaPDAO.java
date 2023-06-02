package co.edu.unbosque.model;

import java.util.Iterator;
import java.util.Stack;

public class PilaPDAO {

	private Stack<CGeneralDTO> stack;
	private PilaRDAO pr;
	boolean reversa;

	public PilaPDAO() {
		stack = new Stack<>();
		pr = new PilaRDAO();
	}

	public void recibirCarta(String color, String numero) {
		stack.push(new CGeneralDTO(color, numero));
	}
	
	public String listarpila() {
		String a = "";
		Iterator<CGeneralDTO> it = stack.iterator();
		while (it.hasNext()) {
			a = a + it.next() + "\n";
		}
		return a;
	}

	public Stack<CGeneralDTO> getStack() {
		return stack;
	}

	public void setStack(Stack<CGeneralDTO> stack) {
		this.stack = stack;
	}

	public PilaRDAO getPr() {
		return pr;
	}

	public void setPr(PilaRDAO pr) {
		this.pr = pr;
	}

}
