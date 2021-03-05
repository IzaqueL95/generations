package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class estoque_collection {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int op��o;
		
		Collection <String> lista = new ArrayList();
		
		do
		{
			System.out.println("O que deseja fazer no estoque ? \n [1] adicionar  [2] remover [3] atualizar [4] mostrar todos");
		op��o = ler.nextInt();
		switch(op��o)
		{
		case 1:
			ler.nextLine();
			System.out.println("Digite o produto que deseja adicionar: ");
			String produto = ler.nextLine();
			lista.add(produto);
			break;
		case 2:
			ler.nextLine();
			System.out.println("Qual produto deseja remover?");
			String produtoRemove = ler.nextLine();
			if(lista.contains(produtoRemove))
			{
				lista.remove(produtoRemove);
			}
			else
			{
				System.out.println("O produto que voc� digitou n�o existe em estoque.");
			}
		case 3:
			ler.nextLine();
			System.out.println("Qual produto voc� deseja atualizar? ");
			String produtoAtualiza = ler.nextLine();
			
			System.out.println("Qual o produto ira entrar no lugar do produto "+produtoAtualiza+" ?");
			String produtoNovo = ler.nextLine();
			if(lista.contains(produtoAtualiza))
			{
				lista.remove(produtoAtualiza);
				lista.add(produtoNovo);
			}
			else
			{
				System.out.println("O produto n�o existe.");
			}
			System.out.println(lista);
			break;
		case 4:
			System.out.println("Lista dos produtos do estoque \n ");
			System.out.println(lista);
			break;
			default:
			System.out.println("Fim");
		}
		
		}while(op��o!=0);
		
		
		
	}

}