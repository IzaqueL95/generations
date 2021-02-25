package Exercicio_Java;

import java.util.Scanner;

public class Exercicio_1 {
	
	public static void main(String[] args) {
		int idade, diasAno, mes, total;
			Scanner ler = new Scanner(System.in);
			{
				System.out.println("Digite a sua idade");
				idade = ler.nextInt();
				System.out.println("Digite o mês");
				mes = ler.nextInt();
				System.out.println("Digite os dias");
				diasAno = ler.nextInt();
			}
			
			total = idade*365 + mes*30 + diasAno;
				
				System.out.printf("O resultado é %d dias ",total);
				
				
		
		
	}

}
