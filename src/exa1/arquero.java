package exa1;

public class arquero extends personaje {
	
	private int flechas;

	// Constructor
	arquero(int vida, int ataque, int personajes_creados) {
		super(vida, ataque, personajes_creados);
		
	}

	public int getFlechas() {
		return flechas;
	}

	public void setFlechas(int flechas) {
		this.flechas = flechas;
	}
		

}
