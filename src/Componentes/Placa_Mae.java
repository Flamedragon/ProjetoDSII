
package Componentes;

import java.util.List;

import Enum.Marca;
import Enum.TipoPeca;



//import Enum.TipoPeca;

public class Placa_Mae extends PecasDecorator {
	
	
	public Placa_Mae(Gabinete g) {
		tipoPeca = TipoPeca.PLACA_MAE;
		gab = g;
		//descricao= g.descricao + "c/ placa m�e Asus";
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

	    case ASUS: cus = 100;	break;
		case INTEL: cus = 100; break;

		default: cus = 0;	break;
		}
	     
	    return cus;
		 
	}

	@Override
	public List<Marca> getListaMarcas() {
		List<Marca> lista = listaMarcas;
		lista.add(Marca.ASUS);
		lista.add(Marca.INTEL);
		return lista;
	}
	


}

