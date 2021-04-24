package Inicio;

import java.util.Scanner;
public class Programa05 {
	
	
	public static void main(String[] args) {
	
	int num01, num02, result ;
	
	Scanner sc= new Scanner(System.in); 
	
	System.out.println("Digite o primeiro numero ");
	num01= sc.nextInt();
	
	System.out.println("Digite o segundo numero ");
	num02= sc.nextInt();
	
	result = num01 + num02;
	
	System.out.println("O resultado de " + num01 + " + " + num02 + " é " + result);
		
		sc.close();
	}
	
}
