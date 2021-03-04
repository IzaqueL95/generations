package Pessoa_Projeto;



public class Pessoa {
	
	private String nome1;
	private int idade1;
	private String telefone1;
	private String nome;
	private int idade;
	private String telefone;
	private int suadoenca;
	private String usaMedicamentos;
	private int nivelSedentarismo;
	
	
	
	public Pessoa (String nome, int idade, String telefone, int suadoenca)
	{
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
		this.suadoenca = suadoenca;
		
				
	}
	
	public Pessoa (String nome1, int idade1, String telefone1)
	{
		this.nome = nome1;
		this.idade = idade1;
		this.telefone = telefone1;
	}
	
	
	


	public String getNome1() {
		return nome1;
	}

	public void setNome1(String nome1) {
		this.nome1 = nome1;
	}

	public int getIdade1() {
		return idade1;
	}

	public void setIdade1(int idade1) {
		this.idade1 = idade1;
	}

	public String getTelefone1() {
		return telefone1;
	}

	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}

	public int getSuadoenca() {
		return suadoenca;
	}

	public void setSuadoenca(int suadoenca) {
		this.suadoenca = suadoenca;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public int getsuadoenca() {
		return suadoenca;
	}

	public void setsuadoenca(int suadoenca) {
		this.suadoenca = suadoenca;
	}

	public String getUsaMedicamentos() {
		return usaMedicamentos;
	}

	public void setUsaMedicamentos(String usaMedicamentos) {
		this.usaMedicamentos = usaMedicamentos;
	}

	public int getNivelSedentarismo() {
		return nivelSedentarismo;
		
		}

	public void setNivelSedentarismo(int nivelSedentarismo) {
		
		this.nivelSedentarismo = nivelSedentarismo;
		
		
		}
	
		public void sedentarismo()
		{ 
			if(this.getNivelSedentarismo() >=1 && this.getNivelSedentarismo() <2 )
			{
				System.out.println("Seu nivel de sedentarismo está muito alto, que tal fazer mais exercicios ?");
			}
			if(this.getNivelSedentarismo() >=3 && this.getNivelSedentarismo() <4)
			{
				System.out.println("Esse é um bom caminho para se manter saudável");
			}
			if(this.getNivelSedentarismo() >=5 && this.getNivelSedentarismo() <=6 )
			{
				System.out.println("Você não é sedentário, 3x na semana é um ótimo caminho");
			}
			
		}
		
				
	}
	


