package Vetores;

import java.util.Scanner;

//2- Faça um programa que receba 6 números inteiros e mostre:
//• Os números pares digitados;
//• A soma dos números pares digitados;
//• Os números ímpares digitados;
//• A quantidade de números ímpares digitados.

	

public class Exercicio_vetor_segundo {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int [] num = new int [6];
		int contpar=0,soma=0,contimpar=0,somaimpar=0,somapar=0;
		
		for(int x=0;x<6;x++)
		{
			System.out.println("Digite os numeros ");
			num [x]=ler.nextInt();
			if(num[x]%2==0)
			{
				
				contpar++;
				somapar = somapar + num[x];
				
				
			} 
			else
			{
				contimpar++;
				somaimpar = somaimpar +num[x];
				
				
			}
			
			
		}System.out.println("O resultado da soma dos pares é: "+somapar+" Quantidade de pares digitados "+contpar);
		System.out.println("O resultado  da soma dos impares é: "+somaimpar+" Quantidade de impares digitados "+contimpar);
		
		for(int x=0;x<6;x++)
		{
			;
			if(num[x]%2==0)
			{
				
				System.out.println("numeros par digitado: --> "+num[x]);
				
				
			} 
			else
			{
				System.out.println("Numeros impar digitado: --> "+num[x]);
				
				
			}
		
			
		}
	}

}
