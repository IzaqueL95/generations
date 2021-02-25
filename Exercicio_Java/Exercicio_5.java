package Exercicio_Java;

import java.util.Scanner;

public class Exercicio_5 {
	
	public static void main(String[] args) {
		
		double nota1, nota2, nota3, peso, notas;
		double mediaPonderada;
		Scanner ler = new Scanner(System.in);
		
			System.out.println("Digite a primeira nota");
			nota1 = ler.nextInt();
			System.out.println("Digite a segunda nota");
			nota2 = ler.nextInt();
			System.out.println("Digite a terceira nota");
			nota3 = ler.nextInt();
		
		
			notas = nota1*2 + nota2*3 + nota3*5;
			mediaPonderada = notas/10;
			
			System.out.println("A media ponderada é "+mediaPonderada);
			
		
	}
	
	
		
	
	

}
