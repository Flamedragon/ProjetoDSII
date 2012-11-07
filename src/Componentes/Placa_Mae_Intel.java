package Componentes;

import Enum.TipoPeca;



//import Enum.TipoPeca;

public class Placa_Mae_Intel extends PecasDecorator {
	
	
	public Placa_Mae_Intel(Gabinete g) {
		tipoPeca = TipoPeca.PLACA_MAE;
		gab = g;
	}

	@Override
	public String getDescricao() {
		return gab.descricao +", " + this.tipoPeca + " Intel";
	}


	@Override
	public float getCusto() {
		// TODO Auto-generated method stub
		return 100;
	}



}
