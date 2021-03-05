package Abstrata;

public abstract class animal {
	
	private String TipoAnimal;
	
	public animal (String TipoAnimal)
	{
		this.TipoAnimal = TipoAnimal;
	}
	
	abstract public void nome(String nomeAnimal);
	abstract public void idade(int idadeAnimal);
	abstract public void som(String somAnimal);
	

	public String getTipoAnimal() {
		return TipoAnimal;
	}

	public void setTipoAnimal(String tipoAnimal) {
		TipoAnimal = tipoAnimal;
	}
	
	
	
}
