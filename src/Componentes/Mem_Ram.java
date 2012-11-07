
package Componentes;


import java.util.List;

import Enum.Marca;
import Enum.TipoPeca;

public class Mem_Ram extends PecasDecorator{

	//String descricao;
	//teste4asdasdas
	
	
	public Mem_Ram(Gabinete g){
		tipoPeca = TipoPeca.MEMORIA;
		gab = g;
		//descricao= g.descricao + "c/ Mem�ria Corsair";
	}
	
	public float getCusto() {
		// TODO Auto-generated method stub
		
		float cus;
		
	    switch (marca) {

	    case CORSAIR: cus = 140;	break;
		case KINGSTON: cus = 170; break;

		default: cus = 0;	break;
		}
	     
	    return cus;
		 
	}
	
	public String getDescricao(){
		return gab.descricao + ", " + this.tipoPeca + marca + ".";
	}

	public List<Marca> getListaMarcas() {
		List<Marca> lista = listaMarcas;
		lista.add(Marca.CORSAIR);
		lista.add(Marca.KINGSTON);
		return lista;
	}
	
}

