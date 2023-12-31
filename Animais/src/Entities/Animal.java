package Entities;
public class Animal {
	
	protected String animal; 
	
	protected double comprimento;
	
	protected int patas;
	
	protected String cor;
	
	protected String ambiente;
	
	protected double velocidade;

	public Animal() {
		super();
	}
	
	public Animal (String animal, double comprimento , String cor , String ambiente , double velocidade) {
		super();
		this.animal = animal;
		this.comprimento = comprimento;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velocidade = velocidade;
		this.patas=4;
	}
	
	public Animal (String animal, double comprimento , double velocidade) {
		super();
		this.animal = animal;
		this.comprimento = comprimento;
		this.velocidade = velocidade;
		this.patas=4;
	}
	
	public Animal (String animal, double comprimento , int patas, String cor , double velocidade) {
		super();
		this.animal = animal;
		this.comprimento = comprimento;
		this.patas = patas;
		this.cor = cor;
		this.velocidade = velocidade;
	}
	
	public Animal(String animal, double comprimento,int patas, String cor, String ambiente, double velocidade) {
		super();
		this.animal = animal;
		this.comprimento = comprimento;
		this.patas = patas;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velocidade = velocidade;
	}
	
	
	public String getAnimal() {
		return this.animal;
	}
	
	public void setAnimal(String animal) {
		this.animal = animal;
	}
	
	public double getComprimento() {
		return this.comprimento;
	}
	
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	
	public int getPatas() {
		return this.patas;
	}
	
	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	public String getCor() {
		return this.cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getAmbiente() {
		return this.ambiente;
	}
	
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	
	public double getVelocidade() {
		return this.velocidade;
	}
	
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	@Override
	public String toString() {
		
		return "\nAnimal: " + animal 
				+ "\nComprimento: " + comprimento + " cm"
				+ "\nPatas: " + patas
				+ "\nCor: " + cor
				+ "\nAmbiente: " + ambiente
				+ "\nVelocidade: " + velocidade + " m/s";
	}

}
