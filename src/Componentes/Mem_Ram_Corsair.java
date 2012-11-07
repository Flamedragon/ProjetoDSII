
package Componentes;


import Enum.TipoPeca;

public class Mem_Ram_Corsair extends PecasDecorator{
	int custo;
	//String descricao;
	//teste4asdasdas
	
	
	public Mem_Ram_Corsair(Gabinete g){
		tipoPeca = TipoPeca.MEMORIA;
		gab = g;
		//descricao= g.descricao + "c/ Mem�ria Corsair";
	}
	
	public float getCusto(){
		return custo;	 
	}
	
	public String getDescricao(){
		return gab.getDescricao() + ", " + this.tipoPeca + " Corsair";
	}

}

