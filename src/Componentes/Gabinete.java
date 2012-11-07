package Componentes;

import java.awt.Component;
import java.util.List;

import Enum.Item;

public abstract class Gabinete {
	protected String descricao = "Gabinete Desconhecido";
	protected List<PecasDecorator> componentes;
	
	
	//	public Gabinete(String s){
//		descricao=s;
//	}
	
	
//	public final void t(){
//		
//		Gabinete g = new GabineteGamer(4);
//		List<PecaDecorator> pecas = new List<PecaDecorator>;
//		pecas.add()
//		
//	}
	
	public String getDescricao() {
		return this.descricao;
	}
	

	public abstract float getCusto();
	
}

	
