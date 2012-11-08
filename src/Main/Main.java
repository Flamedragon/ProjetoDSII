package Main;


import java.io.IOException;

import java.util.List;
import java.util.Scanner;

import Componentes.*;


import Enum.Marca;
import Enum.TipoPeca;

public class Main {
	public static void main(String args[]) throws IOException{
		int opc=-1;
		Gabinete g;
		Scanner input= new Scanner(System.in);
		System.out.println("Qual Gabinete o cliente deseja? \n");
		switch( menu_marcas(input, GabineteGamer.getListaMarcas()) ){
		case GAMER: g = new GabineteGamer();
					break;
		case CLONE: g=new GabineteClone();
					break;
		default:
			g=new GabineteGenerico();
		}
		for (int i=0;i<4;i++)
			System.out.println("==============");
		
		while (opc!=0){
			PecasDecorator aux = menu_principal(input,g);
			if (aux!=null)
				g = aux; 
			else
				opc=0;
		}
		System.out.println(g.getDescricao());
		System.out.println("Custando " + g.getCusto());
	}
	
private static PecasDecorator menu_principal(Scanner input,Gabinete g) throws IOException{
	int opc;
	imprimeOpcoes();
	opc= input.nextInt();
	switch(opc){
		case 1: if ( !(g.getDescricao().contains(TipoPeca.PLACA_MAE.toString())) )
					return new Placa_Mae(g, menu_marcas(input, Placa_Mae.getListaMarcas()));
				else System.out.println("Gabinete Já contém Placa Mãe"); 
					return menu_principal(input,g);//Item.PLACA_MAE ;//return menu_placa_mae(input);
		case 2: if ( !(g.getDescricao().contains(TipoPeca.PROCESSADOR.toString())) )
					return new Processador(g, menu_marcas(input, Processador.getListaMarcas()));
				else System.out.println("Gabinete Já contém Processador");
					return menu_principal(input,g);
		case 3: return new Mem_Ram(g, menu_marcas(input, Mem_Ram.getListaMarcas())); 
		case 4: return new HD(g, menu_marcas(input, HD.getListaMarcas()));
		case 5: return new Gravador_de_DVD(g, menu_marcas(input, Gravador_de_DVD.getListaMarcas())); 
		case 6: if ( !(g.getDescricao().contains(TipoPeca.PLACA_VIDEO.toString())) )
					return new Placa_Video(g, menu_marcas(input, Placa_Video.getListaMarcas()));
				else System.out.println("Gabinete Já contém Placa de Vídeo"); 
					menu_principal(input,g);
	default:
		return null;
	}
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
	System.out.println("Opção:");	
	opc=input.nextInt();
	
		return lista.get(opc - 1);
	
}

private static void imprimeOpcoes(){
	
	System.out.println("Qual Itens deseja adicionar ao Gabinete? \n");
	

	for (TipoPeca tipo: TipoPeca.values())
   {
     System.out.println((tipo.ordinal()+1) + " - " + tipo);
   }
	System.out.println("0-Para sair");
	System.out.println("Digite a opcao desejada:");
	
	
	
}

}
