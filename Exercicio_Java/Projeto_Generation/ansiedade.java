package Pessoa_Projeto;


	public class ansiedade extends Pessoa {

		
		
		private int niveldeagitacao;
		private int niveldotranstornosdeansiedade;

		
		public int getNiveldeagitacao() {
			return niveldeagitacao;
		}

		public void setNiveldeagitacao(int niveldeagitacao) {
			this.niveldeagitacao = niveldeagitacao;
		}

		public int getNiveldotranstornosdeansiedade() {
			return niveldotranstornosdeansiedade;
		}

		public void setNiveldotranstornosdeansiedade(int niveldotranstornosdeansiedade) {
			this.niveldotranstornosdeansiedade = niveldotranstornosdeansiedade;
		}

		public ansiedade(String nome, int idade, String telefone, int suadoenca,int niveldeagitacao, int niveldotranstornosdeansiedade) 
		{
			super(nome,idade,telefone,suadoenca);
			this.niveldeagitacao = niveldeagitacao;
			this.niveldotranstornosdeansiedade = niveldotranstornosdeansiedade;

		}

		public  void Transtornosintensos() {
			
			if (this.getNiveldeagitacao() == 2 && this.getNiveldotranstornosdeansiedade() == 2) {
				System.out.println("\n procure a ajuda de um Psiquiatra");
				System.out.println(
						"\n o seu caso e serio e somente com a ajuda de profissionais da area para te ajudar em seu problema especifico. ");
			}
			if (this.getNiveldeagitacao() == 1 && this.getNiveldotranstornosdeansiedade() == 2) {
				System.out.println("\n procure a ajuda de um Psicologo e pratique meditacao");
				System.out.println(
						"\n Um pouco de ajuda sempre e necessario, procure formas de conter suas crises atraves de meditacao e um psicologo pode te ajudar a entender um pouco mais de seus problemas. ");
			}
			if (this.getNiveldeagitacao() == 1 && this.getNiveldotranstornosdeansiedade() == 1) {
				System.out.println("\n Parabens vc e uma pessoa pouca ansiosa");
				System.out.println(
						"\n A vida 'e um grande vai e vem, e nosso foco 'e ajudar a te manter a saude mental. Praticar exercicio para corpo e mente pode ser uma otima forma para te ajudar a enfrentar futuros problemas.");
			}
			if (this.getNiveldeagitacao() == 2 && this.getNiveldotranstornosdeansiedade() == 1) {
				System.out.println("\n procure a ajuda de um Psicologo e pratique meditacao");
				System.out.println(
						"\n Um pouco de ajuda sempre e necessario, procure formas de conter suas crises atraves de meditacao e um psicologo pode te ajudar a entender um pouco mais de seus problemas. ");
		}
		}
		
	}

	
