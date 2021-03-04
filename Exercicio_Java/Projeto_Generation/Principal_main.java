package Pessoa_Projeto;

import java.util.Scanner;

public class Principal_main {

	public static void main(String[] args) {

		
		Scanner leia = new Scanner(System.in);
        ansiedade ansiedade = new ansiedade(null, 0, null, 0, 0, 0);
        int  idade1 = 0, doresnopeito = 0, sensacaodemorte = 0,faltadear = 0;
        String nome1 = null, telefone1 = null;
        
        
        
        System.out.println("digite a sua doenca: 1- depressao / 2-ansiedade / 3-crise de panico");
        int suadoenca = leia.nextInt();
        ansiedade.setsuadoenca(suadoenca);
        
        if( ansiedade.getsuadoenca() ==2) {

		System.out.println("digite seu nome: ");
		String nome = leia.next();
		ansiedade.setNome(nome);

		System.out.println("digite a sua idade: ");
		int idade = leia.nextInt();
		ansiedade.setIdade(idade);

		System.out.println("digite o seu telefone: ");
		String telefone = leia.next();
		ansiedade.setTelefone(telefone);


		System.out.println("digite o seu nivel de agitacao: 1-pouco agitado / 2-agitado ");
		int niveldeagitacao = leia.nextInt();
		ansiedade.setNiveldeagitacao(niveldeagitacao);

		System.out.println("digite o seu nivel de transtorno de ansiedade: 1- pouco ansioso / 2-controlavel ");
		int niveldotranstornosdeansiedade = leia.nextInt();
		ansiedade.setNiveldotranstornosdeansiedade(niveldotranstornosdeansiedade);
		
		ansiedade.Transtornosintensos();
	
	
	}
        
        
        
        if(suadoenca ==3 ) {
        	
    		System.out.println("digite seu nome: ");
    		nome1 = leia.next();
    		

    		System.out.println("digite a sua idade: ");
    		idade1 = leia.nextInt();
    		

    		System.out.println("digite o seu telefone: ");
    		telefone1 = leia.next();
    		
    		
    		System.out.println("Responda as perguntas!\n1--Para sim\n2--para não");
			do
			{
			System.out.println("Você tem dores no peito?");
			doresnopeito=leia.nextInt();
			}while(doresnopeito <1 || doresnopeito>2);
			do
			{
			System.out.println("Você tem sensação de morte?");
			sensacaodemorte=leia.nextInt();
			}while(sensacaodemorte<1 || sensacaodemorte>2);
			
			do
			{
			System.out.println("Você tem falta de ar? ");
			faltadear=leia.nextInt();
			}while(faltadear<1 || faltadear>2);
			
			CriseDePanico crisedepanico = new CriseDePanico(nome1, idade1, telefone1, doresnopeito, sensacaodemorte,faltadear);
			
			crisedepanico.getVerify();
			
	
         }
	}
	}