package Inicio;

import java.util.Scanner;

public class Programa14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);{
		
		double a, b, c, x, delta;
		double x1, x2;
		
		
		System.out.println(" - Equa��o do Segundo Grau ax� + bx + c = 0");
		System.out.println("");
		
		System.out.println("Digite o valor de a");
		a = sc.nextDouble();
		System.out.println("Digite o valor de b");
		b = sc.nextDouble();
		System.out.println("Digite o valor de c");
		c = sc.nextDouble();
		
		
		if (a==0) {
		do {				
				System.out.println("Digite novamente o valor de a tem que ser diferente de 0");
				a = sc.nextDouble();
				
			} while (a==0);
		}
		delta = (b*b) - (4 * a * c);
		
		if(delta==0) {
			
			x = (-b + (Math.sqrt(delta)))/(2*a);
			
			System.out.println("");
			System.out.println("O valor de Delta � " + delta + " portanto s� existe uma raiz");
			System.out.println("");
			System.out.println("O valor de X �: " + x);
			
		}
		
		else {
		
		
		x1 = (-b + (Math.sqrt(delta)))/(2*a);
		x2 = (-b - (Math.sqrt(delta)))/(2*a);
		
		System.out.println("");
		System.out.println("O valor de Delta � " + delta );
		System.out.println("");
		System.out.println("O valor de X1 �: " + x1 + " O valor de X2 �: " +x2);
		}
		}
		
		sc.close();
	}

}
