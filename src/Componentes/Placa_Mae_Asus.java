package Componentes;

import java.util.List;

public class Placa_Mae_Asus extends PecasDecorator {

	String tipo = "Placa Mãe";
	
	public Placa_Mae_Asus(Gabinete g) {

		//for (List<PecasDecorator> g.componentes : comp) {
			
//		}
		
		g.componentes.add(this);
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
