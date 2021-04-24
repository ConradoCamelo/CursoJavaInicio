package Inicio;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Programa23 {

	public static void main(String[] args) {

	Scanner sc = new Scanner (System.in);{
	DecimalFormat formatador = new DecimalFormat("0.00");
		
	double divida, valor_parcela;
	int i=1, numero_parcela = 1 ,juros = 10;
	
	System.out.println("Qual o valor da divida:");
	divida = sc.nextDouble();
	System.out.println();
	System.out.print("Valor davida		Valor dos Juros		Quantidade de Parcelas		Valor da Parcela ");
	
	
		while(i<=12) {
			
	
		 valor_parcela = divida / numero_parcela;
		
		 System.out.println();		
		 System.out.println("R$"+divida+"			" +juros+"			" +numero_parcela+"				"+formatador.format(valor_parcela));
		 
		 numero_parcela++;
		 juros = juros + 10;
		 i++;
		 
		}
		System.out.println();
		System.out.println("Fim do Programa!");
	
	}
	sc.close();
	}

}
