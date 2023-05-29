package co.edu.unbosque.model;

public class JugadorDTO {

	private int idjugador;
	private Object carta;

	public JugadorDTO(int idjugador, Object carta) {
		super();
		this.idjugador = idjugador;
		this.carta = carta;
	}

	public int getIdjugador() {
		return idjugador;
	}

	public void setIdjugador(int idjugador) {
		this.idjugador = idjugador;
	}

	public Object getCarta() {
		return carta;
	}

	public void setCarta(Object carta) {
		this.carta = carta;
	}

	@Override
	public String toString() {
		return idjugador + " " + carta.toString();
	}
	
}
