package Inicio;
import java.util.Scanner;

public class Programa13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);{
		
			String nome; 
			String senha;
			int parar = 0;
			
			do {
			
			System.out.println("Digite o seu nome ");
			nome = sc.next();
			
			System.out.println("Digite sua senha ");
			senha = sc.next();
			
			if(nome.equalsIgnoreCase (senha)) { 
				
				System.out.println("Digite nome e senha novamente");
				parar=1;
			}
			
			else {System.out.println("Senha válida");
			
			System.out.println("");
			System.out.println("Programa Finalizado!");
			parar = 0;	
			}
			} while (parar != 0);
			
	}		
		sc.close();
	}
}
