package POO;

public class aviao {
	
	
	
	public String cor;
	public String quantidadeAssento;
	public String modeloAviao;
	
	public aviao (String c,String q,String m)
	{
		this.cor = c;
		this.quantidadeAssento = q;
		this.modeloAviao = m;
	}
	
	public String getinformacoesAviao()
	{
		String informacoesAviao = cor+" "+quantidadeAssento+" "+modeloAviao;
		return informacoesAviao;
	}
	
	
}
