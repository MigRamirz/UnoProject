package co.edu.unbosque.model;

public class CGeneralDTO {
	private String color;
	private String tiponumero;

	public CGeneralDTO(String color, String tiponumero) {
		super();
		this.color = color;
		this.tiponumero = tiponumero;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTiponumero() {
		return tiponumero;
	}

	public void setTiponumero(String tiponumero) {
		this.tiponumero = tiponumero;
	}

	@Override
	public String toString() {
		return color + " " + tiponumero;
	}
	
}
