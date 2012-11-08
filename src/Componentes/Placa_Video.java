package Componentes;

import java.util.ArrayList;
import java.util.List;

import Enum.Marca;
import Enum.TipoPeca;

public class Placa_Video extends PecasDecorator {

	public Placa_Video(Gabinete g, Marca m) {
		tipoPeca = TipoPeca.PLACA_VIDEO;
		gab = g;
		marca=m;
	}
	
	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		if(gab.getDescricao().contains("AMD")) return gab.getDescricao() + ", " + this.tipoPeca + " " + marca + " c/ desconto de 20% pelo Processador AMD" ;
		else return gab.getDescricao() + ", " + this.tipoPeca + " " + marca  ;
	}

	@Override
	public float getCusto() {
		// TODO Auto-generated method stub
		
		float cus;
		
	    switch (marca) {

	    case ATI:if(gab.getDescricao().contains("AMD")) cus = 104;else cus = 130; break;
		case NVIDIA: cus = 120; break;

		default: cus = 0;	break;
		}
	     
	    return cus + gab.getCusto();
		 
	}


	public static List<Marca> getListaMarcas() {
		List<Marca> lista = new ArrayList<Marca>();
		lista.add(Marca.ATI);
		lista.add(Marca.NVIDIA);
		return lista;
	} 
	
}
