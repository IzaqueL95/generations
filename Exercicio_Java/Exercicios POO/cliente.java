package POO;

import java.util.Scanner;

public class cliente {
	private String primeiroNome;
	private String enderecoEmail;
	private String classeCliente;
	
	Scanner ler = new Scanner(System.in);
	
	public cliente (String primeiroNome,String enderecoEmail,String classeCliente)
	{
		this.primeiroNome = primeiroNome;
		this.enderecoEmail = enderecoEmail;
		
		this.classeCliente = classeCliente;
	}
	
	public String getinformacoesCliente()
	{
		String informacoesCliente = primeiroNome+" "+enderecoEmail+" "+classeCliente;
		return informacoesCliente;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome() {
		System.out.println("Digite o novo nome");
		this.primeiroNome = ler.nextLine();
	}

	public String getEnderecoEmail() {
		return primeiroNome;
	}

	public void setEnderecoEmail() {
		System.out.println("Digite o novo email");
		this.enderecoEmail = ler.nextLine();
	}
		

	public String getClasseCliente() {
		return classeCliente;
	}

	public void setClasseCliente() {
		System.out.println("Digite a nova classe");
		this.classeCliente = ler.nextLine();
	}
	
	


	

}
