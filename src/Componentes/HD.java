package Componentes;

import java.util.List;

import Enum.Marca;
import Enum.TipoPeca;

public class HD extends PecasDecorator {

	public HD(Gabinete g) {
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

	@Override
	public List<Marca> getListaMarcas() {
		List<Marca> lista = listaMarcas;
		lista.add(Marca.WD);
		lista.add(Marca.SEAGATE);
		return lista;
	}
	
}
