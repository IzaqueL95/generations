package POO;

public class testaFornecedor {
	
	public static void main(String[] args) {
		
		fornecedor fornecedor1 = new fornecedor("Amazon","Av maria lima, 185", 0, 0, 0);
		
	
		
		fornecedor1.setNumeroTelefone(38267000);
		fornecedor1.setValorCredito(1000);
		fornecedor1.setValorDivida(400);
		
		
		System.out.println(fornecedor1.getNome());
		System.out.println(fornecedor1.getEndereco());
		System.out.println("Telefone: "+fornecedor1.getNumeroTelefone());
		System.out.println("Valor de credito: "+fornecedor1.getValorCredito());
		System.out.println("Valor da divida: "+fornecedor1.getValorDivida());
		System.out.println("Saldo atual :"+fornecedor1.obterSaldo());
		
	}

}
