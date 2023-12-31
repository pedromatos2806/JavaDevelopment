package Entities;

public class Mamifero extends Animal{
	
	private String alimento;
	
	public Mamifero() {
		super();
	}
	
	public Mamifero(String animal, double comprimento,int patas, String cor, double velocidade,String alimento) {
		super(animal,comprimento,patas,cor,velocidade);
		this.ambiente = "Terra";
		this.alimento=alimento;
	}
	
	public String getAlimento() {
		return this.alimento;
	}
	
	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	@Override
	public String toString() {
		String s = super.toString();
		return s
			+"\nAlimento: " + alimento;
	}
}