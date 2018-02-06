package edu.tallerweb.pptls;

/**
 * Representa una de las Manos involucradas en el juego
 */
public class Mano {

	private Mano forma;

	/**
	 * Toda Mano debe crearse con una forma dada, que será
	 * la que determine su condición en el juego.
	 * @param forma, la Forma que adopta la Mano.
	 */
	public Mano(final Forma forma) {
		this.forma = forma;
	}

	/**
	 * Evaluará el resultado de la partida según las reglas
	 * del juego.
	 * @param otra, la otra Mano.
	 * @return un Resultado, de acuerdo al estado del juego.
	 */
	public Resultado jugarCon(final Mano otra) {
		Resultado[][] tablaResultado = {
				{Resultado.EMPATA, Resultado.PIERDE, Resultado.PIERDE,
						Resultado.GANA, Resultado.GANA },
				{Resultado.GANA, Resultado.EMPATA, Resultado.PIERDE,
						Resultado.PIERDE, Resultado.GANA },
				{Resultado.GANA, Resultado.GANA, Resultado.EMPATA,
						Resultado.PIERDE, Resultado.PIERDE },
				{Resultado.PIERDE, Resultado.GANA, Resultado.GANA,
						Resultado.EMPATA, Resultado.PIERDE },
				{Resultado.PIERDE, Resultado.PIERDE, Resultado.GANA,
						Resultado.GANA, Resultado.EMPATA } };
		return tablaResultado[this.forma.getValor()][otra.forma.getValor()];
	}

}
