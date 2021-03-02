package POO;

public class aviao_objeto {
	
	public static void main(String[] args) {
		
	
	System.out.println("Informações do avião:");
	System.out.println("Cor:         Quantidade de Assentos:        modelo: ");
	aviao aviao1 = new aviao("branco","                400","                 Boeing-737");
	aviao aviao2 = new aviao("preto","                 7  ","                 Embraer-E195");
	
	System.out.println(aviao1.getinformacoesAviao());
	System.out.println(aviao2.getinformacoesAviao());
	}
}
