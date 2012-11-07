package Componentes;

import Enum.TipoPeca;

public class Mem_Ram_Corsair extends PecasDecorator{
	int custo;
	//String descricao;
	
	
	public Mem_Ram_Corsair(Gabinete g){
		tipoPeca = TipoPeca.MEMORIA;
		descricao= g.descricao + "c/ Memória Corsair";
	}
	
	public float getCusto(){
		return custo;	 
	}
	
	public String getDescricao(){
		return descricao;
	}

}
