package Pessoa_Projeto;

public class CriseDePanico extends Pessoa {
	
	private int doresnopeito;
	private int faltadear;
	private int sensacaodemorte;
	private int verify;
	
	
	public CriseDePanico(String nome1, int idade1, String telefone1,int doresnopeito, int faltadear,  int sensacaodemorte,int verify)
	{
		super(nome1,idade1,telefone1);
		this.doresnopeito =  doresnopeito;
		this.faltadear = faltadear;
		this.sensacaodemorte = sensacaodemorte;
		this.verify = verify;
	}
	
	public CriseDePanico(String nome, int idade, String telefone,int doresnopeito, int faltadear,  int sensacaodemorte)
	{
		super(nome,idade,telefone);
		this.doresnopeito =  doresnopeito;
		this.faltadear = faltadear;
		this.sensacaodemorte = sensacaodemorte;
		
	}
	
	
	
	
	public int GetDoresnopeito() {
	
		return doresnopeito;
	}


	public void setDoresnopeito(int doresnopeito) {
		this.doresnopeito = doresnopeito;
	}


	public int GetFaltadear() {
		return faltadear;
	}


	public void setFaltadear(int faltadear) {
		this.faltadear = faltadear;
	}


	public int GetSensacaodemorte() {
		return sensacaodemorte;
	}


	public void setSensacaodemorte(int sensacaodemorte) {
		this.sensacaodemorte = sensacaodemorte;
	}


	public int getVerify() {
		int num = (int) ((int) 1 + (Math.random() * 100)); 
		
		if(this.doresnopeito==2 && this.sensacaodemorte==1 && this.faltadear==2)
		{
			System.out.println("Procure um médico especifico");
			System.out.println("Agende agora no número: (11) 7857-6587");
		}	
		if(this.doresnopeito==1 && this.sensacaodemorte==1 && this.faltadear==1)
		{
			System.out.println("Você tem Crise de panico");
			System.out.println("Procure uma orientação de um psiquatra e para começar o tratamento");
			System.out.println("Agende agora no número: (11) 4527-1347");
		}
		if(this.doresnopeito==2 && this.sensacaodemorte==2 && this.faltadear==1)
		{	
			
			System.out.println("Obtendo IP...\nObtendo seu endereço...");
			System.out.println("Rua."+num);
			System.out.println("Discando 193...");
			System.out.println("Ambulância em caminho! ");
			
		}
		
		
		if(this.doresnopeito==1 && this.sensacaodemorte==2 && this.faltadear==2)
		{
			System.out.println("Procure um médico especifico em urgência");
			System.out.println("Agende agora no número: (11) 8956-3256");
		}
		if(this.doresnopeito==2 && this.sensacaodemorte==2 && this.faltadear==2)
		{
			System.out.println("Vocé não tem nenhum diagnóstico");
			System.out.println("Cuide de sua saude, praticando exercicios como meditar!");
		}
		return verify;
		
	}


	public void setVerify(int verify) {
		this.verify = verify;
	}

}