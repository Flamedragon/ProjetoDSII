package Enum;

public enum Item {
	
	PLACA_MAE(1),
	PROCESSADOR(2),
	MEM_RAM(3),
	HD(4),
	GRAVADOR_BD(5),
	GRAVADOR_CD(6),
	GRAVADOR_DVD(7),
	PLACA_VIDEO(8);
	
	
	private int item;
	
	private Item(int item){
		this.item=item;
	}
	
	public int getInt(){
		return item;
	}
}
