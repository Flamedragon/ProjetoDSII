package Main;

import java.io.Console;
import java.io.IOException;
import java.util.Scanner;

import Componentes.Gabinete;
import Componentes.GabineteGamer;
import Enum.Item;

public class Main {
	public static void main(String args[]) throws IOException{
		int opc;
		Scanner input= new Scanner(System.in);
		Gabinete result;
		Gabinete g = new GabineteGamer();
		Item i= menu_principal(input);
		result = g.addPecas(i.getInt());    //Item.PLACA_MAE_INTEL);
		System.out.println(result.getDescricao());
	}
	
private static Item menu_principal(Scanner input) throws IOException{
	int opc;
	System.out.println("Qual Item deseja adicionar ao Gabinte:");
	System.out.println("1-Placa Mãe");
	System.out.println("2-Processador");
	System.out.println("3-Memoria");
	System.out.println("Digite a opção desejada:");
	opc= input.nextInt();
	if (opc==1)
		return menu_placa_mae(input);
	
	return null;
}

private static Item menu_placa_mae(Scanner input) throws IOException {
	int opc;
	for (int i=0;i<10;i++)
		System.out.println("==============");
	System.out.println("Qual das Placas deseja:");
	System.out.println("1-Intel");
	System.out.println("2-Asus");
	opc=input.nextInt();
	if (opc==1)
		return Item.PLACA_MAE_INTEL;
	else
		return Item.PLACA_MAE_ASUS;
	
	
}
}
