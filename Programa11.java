	package Inicio;

import java.util.Scanner;

public class Programa11 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);{
		
		double nota01, nota02, media, media_classe, nota_geral=0, soma_nota;
		int i, cont_reprovado=0, cont_exame=0, cont_aprovados=0;
		
		for(i=0; i<6; i++){
			
			System.out.println("Alnuno "+ (i+1));
			System.out.println("Digite a primeira Nota");
			nota01 = sc.nextDouble();
			
			System.out.println("Digite a segunda Nota");
			nota02= sc.nextDouble();
			
			media = (nota01 + nota02)/2;
					
			if (media<3) {
				
			System.out.println("- Aluno Reprovado ");
			cont_reprovado++;	
			}
			
			else
				
			if(media>=3 && media <=7 ) {
				
			System.out.println("- Fazer exame");
			cont_exame++;
			}
			
			else
				
			if(media > 7) {
				
			System.out.println("- Aluno Aprovado");
			cont_aprovados++;
				
			}
			
			if(i>=0) {
				
			soma_nota = media;
			nota_geral = soma_nota + nota_geral;
			}
		
		}
		if (i==6) {
		media_classe = nota_geral/6;
		System.out.println("Media da classe é " + media_classe);
		System.out.println("Quantidade de alunos Aprovados " + cont_aprovados);
		System.out.println("Quantidade de alunos que vai precisar fazer Exame " + cont_exame);
		System.out.println("Quantidade de alunos Reprovados " + cont_reprovado);}
	}
	sc.close();
	}
}
