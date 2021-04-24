package Inicio;

import java.util.Scanner;

public class Programa10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);{
		
		Double salario= 10000.0, novo_salario, percentual;
		int i, ano_atual; 
		
		
		System.out.println("Digite o ano atual ");
		ano_atual = sc.nextInt();
		
		novo_salario = (salario * 0.015) + salario;
	
		for (i=2021; i<=ano_atual; i++) {
			
			
		percentual = 2 * 0.015;
		
		novo_salario = (novo_salario * percentual) + novo_salario;
			
		}
		
		System.out.println ("O salario atual no ano de " +ano_atual + " é R$" +novo_salario);
		
		}
		
		sc.close();
	}
	
}
