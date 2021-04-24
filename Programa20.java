package Inicio;

import java.util.Scanner;

public class Programa20 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);{	
			
		int i;
		System.out.println("- Numeros pares");
		System.out.println("");
		for(i=0; i<=50; i++) {
			
			if(i % 2 == 0 ) {
				
			System.out.print(+i+ "");
			System.out.println(", par");
		}
		
		}//Final for
		System.out.println("");
		System.out.println("- Numeros Impares");
		System.out.println("");
		
		for(i=0; i<=50; i++) {
			
			if(i % 2 != 0 ) {
			
			System.out.print(+i+ "");
			System.out.println(", impar");
			
	} 
	}//Final for
	}
		sc.close();
	}
}
