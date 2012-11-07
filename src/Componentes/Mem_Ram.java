
package Componentes;


import java.util.ArrayList;
import java.util.List;

import Enum.Marca;
import Enum.TipoPeca;

public class Mem_Ram extends PecasDecorator{

	//String descricao;
	//teste4asdasdas
	
	
	public Mem_Ram(Gabinete g,Marca m){
		tipoPeca = TipoPeca.MEMORIA;
		gab = g;
		marca= m;
	}
	
	public float getCusto() {
		// TODO Auto-generated method stub
		
		float cus;
		
	    switch (marca) {

	    case CORSAIR: cus = 140;	break;
		case KINGSTON: cus = 170; break;

		default: cus = 0;	break;
		}
	     
	    return cus + gab.getCusto();
		 
	}
	
	public String getDescricao(){
		return gab.getDescricao() + ", " + this.tipoPeca + marca + ".";
	}

	public static List<Marca> getListaMarcas() {
		List<Marca> lista = new ArrayList<Marca>();
		lista.add(Marca.CORSAIR);
		lista.add(Marca.KINGSTON);
		return lista;
	} 
		
}

