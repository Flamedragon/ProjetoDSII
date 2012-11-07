package Componentes;

import java.util.List;

import Enum.Marca;
import Enum.TipoPeca;

public class Placa_Video extends PecasDecorator {

	public Placa_Video(Gabinete g) {
		tipoPeca = TipoPeca.PLACA_VIDEO;
		gab = g;
		//		descricao= g.descricao + " " + tipoPeca.toString() + " ATI";
	}
	
	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return gab.descricao + ", " + this.tipoPeca + marca + ".";
	}

	@Override
	public float getCusto() {
		// TODO Auto-generated method stub
		
		float cus;
		
	    switch (marca) {

	    case ATI: cus = 130;	break;
		case NVIDIA: cus = 120; break;

		default: cus = 0;	break;
		}
	     
	    return cus;
		 
	}


/*	public List<Marca> getListaMarcas() {
		List<Marca> lista = listaMarcas;
		lista.add(Marca.ATI);
		lista.add(Marca.NVIDIA);
		return lista;
	} */
	
}
