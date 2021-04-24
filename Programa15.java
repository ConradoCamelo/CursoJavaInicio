package Inicio;

import java.util.Scanner;

public class Programa15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);{
			
		double A=80000, B=200000;
		int cont=0;
		
		do {
			
			A = (A * 0.03) + A;
			B = (B * 0.015) + B;
			cont++;
			
			
		} while (A <= B);
		
		System.out.println("O número de anos para Cidade A passar ou igualar B  " +cont+ " anos");

	}
		sc.close();
	}
}
