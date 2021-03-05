package Abstrata;

public class Cachorro extends animal {
	
	public Cachorro() 
	{
		super("cachorro");
	}
	
	@Override
	public void nome(String nomeAnimal)
	{
		System.out.println("O nome do cachorro é "+nomeAnimal);
	}
	
	@Override
	public void idade(int idadeAnimal)
	{
		System.out.println("A idade do cachorro é: "+idadeAnimal);
	}
	
	@Override
	public void som (String somAnimal)
	{
		System.out.println("O som do cachorro é"+somAnimal);
	}
	
	public void caracteristica () {
		System.out.println("Uma das caracteristicas do cachorro é correr!");
	}


}
