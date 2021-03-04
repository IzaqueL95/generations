package POO;

public class fornecedor extends Pessoa {
	private float valorCredito;
	private float valorDivida;
	
	public fornecedor(String nome, String endereco, int numeroTelefone, float valorCredito,float valorDivida)
	{
		super(nome,endereco,numeroTelefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}

	public float getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(float valorCredito) {
		this.valorCredito = valorCredito;
	}

	public float getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(float valorDivida) {
		this.valorDivida = valorDivida;
	}
	public float obterSaldo()
	{
		return this.valorCredito - this.valorDivida;
	}
	

}
