package Inicio;

import java.util.Scanner;

public class Programa16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);{
			
			boolean confirma = false;
			double A, B, taxaA, taxaB ;
			int cont=0;
			
			
			do{
			
			System.out.println("Informe a população da cidade A");
			A = sc.nextDouble();
			
			if(A<=0) {
				
				System.out.println("NUmero da população de A deve ser maior que zero. ");
				confirma = false;
			}
			else {	
				confirma = true;
			}
			} while (!confirma);
			
			do{
				
				System.out.println("Informe a população da cidade B");
				B = sc.nextDouble();
				
				if(B<=0) {
					
					System.out.println("NUmero da população de B deve ser maior que zero. ");
					confirma = false;
				}
				else {	
					confirma = true;
				}
				} while (!confirma);
				
			do{
				
				System.out.println("Informe a taxa de crescimento da cidadade A ");
				taxaA = sc.nextDouble();
				
				if(taxaA<=0) {
					
					System.out.println("Taxa deve ser maior que 0 ");
					confirma = false;
				}
				else {	
					confirma = true;
				}
				} while (!confirma);
			
			do{
				
				System.out.println("Informe a taxa de crescimento da cidadade B ");
				taxaB = sc.nextDouble();
				
				if(taxaB<=0) {
					
					System.out.println("Taxa deve ser maior que 0 ");
					confirma = false;
				}
				else {	
					confirma = true;
				}
				} while (!confirma);
			
			
			do {
				
				A = (A * 0.03) + A;
				B = (B * 0.015) + B;
				cont++;
				
				
			} while (A <= B);
			
			System.out.println("");
			System.out.println("- O número de anos para Cidade A passar ou igualar B  " +cont+ " anos");
			System.out.println("");
			System.out.println("- População de A é " + A + " População de B é " +B);

		}
			sc.close();
		}

}
