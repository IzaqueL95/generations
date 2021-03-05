package Abstrata;

import java.util.Scanner;

public class Testa_Animal {
	
	public static void main(String[] args) {
		
	
	
	Scanner ler = new Scanner(System.in);
	
	Cachorro cachorro = new Cachorro();
	Cavalo cavalo = new Cavalo();
	Preguica preguica = new Preguica();
	
	animal animal = null;
	int x=0;
	
	do
		
	{
		System.out.println("Qual o tipo de animal? 1-Cachorro     2-Cavalo      3-Preguica ");
		x = ler.nextInt();
		
		if (x==1) 
		{
			animal = cachorro;
			
			System.out.println("Qual o nome do seu cachorro ?");
			String nome = ler.next();
			
			System.out.println("Quantos anos o cachorro tem ?");
			int idade = ler.nextInt();
			
			System.out.println("Qual é o som do cachorro?");
			String som = ler.next();
			
			cachorro.nome(nome);
			cachorro.idade(idade);
			cachorro.som(som);
			cachorro.caracteristica();;
			

		}
		
		else if(x==2)
		{
			animal = cavalo;
			System.out.println("Qual o nome do seu cavalo ?");
			String nome = ler.next();
			
			System.out.println("Quantos anos o cavalo tem ?");
			int idade = ler.nextInt();
			
			System.out.println("Qual é o som do cavalo ?");
			String som = ler.next();
			
			cavalo.nome(nome);
			cavalo.idade(idade);
			cavalo.som(som);
			cavalo.caracteristica();
		}
		else if(x==3)
		{
			animal = preguica;
			System.out.println("Qual o nome da sua Preguica ?");
			String nome = ler.next();
			
			System.out.println("Quantos anos a sua Preguica tem ?");
			int idade = ler.nextInt();
			
			System.out.println("Qual é o som da sua Preguica ?");
			String som = ler.next();
			
			preguica.nome(nome);
			preguica.idade(idade);
			preguica.som(som);
			preguica.caracteristica();

			
		} else
		{
			System.out.println("Erro na digitação");
		}
		
	}while(x<=0 || x>=4);
	

}
}
