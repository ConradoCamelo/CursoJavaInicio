package Inicio;

import java.util.Scanner;

public class Programa08 {

	public static void main(String[] args) {
		
	Scanner sc= new Scanner(System.in);{
	
	int codcidade, num_vei_pass, num_acid_vit, i;
	int maior=0, cid_maior=0, menor=0, cid_menor=0;
	int soma_acid=0, cont_acid=0;
	int media_vei, cont_vei=0, media_acid;
	
	for(i=0; i<5; i++);{
		
		System.out.println("Digite o Codigo da cidade ");
		codcidade = sc.nextInt();
		
		System.out.println("Digite o numero de veiculos de passeio ");
		num_vei_pass = sc.nextInt();
		
		System.out.println("Digite o numero de acidentes com vitima ");
		num_acid_vit = sc.nextInt();
		
		cont_vei= num_vei_pass + cont_vei;
		
		soma_acid = num_acid_vit + soma_acid;	
		
		cont_acid = num_acid_vit + cont_acid;
		
		if (i==0) {
			
			maior = num_acid_vit;
			cid_maior = codcidade;
			menor = num_acid_vit;
			cid_menor = codcidade;
		}
		else
		
			if(num_acid_vit > maior) {
				
				maior = num_acid_vit;
				cid_maior = codcidade;
				}
						
		
			else
				if(num_acid_vit<menor){
				
					menor = num_acid_vit;
					cid_menor = codcidade;
					
				}
				}
					media_vei = cont_vei / 5;
					
					if (cont_vei < 2000) {
					
					media_acid = soma_acid / cont_acid;
					
					System.out.println("Media de veiculos: " + media_vei);
					System.out.println("Numero de acidetens " + num_acid_vit);
					System.out.println("Media de acidentes " +media_acid);
					System.out.println("Cidade com maior numero de acidentes " +cid_maior+ "e o total de acidentes" + maior);
					System.out.println("Cidade com menor numero de acidentes " +cid_menor+ "e o total de acidentes" + menor);
					
					
					
					}
					
					
					
					
	}
	sc.close();	
	}	
	}

