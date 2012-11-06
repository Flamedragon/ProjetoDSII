package Componentes;

public class Placa_Mae_Intel extends PecasDecorator {
	 String tipo = "motherboard";
	
	public Placa_Mae_Intel(Gabinete g) {
		descricao= g.descricao + "c/ placa mãe Asus";
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return this.descricao;
	}


	@Override
	public float getCusto() {
		// TODO Auto-generated method stub
		return 100;
	}



}
