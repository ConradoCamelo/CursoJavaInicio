package Inicio;

import java.util.Scanner;

public class Programa19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);{	
			
		int num1, num2, num3, num4, num5;
		
		System.out.println("Digite um numero ");
		num1 = sc.nextInt();
		
		System.out.println("Digite um numero ");
		num2= sc.nextInt();	
		
		System.out.println("Digite um numero ");
		num3 = sc.nextInt();	
		
		System.out.println("Digite um numero ");
		num4 = sc.nextInt();
		
		System.out.println("Digite um numero ");
		num5 = sc.nextInt();
		
		if (num1 > num2 && num1 > num3 && num1>num4  && num1>num5) {
			
			System.out.println ("O maior numero ente " + num1 + ", " +num2+ ", " +num3+ ", " +num4+ ", "  +num5+  "  é: " +num1);
			
		}
		
		if (num2 > num1 && num2 > num3 && num2>num4  && num2>num5) {
			
			System.out.println("O maior numero ente " +num1+ ", " +num2+ ", " +num3+ ", " +num4+ ", "  +num5+  " é: " +num2);
			
		}
		
		if (num3 > num1 && num3 > num2 && num3>num4  && num3>num5) {
			
			System.out.println("O maior numero ente " +num1+ ", " +num2+ ", " +num3+ ", " +num4+ ", "  +num5+  " é: " +num3);
			
		}
		
		if (num4 > num1 && num4 > num2 && num4>num3  && num4>num5) {
			
			System.out.println("O maior numero ente " +num1+ ", " +num2+ ", " +num3+ ", " +num4+ ", "  +num5+  " é: " +num4);
			
		}
		
		if (num5 > num1 && num5 > num2 && num5>num3  && num5>num4) {
			
			System.out.println("O maior numero ente " +num1+ ", " +num2+ ", " +num3+ ", " +num4+ ", "  +num5+  " é: " +num5);
			
		}
			
	}
		sc.close();
	}
}
