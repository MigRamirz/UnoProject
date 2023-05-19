package co.edu.unbosque.model;

public class CartaRojaDTO extends CartaGeneralDTO{

	public CartaRojaDTO(String color, String tipounumero) {
		super(color, tipounumero);
	}
	
	@Override
	public String getColor() {
		return super.getColor();
	}
	
	@Override
	public String getTipounumero() {
		return super.getTipounumero();
	}
}
