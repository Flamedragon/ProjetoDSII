package Main;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import Componentes.*;

import Enum.Item;
import Enum.Marca;
import Enum.TipoPeca;

public class Main {
	public static void main(String args[]) throws IOException{
		int opc=-1;
		Scanner input= new Scanner(System.in);
		//Gabinete result;
		Gabinete g = new GabineteGamer();
		while (opc!=0){
			//Item i= menu_principal(input);
			PecasDecorator aux = menu_principal(input,g);
			if (aux!=null)
			g = aux;  // g.addPecas(i.getInt());    //Item.PLACA_MAE_INTEL);
			else
				opc=0;
		}
		System.out.println(g.getDescricao());
	}
	
private static PecasDecorator menu_principal(Scanner input,Gabinete g) throws IOException{
	int opc;
//	System.out.println("Qual Itens deseja adicionar ao Gabinete:");
//	System.out.println("1-Placa Mãe");
//	System.out.println("2-Processador");
//	System.out.println("3-Memória");
//	System.out.println("4-HD");
//	System.out.println("5-Placa de Vídeo");
//	System.out.println("6-Gravadora");
//	System.out.println("0-Para sair");
//	System.out.println("Digite a opção desejada:");
	imprimeOpcoes();
	opc= input.nextInt();
	switch(opc){
		//case 0: return g;
		case 1: return new Placa_Mae(g, menu_placa_mae(input)); //Item.PLACA_MAE ;//return menu_placa_mae(input);
		case 2: return new Processador(g, menu_marcas(input,Processador.getListaMarcas()));
//		case 3: return menu_memoria(input); 
	default:
		return null;
	}
}

private static Marca menu_placa_mae(Scanner input) throws IOException {
	int opc;
	for (int i=0;i<10;i++)
		System.out.println("==============");
	System.out.println("Qual das Placas deseja:");
	System.out.println("1-Intel");
	System.out.println("2-Asus");
	opc=input.nextInt();
	if (opc==1)
		return Marca.INTEL;
	else
		return Marca.AMD;
}

private static Marca menu_marcas(Scanner input, List<Marca> lista) throws IOException {
	int opc;
	for (int i=0;i<10;i++)
		System.out.println("==============");
	System.out.println("Qual das Marcas deseja:");
	int i=1;
	for (Marca m: lista) {
		System.out.println(i + "-" + m);
		i++;
	}
		
	opc=input.nextInt();
	if (opc==1)
		return Marca.INTEL;
	else
		return Marca.AMD;
}
/*
private static Item menu_memoria(Scanner input) throws IOException {
	int opc;
	for (int i=0;i<10;i++)
		System.out.println("==============");
	System.out.println("Qual das Memórias deseja:");
	System.out.println("1-Corsair");
	System.out.println("2-Kingsdom");
	opc=input.nextInt();
	if (opc==1)
		return Item.MEM_RAM_CORSAIR;
	else
		return Item.MEM_RAM_KINGSDOM;
} */

private static void imprimeOpcoes(){
	
	System.out.println("Qual Itens deseja adicionar ao Gabinete? \n");
	

	for (TipoPeca tipo: TipoPeca.values())
   {
     System.out.println((tipo.ordinal()+1) + " - " + tipo);
   }
	System.out.println("0-Para sair");
	System.out.println("Digite a opção desejada:");
	
	
	
}


/*
public static PecasDecorator addPecas(int numItem,Gabinete g){
	/*if (i.equals(Item.PLACA_MAE_INTEL))
		return new Placa_Mae_Intel(this);
	else if (i.equals(Item.PLACA_MAE_ASUS)) 		
		return new Placa_Mae_Asus(this);
	else if (i.equals(Item.PROCESSADOR_AMD))
		return new Processador_AMD(this);
	else if (i.equals(Item.PROCESSADOR_INTEL))
		return new Processador_Intel(this);
	
	return null; 
	//return null;this.componentes.add(p);
	System.out.println(g.getDescricao());
	switch (numItem) {
	case 1: return new Placa_Mae_Intel(g);
	case 2: return new Placa_Mae_Asus(g);
	case 3: return new Processador_AMD(g);
	case 4: return new Processador_Intel(g);
	case 5:return new Mem_Ram_Kingsdom(g);
	case 6:return new Mem_Ram_Corsair(g);
	case 7:return new HD_Seagate(g);
	case 8:return new HD_WD(g);
	case 9:return new Gravador_de_BD(g);
	case 10:return new Gravador_de_CD(g);
	case 11:return new Gravador_de_DVD(g);
	case 12:return new Placa_Video_ATI(g);
	case 13:return new Placa_Video_Nvidia(g);
	default:
		return null;
	}
} */

}
