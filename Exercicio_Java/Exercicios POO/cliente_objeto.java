package POO;

public class cliente_objeto {
	
	public static void main(String[] args) {
		System.out.println("NOME       ENDEREÇO DE E-MAIL       CLASSE");
		cliente  cliente1 = new cliente("Naruto","    uzumakinaruto@konohacom","     vip  ");
		System.out.println(cliente1.getinformacoesCliente());
		cliente1.setPrimeiroNome();
		System.out.println(cliente1.getinformacoesCliente());
		cliente1.setEnderecoEmail();
		System.out.println(cliente1.getinformacoesCliente());
		cliente1.setClasseCliente();
		
		System.out.println(cliente1.getinformacoesCliente());
	}   

}
