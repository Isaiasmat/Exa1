package exa1;

public class tanque extends personaje {
	
	private boolean escudo_activado;

	// constructor
	tanque(int vida, int ataque, int personajes_creados) {
		super(vida, ataque, personajes_creados);
		
	}

	public boolean isEscudo_activado() {
		return escudo_activado;
	}

	public void setEscudo_activado(boolean escudo_activado) {
		this.escudo_activado = escudo_activado;
	}

}
