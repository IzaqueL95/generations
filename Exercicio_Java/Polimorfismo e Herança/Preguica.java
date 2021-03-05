package Abstrata;

public class Preguica extends animal{
	
	public Preguica()
	{
		super("Preguica");
	}
	
	@Override
	public void nome(String nomeAnimal)
	{
		System.out.println("O nome da preguica é "+nomeAnimal);
	}
	
	@Override
	public void idade(int idadeAnimal)
	{
		System.out.println("A idade da preguica : "+idadeAnimal);
	}
	
	@Override
	public void som (String somAnimal)
	{
		System.out.println("O som da preguica é "+somAnimal);
	}
	
	
	public void caracteristica()
	{
		System.out.println("A preguica costuma subir em arvores");
	}

}
