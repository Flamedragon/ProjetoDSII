package Componentes;

import java.util.ArrayList;
import java.util.List;

import Enum.Marca;
import Enum.TipoPeca;

public class Processador extends PecasDecorator {

	public Processador(Gabinete g, Marca m) {
		gab = g;
		marca=m;
		tipoPeca = TipoPeca.PROCESSADOR;
	}
	
	@Override
	public String getDescricao() {
		
		return gab.getDescricao() + ", " + this.tipoPeca + marca;
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
	     
	    return cus + gab.getCusto();
		 
	}
	
	public static List<Marca> getListaMarcas() {
		List<Marca> lista = new ArrayList<Marca>() ;
		lista.add(Marca.AMD);
		lista.add(Marca.INTEL);
		return lista;
	}
	
}
