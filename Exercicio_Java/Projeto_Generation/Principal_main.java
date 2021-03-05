package Pessoa_Projeto;

import java.util.Scanner;

public class Principal_main {

	public static void main(String[] args) {
		try (Scanner leia = new Scanner(System.in)) {
			ansiedade ansiedade = new ansiedade(null, 0, null, 0, 0, 0);
			int idade1 = 0, doresnopeito = 0, sensacaodemorte = 0, faltadear = 0;
			String nome1 = null, telefone1 = null;

			System.out.println("digite a sua doenca: 1- depressao / 2-ansiedade / 3-crise de panico / 4-teste de sanidade mental");
			int suadoenca = leia.nextInt();
			
			insanidadeMental insanidade = new insanidadeMental(null, 0, null, 0, 0, 0);
			Depressao depressao = new Depressao(null, 0, null, 0, 0, 0);
			int ideaisSuicidas, tristezaConstante;
			
			depressao.setsuadoenca(suadoenca);
			if (depressao.getsuadoenca() == 1) {
				
				System.out.println("digite seu nome: ");
				String nome = leia.next();
				depressao.setNome(nome);

				System.out.println("digite a sua idade: ");
				idade1 = leia.nextInt();
				depressao.setIdade(idade1);

				System.out.println("digite o seu telefone: ");
				String telefone = leia.next();
				depressao.setTelefone(telefone);

				System.out.print("Você tem Ideais Suicídas: | 1 - Sim | 2- Não | 3 - As vezes |: ");
				ideaisSuicidas = leia.nextInt();
				depressao.setIdeaisSuicidas(ideaisSuicidas);

				while (ideaisSuicidas < 1 || ideaisSuicidas > 3) {
					System.out.println("Dado Inválido, digite novamente:");
					System.out.print("Você tem Ideais Suicídas: | 1 - Sim | 2- Não | 3 - As vezes |: ");
					ideaisSuicidas = leia.nextInt();
					depressao.setIdeaisSuicidas(ideaisSuicidas);
				}

				System.out.print(
						"\nVocê sente-se triste de maneira constante e sem causa aparente: | 1 - Sim | 2- Não | 3- As vezes |: ");
				tristezaConstante = leia.nextInt();
				depressao.setTristezaConstante(tristezaConstante);

				while (tristezaConstante < 1 || tristezaConstante > 3) {
					System.out.println("Dado Inválido, digite novamente:");
					System.out.print(
							"\nVocê sente-se triste de maneira constante e sem causa aparente: | 1 - Sim | 2- Não | 3- As vezes |: ");
					tristezaConstante = leia.nextInt();
					depressao.setTristezaConstante(tristezaConstante);
				}

				depressao.riscoVida();
			}
			
			ansiedade.setsuadoenca(suadoenca);
			if (ansiedade.getsuadoenca() == 2) {
				

				System.out.println("digite seu nome: ");
				String nome = leia.next();
				ansiedade.setNome(nome);

				System.out.println("digite a sua idade: ");
				idade1 = leia.nextInt();
				ansiedade.setIdade(idade1);

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

			if (suadoenca == 3) {

				System.out.println("digite seu nome: ");
				nome1 = leia.next();

				System.out.println("digite a sua idade: ");
				idade1 = leia.nextInt();

				System.out.println("digite o seu telefone: ");
				telefone1 = leia.next();

				System.out.println("Responda as perguntas!\n1--Para sim\n2--para não");
				do {
					System.out.println("Você tem dores no peito?");
					doresnopeito = leia.nextInt();
				} while (doresnopeito < 1 || doresnopeito > 2);
				do {
					System.out.println("Você tem sensação de morte?");
					sensacaodemorte = leia.nextInt();
				} while (sensacaodemorte < 1 || sensacaodemorte > 2);

				do {
					System.out.println("Você tem falta de ar? ");
					faltadear = leia.nextInt();
				} while (faltadear < 1 || faltadear > 2);

				CriseDePanico crisedepanico = new CriseDePanico(nome1, idade1, telefone1, doresnopeito, sensacaodemorte,
						faltadear);

				crisedepanico.getVerify();

			}
			
			insanidade.setsuadoenca(suadoenca);
			if (insanidade.getsuadoenca() == 4) {
				

				System.out.println("digite seu nome: ");
				String nome = leia.next();
				insanidade.setNome(nome);

				System.out.println("digite a sua idade: ");
				idade1 = leia.nextInt();
				insanidade.setIdade(idade1);

				System.out.println("digite o seu telefone: ");
				String telefone = leia.next();
				insanidade.setTelefone(telefone);

				System.out.println("De acordo com seus pensamentos você é    1-UM NADA   || 2-UMA PESSOA COMUM   || 3-UMA PESSOA QUE NAO QUERIA NASCER");
				int pensamentos = leia.nextInt();
				insanidade.setPensamento(pensamentos);
				System.out.println("Qual dessas coisas você acha normal? 1-ODIAR PESSOAS  || 2-AMAR AS PESSOAS    || 3-MANIPULAR AS PESSOAS");
				int qualDasCoisas = leia.nextInt();
				insanidade.setQualDasCoisas(qualDasCoisas);

				insanidade.diagnostico();
			}
		}
		
		

	}

}