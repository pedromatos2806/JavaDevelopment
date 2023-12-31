package Entities;

public class Peixe extends Animal{
	
	private String barbatanas;
	
	private String cauda;
	
	public Peixe() {
		super();
	}
	
	public Peixe (String animal, double comprimento  , double velocidade, String barbatanas, String cauda) {
		super( animal, comprimento ,velocidade);
		this.patas = 0;
		this.ambiente = "Mar";
		this.barbatanas=barbatanas;
		this.cauda = cauda;
		this.cor="Cinzento";
	}
	
	public Peixe (String animal, double comprimento , String cor , String ambiente , double velocidade, String barbatanas, String cauda) {
		super(animal,comprimento ,cor,ambiente, velocidade);
		this.patas = 0;
		this.barbatanas=barbatanas;
		this.cauda = cauda;
	}
	
	public String getBarbatanas() {
		return this.barbatanas;
	}
	
	public void setBarbatanas(String barbatanas) {
		this.barbatanas = barbatanas;
	}
	
	public String cauda() {
		return this.cauda;
	}
	
	public void setCauda(String cauda) {
		this.cauda = cauda;
	}
	
	@Override
	public String toString() {
		String s = super.toString();
		return s 
			+ "\nCaracterista: " 
			+ barbatanas 
			+" e "
			+ cauda;
	}
}
