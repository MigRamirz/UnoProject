package co.edu.unbosque.model;

public class CartaAmarillaDTO extends CartaGeneralDTO{

	public CartaAmarillaDTO(String color, String tipounumero) {
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
