package Exercicio_Java;

import java.util.Scanner;

public class Exercicio_8 {
	public static void main(String[] args) {
		
		double custoFabrica, porcentagemDist, impostoApli, total;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o custo");
		custoFabrica = ler.nextDouble();
		
		porcentagemDist = 0.28*custoFabrica;
		impostoApli = 0.45*custoFabrica;
		
		
		System.out.println("O custo total é "+(custoFabrica+porcentagemDist+impostoApli));
		
	}

	

}
