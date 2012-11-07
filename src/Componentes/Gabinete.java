package Componentes;

import java.awt.Component;
import java.util.List;

import Enum.Item;

public abstract class Gabinete {
	protected String descricao = "Gabinete Desconhecido";
	protected List<PecasDecorator> componentes;
//	protected float custo;
//	protected int baias;
	
	
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
	
	//M�todo Template
	public abstract float getCusto();
	
	public PecasDecorator addPecas(Item i){
		if (i.equals(Item.PLACA_MAE_INTEL))
			return new Placa_Mae_Intel(this);
		else
			return new Placa_Mae_Asus(this);
		//return null;this.componentes.add(p);
		
	}

	


}

	
