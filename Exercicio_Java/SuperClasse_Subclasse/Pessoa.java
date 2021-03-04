package POO;

public class Pessoa {
	
	private String nome; 
	private String endereco;
	private int numeroTelefone;
	
	public Pessoa (String nome, String endereco, int numeroTelefone)
	{
		this.nome = nome;
		this.endereco = endereco;
		this.numeroTelefone = numeroTelefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getNumeroTelefone() {
		return numeroTelefone;
	}

	public void setNumeroTelefone(int numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}
	
	

}
