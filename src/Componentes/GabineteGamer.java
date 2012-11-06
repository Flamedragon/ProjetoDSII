package Componentes;

public class GabineteGamer extends Gabinete{
	private float custo = 175;
	//private int baias;
	//private boolean cooler;
		
	public GabineteGamer(){
		
		descricao = "Gabinete Gamer";
		
	}
	
	@Override
	public float getCusto() {
		return custo;
	}
	

}