package Inicio;

import java.util.Scanner;

public class Programa17 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);{	
		
		int i; 
		
		for(i=0; i<20; i++) {
		
			System.out.println(" - Numero " + (i+1) );
		
		}
		
		System.out.println("");
		
		for(i=0; i<20; i++) {
			
			System.out.print(" Numero" + (i+1)+"," );
		
		}
	}
	
	sc.close();
	}
}
