package Componentes;

import Enum.Marca;

public class GabineteClone extends Gabinete{
	
	public GabineteClone(){
		
	}
	
	@Override
	public String getDescricao() {
		return "Gabinete " + Marca.CLONE;
	}
	
	public float getCusto() {

		return 120;
	}
	
	
	

}
