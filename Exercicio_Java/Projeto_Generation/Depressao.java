package Pessoa_Projeto;

public class Depressao extends Pessoa{
	
	private int ideaisSuicidas;
	private int tristezaConstante;
	
	
	public Depressao(String nome, int idade, String telefone, int suadoenca, int ideaisSuicidas,
			int tristezaConstante) {
		super(nome, idade, telefone, suadoenca);
		this.ideaisSuicidas = ideaisSuicidas;
		this.tristezaConstante = tristezaConstante;
	}
	
	public int getIdeaisSuicidas() {
		return ideaisSuicidas;
	}


	public void setIdeaisSuicidas(int ideaisSuicidas) {
		this.ideaisSuicidas = ideaisSuicidas;
	}


	public int getTristezaConstante() {
		return tristezaConstante;
	}


	public void setTristezaConstante(int tristezaConstante) {
		this.tristezaConstante = tristezaConstante;
	}
	
	public void riscoVida() {

		if (this.getIdeaisSuicidas() == 1 && this.getTristezaConstante() == 1) {
			System.out.println(
					"\nSe você teve pensamentos suícidas procure alguém imediatamente, como um médico, um amigo, alguém que você confie. ");
			System.out.println("\nProcure por ajuda - Centro de Valorização da Vida ");
			System.out.println("Disponível 24 horas por telefone e no seguinte horário por chat: ");
			System.out.println("Dom - 17h à 01h");
			System.out.println("Seg a Qui - 09h à 01h");
			System.out.println("Sex - 15h às 23h");
			System.out.println("Sáb - 16h à 01h");
		}

		if (this.getIdeaisSuicidas() == 1 && this.getTristezaConstante() == 2) {
			System.out.println(
					"\nSe você teve pensamentos suícidas procure alguém imediatamente, como um médico, um amigo, alguém que você confie. ");
			System.out.println("\nCentro de Valorização da Vida ");
			System.out.println("Disponível 24 horas por telefone e no seguinte horário por chat: ");
			System.out.println("Dom - 17h à 01h");
			System.out.println("Seg a Qui - 09h à 01h");
			System.out.println("Sex - 15h às 23h");
			System.out.println("Sáb - 16h à 01h");
		}

		if (this.getIdeaisSuicidas() == 1 && this.getTristezaConstante() == 3) {
			System.out.println(
					"\nSe você teve pensamentos suícidas procure alguém imediatamente, como um médico, um amigo, alguém que você confie. ");
			System.out.println("\nCentro de Valorização da Vida ");
			System.out.println("Disponível 24 horas por telefone e no seguinte horário por chat: ");
			System.out.println("Dom - 17h à 01h");
			System.out.println("Seg a Qui - 09h à 01h");
			System.out.println("Sex - 15h às 23h");
			System.out.println("Sáb - 16h à 01h");
		}

		if (this.getIdeaisSuicidas() == 2 && this.getTristezaConstante() == 1) {
			System.out.println(
					"\nVocê pode ter algum nível de depresão, converse com alguém de sua confiança, e \nProcure por ajuda médica para um diagnóstico mais preciso.");
		}

		if (this.getIdeaisSuicidas() == 2 && this.getTristezaConstante() == 2) {
			System.out.println(
					"\nVocê pode estar como uma tristeza passageira, \nRespire fundo que tudo isso vai passar. "
							+ "\nCaso os sintomas permanecem, procure por ajuda médica para um diagnóstico mais preciso.");
		}
		if (this.getIdeaisSuicidas() == 2 && this.getTristezaConstante() == 3) {
			System.out.println(
					"\nVocê pode ter uma forma leve de depressão. Procure por ajuda médica para um diagnóstico mais preciso.");
		}

		if (this.getIdeaisSuicidas() == 3 && this.getTristezaConstante() == 1) {
			System.out.println(
					"\nSe você teve pensamentos suícidas procure alguém imediatamente, como um médico, um amigo, alguém que você confie. ");
			System.out.println("\nCentro de Valorização da Vida ");
			System.out.println("Disponível 24 horas por telefone e no seguinte horário por chat: ");
			System.out.println("Dom - 17h à 01h");
			System.out.println("Seg a Qui - 09h à 01h");
			System.out.println("Sex - 15h às 23h");
			System.out.println("Sáb - 16h à 01h");
		}

		if (this.getIdeaisSuicidas() == 3 && this.getTristezaConstante() == 2) {
			System.out.println(
					"\nSe você teve pensamentos suícidas recentemente procure alguém, como um médico, um amigo, alguém que você confie. ");
			System.out.println("\nCentro de Valorização da Vida ");
			System.out.println("Disponível 24 horas por telefone e no seguinte horário por chat: ");
			System.out.println("Dom - 17h à 01h");
			System.out.println("Seg a Qui - 09h à 01h");
			System.out.println("Sex - 15h às 23h");
			System.out.println("Sáb - 16h à 01h");
		}

		if (this.getIdeaisSuicidas() == 3 && this.getTristezaConstante() == 3) {
			System.out.println(
					"\nSe você teve pensamentos suícidas procure alguém imediatamente, como um médico, um amigo, alguém que você confie. ");
			System.out.println("\nCentro de Valorização da Vida ");
			System.out.println("Disponível 24 horas por telefone e no seguinte horário por chat: ");
			System.out.println("Dom - 17h à 01h");
			System.out.println("Seg a Qui - 09h à 01h");
			System.out.println("Sex - 15h às 23h");
			System.out.println("Sáb - 16h à 01h");
		}
	
	
	

	}
	
}

