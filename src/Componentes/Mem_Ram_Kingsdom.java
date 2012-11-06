package Componentes;

public class Mem_Ram_Kingsdom extends PecasDecorator{
	int custo;
	//String descricao;
	
	
	public Mem_Ram_Kingsdom(Gabinete g){
		descricao= g.descricao + "c/ Memória Kingsdom";
	}
	
	public float getCusto(){
		return custo;	 
	}
	
	public String getDescricao(){
		return descricao;
	}

}
