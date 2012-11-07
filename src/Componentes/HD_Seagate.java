package Componentes;

import Enum.TipoPeca;

public class HD_Seagate extends PecasDecorator {

	public HD_Seagate(Gabinete g) {
		tipoPeca = TipoPeca.HD;
		descricao= g.descricao + " " + tipoPeca.toString() + " Seagate";
	}
	
	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return descricao;
	}

	@Override
	public float getCusto() {
		// TODO Auto-generated method stub
		return 140;
	}

}
