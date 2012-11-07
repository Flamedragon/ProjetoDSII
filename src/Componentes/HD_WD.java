package Componentes;

import Enum.TipoPeca;

public class HD_WD extends PecasDecorator {

	public HD_WD(Gabinete g) {
		tipoPeca = TipoPeca.HD;
		descricao= g.descricao + " " + tipoPeca.toString() + " Western Digital";
	}
	
	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return descricao;
	}

	@Override
	public float getCusto() {
		// TODO Auto-generated method stub
		return 180;
	}

}
