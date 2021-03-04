package Pessoa_Projeto;

public class Pessoa {
	
	private String nome;
	private String idade;
	private String telefone;
	private String usaMedicamentos;
	private float nivelSedentarismo;
	
	public Pessoa (String nome, String idde, String telefone, String usaMedicamentos, float nivelSedemtarismo)
	{
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
		this.usaMedicamentos = usaMedicamentos;
		this.nivelSedentarismo = nivelSedentarismo;
				
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getUsaMedicamentos() {
		return usaMedicamentos;
	}

	public void setUsaMedicamentos(String usaMedicamentos) {
		this.usaMedicamentos = usaMedicamentos;
	}

	public float getNivelSedentarismo() {
		return nivelSedentarismo;
		
		}

	public void setNivelSedentarismo(float nivelSedentarismo) {
		
		this.nivelSedentarismo = nivelSedentarismo;
		}
	
			
		
				
	}
	


