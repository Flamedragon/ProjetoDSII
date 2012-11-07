package Componentes;

import Enum.TipoPeca;



//import Enum.TipoPeca;

public class Placa_Mae_Asus extends PecasDecorator {
	
	
	public Placa_Mae_Asus(Gabinete g) {
		tipoPeca = TipoPeca.PLACA_MAE;
		descricao= g.descricao + "c/ placa mãe Asus";
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return this.descricao;
	}


	@Override
	public float getCusto() {
		// TODO Auto-generated method stub
		return 100;
	}



}
