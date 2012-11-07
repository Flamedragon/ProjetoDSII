package Componentes;

import java.util.List;

import Enum.Marca;
import Enum.TipoPeca;

public abstract class PecasDecorator extends Gabinete{
	  
	protected TipoPeca tipoPeca;
	protected Gabinete gab;
	protected Marca marca;
	protected List<Marca> listaMarcas;
	
	public abstract String getDescricao();

	public void setTipoPeca(TipoPeca tipoPeca) {
		this.tipoPeca = tipoPeca;
	}

	public TipoPeca getTipoPeca() {
		return tipoPeca;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public List<Marca> getListaMarcas() {
		return listaMarcas;
	}

	public void setListaMarcas(List<Marca> listaMarcas) {
		this.listaMarcas = listaMarcas;
	}
	
	

}
