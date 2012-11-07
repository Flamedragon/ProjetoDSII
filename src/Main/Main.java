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
		Gabinete g = new GabineteGamer();
		while (opc!=0){
			//Item i= menu_principal(input);
			PecasDecorator aux = menu_principal(input,g);
			if (aux!=null)
			g = aux; 
			else
				opc=0;
		}
		System.out.println(g.getDescricao());
	}
	
private static PecasDecorator menu_principal(Scanner input,Gabinete g) throws IOException{
	int opc;
	imprimeOpcoes();
	opc= input.nextInt();
	switch(opc){
		//case 0: return g;
		case 1: return new Placa_Mae(g, menu_marcas(input,Placa_Mae.getListaMarcas())); //Item.PLACA_MAE ;//return menu_placa_mae(input);
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

private static void imprimeOpcoes(){
	
	System.out.println("Qual Itens deseja adicionar ao Gabinete? \n");
	

	for (TipoPeca tipo: TipoPeca.values())
   {
     System.out.println((tipo.ordinal()+1) + " - " + tipo);
   }
	System.out.println("0-Para sair");
	System.out.println("Digite a opção desejada:");
	
	
	
}

}
