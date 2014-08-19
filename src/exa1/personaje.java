package exa1;

//Bateando un poco

public class personaje 
{
	// Declarando las variables privadas
	protected int vida;
	protected int ataque;
	static int personajes_creados;
	
	// Parametros que tendra la clase
	// el compilador me recomendaba agregar la siguiente linea por la variable static declarada
	@SuppressWarnings("static-access")
	personaje(int vida, int ataque, int personajes_creados)
	{
		// estableciendo parametros iguales a las variables
		this.vida = vida;
		this.ataque =  ataque;
		this.personajes_creados = personajes_creados;
		
	}
	
	// creando metodo vida, ataque, personajes_creados (int) que retornaran las variables  
	int getVida()
	{
		return vida;
	}
	
	int getAtaque()
	{
		return ataque;
	}
	
	int getPersonajes_creados()
	{
		return personajes_creados;
	}
	
	// se establece nombres que tendran como parametro las variables
	void setVida(int vida)
	{
		// variable declarada anteriormente igual a la declarada en el set
		this.vida = vida;
	}
	
	void setAtaque (int ataque)
	{
		this.ataque = ataque;
	}
	
	// el compilador me recomendaba agregar la siguiente linea por la variable static declarada
	@SuppressWarnings("static-access")
	void setPersonajes_creados (int personajes_creados)
	{
		this.personajes_creados = personajes_creados;
	}
	

}