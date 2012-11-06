package Componentes;

import java.util.List;

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
	
	//Método Template
	public abstract float getCusto();

	


}

	
