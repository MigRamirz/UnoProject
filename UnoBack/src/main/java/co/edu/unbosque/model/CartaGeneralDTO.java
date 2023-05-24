package co.edu.unbosque.model;

public class CartaGeneralDTO {
	private String color;
	private String tipounumero;

	public CartaGeneralDTO(String color, String tipounumero) {
		super();
		this.color = color;
		this.tipounumero = tipounumero;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTipounumero() {
		return tipounumero;
	}

	public void setTipounumero(String tipounumero) {
		this.tipounumero = tipounumero;
	}

	@Override
	public String toString() {
		return color + " " + tipounumero;
	}
	
	

}
