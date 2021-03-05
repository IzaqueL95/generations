package Abstrata;

public class Cavalo extends animal {
	
	public Cavalo()
	{
		super("Cavalo");
	}
	
	@Override
	public void nome(String nomeAnimal)
	{
		System.out.println("O nome do cavalo é "+nomeAnimal);
	}
	
	@Override
	public void idade(int idadeAnimal)
	{
		System.out.println("A idade do cavalo é: "+idadeAnimal);
	}
	
	@Override
	public void som (String somAnimal)
	{
		System.out.println("O som do cavalo é"+somAnimal);
	}
	
	
	public void caracteristica()
	{
		System.out.println("O cavalo costuma correr");
	}

}
