
package Componentes;

import Enum.TipoPeca;



//import Enum.TipoPeca;

public class Placa_Mae_Asus extends PecasDecorator {
	
	
	public Placa_Mae_Asus(Gabinete g) {
		tipoPeca = TipoPeca.PLACA_MAE;
		descricao= g.descricao + "c/ placa m�e Asus";
	}

	@Override
	public String getDescricao() {

		return this.descricao;
	}


	@Override
	public float getCusto() {
		return 100;
	}



}

