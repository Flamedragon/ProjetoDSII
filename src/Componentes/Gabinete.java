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
	

	public abstract float getCusto();
	
/*	public PecasDecorator addPecas(int numItem){
		/*if (i.equals(Item.PLACA_MAE_INTEL))
			return new Placa_Mae_Intel(this);
		else if (i.equals(Item.PLACA_MAE_ASUS)) 		
			return new Placa_Mae_Asus(this);
		else if (i.equals(Item.PROCESSADOR_AMD))
			return new Processador_AMD(this);
		else if (i.equals(Item.PROCESSADOR_INTEL))
			return new Processador_Intel(this);
		
		return null; 
		//return null;this.componentes.add(p);
		switch (numItem) {
		case 1: return new Placa_Mae(this);
		case 2: return new Processador(this);
		case 3:return new Mem_Ram(this);
		case 4:return new HD(this);
		case 5:return new Gravador_de_BD(this);
		case 6:return new Gravador_de_CD(this);
		case 7:return new Gravador_de_DVD(this);
		case 8:return new Placa_Video(this);
		default:
			return null;
		}
	}
	*/
}

	
