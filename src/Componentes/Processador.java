package Componentes;

import java.util.List;

import Enum.Marca;
import Enum.TipoPeca;

public class Processador extends PecasDecorator {

	public Processador(Gabinete g) {
		gab = g;
		tipoPeca = TipoPeca.PROCESSADOR;
//		descricao= g.descricao + " " + tipoPeca.toString() + " AMD";
	}
	
	@Override
	public String getDescricao() {
		
		return gab.descricao + ", " + this.tipoPeca + marca + ".";
	}

	@Override
	public float getCusto() {
		// TODO Auto-generated method stub
		
		float cus;
		
	    switch (marca) {

	    case AMD: cus = 300;	break;
		case INTEL: cus = 380; break;

		default: cus = 0;	break;
		}
	     
	    return cus;
		 
	}
	
	@Override
	public List<Marca> getListaMarcas() {
		List<Marca> lista = listaMarcas;
		lista.add(Marca.AMD);
		lista.add(Marca.INTEL);
		return lista;
	}
	
}
