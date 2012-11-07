package Enum;

public enum Item {
	
	PLACA_MAE_INTEL(1),
	PLACA_MAE_ASUS(2),
	PROCESSADOR_AMD(3),
	PROCESSADOR_INTEL(4),
	MEM_RAM_KINGSDOM(5),
	MEM_RAM_CORSAIR(6),
	HD_SEAGATE(7),
	HD_WD(8),
	GRAVADOR_BD(9),
	GRAVADOR_CD(10),
	GRAVADOR_DVD(11),
	PLACA_VIDEO_ATI(12),
	PLACA_VIDEO_NVIDIA(13);
	
	
	private int item;
	
	private Item(int item){
		this.item=item;
	}
	
	public int getInt(){
		return item;
	}
}
