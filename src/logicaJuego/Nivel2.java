 
package logicaJuego;

import logicaEntidades.Entidad;

/**
 * Clase que modela el nivel 2 del juego.
 */
public class Nivel2 extends Nivel {
	protected final int cantEnemigosOleada = 7;
	protected int cantEnemigosMapa = 0;
	protected final int nivel = 2;
	
	/**
	 * Constructor del nivel 2.
	 * @param juego Juego.
	 */
	public Nivel2(Juego juego) {
		super(juego);
		this.siguienteNivel = null;
		this.armarOleadas(cantEnemigosOleada,this.enemigos_primera_oleada);
		this.armarOleadas(cantEnemigosOleada,this.enemigos_segunda_oleada);
	}

	@Override
	public Nivel getSiguienteNivel() {
		return this.siguienteNivel;
	}
	
	@Override
	public Entidad getEnemigo(int oleada) {
		Entidad enemigo = null;
		if(oleada == 1 && !enemigos_primera_oleada.isEmpty()) {
			enemigo = this.enemigos_primera_oleada.pop();
			cantEnemigosMapa++;
		}else {
			if(oleada == 2 && !enemigos_segunda_oleada.isEmpty()) {
				enemigo = this.enemigos_segunda_oleada.pop();
				cantEnemigosMapa++;
			}
		}
		return enemigo;
	}
	
	@Override
	public boolean todosEnJuego() {
		return this.cantEnemigosMapa == this.cantEnemigosOleada;
	}
	
	@Override
	public void nadieEnJuego() {
		this.cantEnemigosMapa = 0;
	}

	@Override
	public int numeroNivel() {
		return nivel;
	}
	
}
