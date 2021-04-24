package Inicio;

import java.util.Scanner;

public class Programa21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);{
			
		int num, i, result;
		
		System.out.println("- Digite qual tabuada você deseja saber ");
		num = sc.nextInt();
		
		boolean confirma = false;
		
		do {
			
			System.out.println("- Digite qual tabuada você deseja saber ");
			num = sc.nextInt();
			
			if(num<=0 || num >=10) {
				System.out.println("");
				System.out.println("Digite um numero entre 1 e 10. O número " + num + " não é valido! ");
				System.out.println("");
				confirma=false;
			}
			
			else {confirma = true;}
		
		} while (!confirma);
		
		System.out.println("");
		
		switch (num) {
		
		case 1: 
			
			for(i=0; i<=10; i++) {
			
			result = 1 * i;
			
			System.out.println("1 x "+i+ "= " +result);
				
			}break;
			
		case 2: 
			
			for(i=0; i<=10; i++) {
				
				result = 2 * i;
				
				System.out.println("2 x "+i+ "= " +result);
				
				}break;
		case 3: 
			
			for(i=0; i<=10; i++) {
				
				result = 3 * i;
				
				System.out.println("3 x "+i+ "= " +result);
				
				}break;
		case 4: 
			
			for(i=0; i<=10; i++) {
				
				result = 4 * i;
				
				System.out.println("4 x "+i+ "= " +result);
				
				}break;
		case 5: 
			
			for(i=0; i<=10; i++) {
				
				result = 5 * i;
				
				System.out.println("5 x "+i+ "= " +result);
				
				}break;
		case 6: 
			
			for(i=0; i<=10; i++) {
				
				result = 6 * i;
				
				System.out.println("6 x "+i+ "= " +result);
				
				}break;
			
		case 7: 
			
			for(i=0; i<=10; i++) {
				
				result = 7 * i;
				
				System.out.println("7 x "+i+ "= " +result);
				
				}break;
			
		case 8: 
			
			for(i=0; i<=10; i++) {
				
				result = 8 * i;
				
				System.out.println("8 x "+i+ "= " +result);
				
				}break;	
			
		case 9: 
			
			for(i=0; i<=10; i++) {
				
				result = 9 * i;
				
				System.out.println("9 x "+i+ "= " +result);
				
				}break;				
		}
	}
		sc.close();
	}
}
