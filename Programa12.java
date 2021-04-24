package Inicio;

import java.util.Scanner;

public class Programa12 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);{
			
		String nome, sexo, estado_civil;
		float salario;
		int idade;
		
		
		
		do {
		
			System.out.println("Digite seu nome ");
		nome = sc.next();		
		
		if(nome.length() <=3 ){
			
			System.out.println("Digite um nome que tenha mais de 3 caracteres ");
			System.out.println("");
		}
		
	
		}while(nome.length() <= 3);
		
		System.out.println("Digite sua idade ");
		idade= sc.nextInt();
		
		if (idade>150) {
			
			do {
				
				System.out.println("Digite sua idade ");
				idade= sc.nextInt();
				
			} while (idade>150);
		}
		
		System.out.println("Digite o salário ");
		salario = sc.nextFloat();
		
		if (salario <= 0 ) {
			
			do {
				
				System.out.println("Digite o salário ");
				salario = sc.nextFloat();
				
			} while (salario<=0);
		}
				
			do {
				
				System.out.println("Digite o Sexo ");
				sexo = sc.next();
				
			} while (!sexo.equals("m") && !sexo.equals("f"));
		
		System.out.println("Digite o estado civil ");
		estado_civil = sc.next();
		
		if (!estado_civil.equals("s") && !estado_civil.equals("c")  && !estado_civil.equals("v")  && !estado_civil.equals("d") ) {
			
			do {
				
				System.out.println("Digite o estado civil ");
				estado_civil = sc.next();
				
			} while (!estado_civil.equals("s") && !estado_civil.equals("c")  && !estado_civil.equals("v")  && !estado_civil.equals("d"));
		
		}
		
		System.out.println("Nome: " +nome);
		System.out.println("Idade: " +idade);
		System.out.println("Estado civil " +estado_civil);
		System.out.println("Sexo: " +sexo);
		System.out.println("Salario: " +salario);
		
		}
	
		sc.close();
	}

}
