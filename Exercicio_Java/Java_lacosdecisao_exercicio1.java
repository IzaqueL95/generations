package Exercicio_Java;

import java.util.Scanner;

public class Java_lacosdecisao_exercicio1 {
	public static void main(String[] args) {
		
		int num1, num2, num3, total;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o primeiro numero");
		num1 = ler.nextInt();
		System.out.println("Digite o segundo numero");
		num2 = ler.nextInt();
		System.out.println("Digite o terceiro numero");
		num3 = ler.nextInt();
		
		if(num1>num2 && num1> num3)
		{
			System.out.println("O resultado é : "+num1);
		}	
		else if(num2 >num1 && num2>num3)
		{
			System.out.println("O resultado é :  "+num2);
		} 
		else
		{
			System.out.println("O resultado é : "+num3);
		}
	}	
		
		
	
	
		
	

}
