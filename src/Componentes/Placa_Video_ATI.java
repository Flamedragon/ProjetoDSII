package Componentes;

import Enum.TipoPeca;

public class Placa_Video_ATI extends PecasDecorator {

	public Placa_Video_ATI(Gabinete g) {
		tipoPeca = TipoPeca.PLACA_VIDEO;
		descricao= g.descricao + " " + tipoPeca.toString() + " ATI";
	}
	
	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return descricao;
	}

	@Override
	public float getCusto() {
		// TODO Auto-generated method stub
		return 130;
	}

}
