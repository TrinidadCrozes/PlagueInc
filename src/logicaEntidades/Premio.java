package logicaEntidades;



import movimientoEntidades.*;


/**
 * Clase que modela un premio.
 */
public abstract class Premio extends Entidad {
	
	/**
	 * Constructor del premio.
	 * @param movimiento Movimiento del premio.
	 */
	public Premio(Movimiento movimiento) {
		super(movimiento);
	}
	
	@Override
	public void morir() {}
	
	@Override
	public void mover() {}

	@Override
	public void estadoCritico() {}
	
	@Override
	public void detener() {}
}
