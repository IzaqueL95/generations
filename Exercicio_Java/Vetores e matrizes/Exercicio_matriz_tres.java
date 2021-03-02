package matrizes;

import java.util.Scanner;

public class Exercicio_matriz_tres {
	
	public static void main(String[] args) {
		
		//Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
		
		Scanner ler = new Scanner(System.in);
		
		
		int[][] matriz = new int [3][3];
		int cont=0;
		
		for(int linha=0; linha<3; linha++)
		{
			for(int coluna =0; coluna<3; coluna++)
			{
				System.out.println("Digite os valores 9 vezes");
				matriz[linha][coluna]=ler.nextInt();
				if(matriz[linha][coluna]>10)
				{
					cont++;
				}
			}
		}System.out.println("Numeros maiores que 10 aparecem "+cont+" Vezes");
		
	}

}
