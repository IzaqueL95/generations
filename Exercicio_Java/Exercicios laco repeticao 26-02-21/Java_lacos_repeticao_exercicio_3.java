package Exercicio_Java;

import java.util.Scanner;

public class Java_lacos_repeticao_exercicio_3 {
	
	//3 Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		//21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		//idade for =-99. (WHILE)
		
		public static void main(String[] args) {
			
			int idade=0,count=0,countB=0;
			Scanner ler = new Scanner(System.in);
			System.out.println("Digite a sua idade");
			idade = ler.nextInt();
			
			while(idade!=-99)
			{
				
				
				if(idade<21)
				{
					count++;
				}
				else if(idade>50)
				{
					countB++;
				}
				System.out.println("Digite a sua idade");
			     idade = ler.nextInt();
				
				}
			
			System.out.println("Quantidade com menos de 21 anos é: "+count);	
			System.out.println("Quantidade com mais de 50 anos é: "+countB);
		}

	
	
	

}
