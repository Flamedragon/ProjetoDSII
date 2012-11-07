package Componentes;

import Enum.TipoPeca;

public class Placa_Video_Nvidia extends PecasDecorator {

	public Placa_Video_Nvidia(Gabinete g) {
		tipoPeca = TipoPeca.PLACA_VIDEO;
		descricao= g.descricao + " " + tipoPeca.toString() + " Nvidia";
	}
	
	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return descricao;
	}

	@Override
	public float getCusto() {
		// TODO Auto-generated method stub
		return 120;
	}

}
