package Componentes;

import java.util.ArrayList;
import java.util.List;

import Enum.Marca;

public class GabineteGamer extends Gabinete{
	
		
	public GabineteGamer(){
		
		
		
	}
	
	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return "Gabinete " + Marca.GAMER;
	}
	
	@Override
	public float getCusto() {
		return 175;
	}
	
	public static List<Marca> getListaMarcas() {
		List<Marca> lista = new ArrayList<Marca>() ;
				//listaMarcas;
		lista.add(Marca.GAMER);
		lista.add(Marca.CLONE);
		lista.add(Marca.GENERICO);
		return lista;
	}

}