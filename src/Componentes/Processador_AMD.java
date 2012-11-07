package Componentes;

import Enum.TipoPeca;

public class Processador_AMD extends PecasDecorator {

	public Processador_AMD(Gabinete g) {
		tipoPeca = TipoPeca.PROCESSADOR;
		descricao= g.descricao + " " + tipoPeca.toString() + " AMD";
	}
	
	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return descricao;
	}

	@Override
	public float getCusto() {
		// TODO Auto-generated method stub
		return 300;
	}

}
