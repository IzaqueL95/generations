package Exercicio_Java;

import java.util.Scanner;

public class Java_laco_repeticao_exercicio_5 {
	
public static void main(String[] args) {
		
		//5 -Crie um programa que leia um n�mero do teclado at� que encontre um
		//n�mero igual a zero. No final, mostre a soma dos n�meros
		//digitados.(DO...WHILE)
	
	int num,cont=0;
	Scanner ler = new Scanner(System.in);
	
	
	do
	{
			System.out.println("Digite um numero");
			num = ler.nextInt();
			
			cont = cont + num;
			
	   
	}while(num!=0);
	
	System.out.println("O resultado �: "+cont);
	
}		

}
