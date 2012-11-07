package Componentes;

import java.util.ArrayList;
import java.util.List;

import Enum.Marca;
import Enum.TipoPeca;

public class Gravador_de_DVD extends PecasDecorator {

public Gravador_de_DVD(Gabinete g, Marca m) {
	
	tipoPeca = TipoPeca.GRAVADOR;
	gab = g;
	marca= m;
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

    case LG: cus = 300;	break;
	case SONY: cus = 380; break;

	default: cus = 0;	break;
	}
     
    return cus + gab.getCusto();
	 
}
	
	public static List<Marca> getListaMarcas() {
		List<Marca> lista = new ArrayList<Marca>();
		lista.add(Marca.LG);
		lista.add(Marca.SONY);
		return lista;
	} 
}
