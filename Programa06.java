package Inicio;

//Imprimimndo antecessor e sucessor de um n�mero

import java.util.Scanner;
public class Programa06 {

	public static void main(String[] args) {

	int num01, sucessor, antecessor;
	
	Scanner sc= new Scanner (System.in);
	
	System.out.println("Digite um numero ");
	num01 = sc.nextInt();
	
	sucessor = num01 + 1;
	antecessor = num01 - 1;
	
	System.out.println("O Sucessor de " + num01 + " � " + sucessor + " e seu antecessor � " + antecessor +".");

	sc.close();
	
	}

}
