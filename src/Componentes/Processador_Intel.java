package Componentes;

import Enum.TipoPeca;

public class Processador_Intel extends PecasDecorator {

	public Processador_Intel(Gabinete g) {
		tipoPeca = TipoPeca.PROCESSADOR;
		descricao= g.descricao + " " + tipoPeca.toString() + " Intel";
	}
	
	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return descricao;
	}
	
	@Override
	public float getCusto() {
		// TODO Auto-generated method stub
		return 380;
	}

}
