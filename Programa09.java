package Inicio;

import java.util.Scanner;

public class Programa09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);{
		
		float nota;
		
		int parar=0;
		
		do {
			System.out.println("Digite uma nota");
			nota = sc.nextFloat();
			
		if (nota>=0 && nota <=10) {	
		System.out.println("Você digitou " +nota);
		nota = sc.nextFloat();
		parar = 0;
		
		}
		
		else {
			
			System.out.println("Nota Invalida, digite uma nota de 0 a 10");
		 
		 }
		
		} while (parar !=0);
	}		
		sc.close();
	}
}
