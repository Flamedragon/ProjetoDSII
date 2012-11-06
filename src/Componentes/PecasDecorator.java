package Componentes;

import Enum.TipoPeca;

public abstract class PecasDecorator extends Gabinete{
	
	private TipoPeca tipoPeca;
	
	public abstract String getDescricao();

	public void setTipoPeca(TipoPeca tipoPeca) {
		this.tipoPeca = tipoPeca;
	}

	public TipoPeca getTipoPeca() {
		return tipoPeca;
	}

}
