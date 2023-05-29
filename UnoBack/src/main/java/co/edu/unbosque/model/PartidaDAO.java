package co.edu.unbosque.model;

public class PartidaDAO {
	
	private JugadorDAO jdao;
	private PilaRobarDAO probardao;
	private PilaPonerDAO pponerdao;
	
	public PartidaDAO() {
		jdao = new JugadorDAO();
		probardao = new PilaRobarDAO();
		pponerdao = new PilaPonerDAO();
	}
	
	public void ponerCarta() {
		
	}
}
