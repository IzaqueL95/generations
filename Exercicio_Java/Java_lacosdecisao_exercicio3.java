package Exercicio_Java;

import java.util.Scanner;

public class Java_lacosdecisao_exercicio3 {
	
	public static void main(String[] args) {
		
		int idade, intantil, juvenil, adulto;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite a sua idade ");
		idade = ler.nextInt();
		
		if(idade>=10 && idade<=14)
		{
		System.out.println("Categoria nadador infantil");
		}
		else if(idade>14 && idade<=17)
		{
			System.out.println("categoria nadador juvenil");
		}
		else if (idade>=18 && idade<=25)
		{
			System.out.println("A categoria é nadador Adulto"); 
		}
		else
		{
			System.out.println("Idade não qualificada");
		}
	}

}
