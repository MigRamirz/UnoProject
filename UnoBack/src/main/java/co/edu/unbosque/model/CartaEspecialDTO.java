package co.edu.unbosque.model;

public class CartaEspecialDTO {

	// comodin (cambio de color), y +4
	private String tipounumero;

	public CartaEspecialDTO(String tipounumero) {
		super();
		this.tipounumero = tipounumero;
	}

	public String getTipounumero() {
		return tipounumero;
	}

	public void setTipounumero(String tipounumero) {
		this.tipounumero = tipounumero;
	}

	@Override
	public String toString() {
		return tipounumero;
	}
}
