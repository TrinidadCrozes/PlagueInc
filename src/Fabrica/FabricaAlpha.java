package Fabrica;

import logicaEntidades.Infectado;
import logicaEntidades.Infectado_Alpha;
import logicaEntidades.Proyectil_Infectado;
import logicaJuego.Juego;
import movimientoEntidades.Movimiento_Enemigo;

public class FabricaAlpha extends FabricaInfectado {
	protected Movimiento_Enemigo movimiento;
	protected Proyectil_Infectado proyectil;


	public FabricaAlpha(Juego juego) {
		super(juego);
	}

	@Override
	public Infectado crearInfectado() {
		return new Infectado_Alpha(movimiento, proyectil);
	}
	
	
	

}