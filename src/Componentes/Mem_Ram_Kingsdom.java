package Componentes;

import Enum.TipoPeca;

public class Mem_Ram_Kingsdom extends PecasDecorator{
	int custo;
	//String descricao;
	
	
	public Mem_Ram_Kingsdom(Gabinete g){
		tipoPeca = TipoPeca.MEMORIA;
		gab=g;
		//descricao= g.descricao + "c/ Mem�ria Kingsdom";
	}
	
	public float getCusto(){
		return custo;	 
	}
	
	public String getDescricao(){
		return gab.getDescricao() + ", " + this.tipoPeca + " Kingsdom";
	}

}
