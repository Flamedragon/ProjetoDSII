package Componentes;

import Enum.TipoPeca;

public class Gravador_de_BD extends PecasDecorator {

	public Gravador_de_BD(Gabinete g) {
		tipoPeca = TipoPeca.GRAVADOR;
		descricao= g.descricao + " " + tipoPeca.toString() + " de Blu-ray";
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
