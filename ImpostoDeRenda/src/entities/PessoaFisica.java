package entities;
import exceptions.RendaBrutaNegativeException;

public class PessoaFisica extends Contribuinte {
	private String cpf;
	
	public PessoaFisica(String nome, double rendaBruta, String cpf) throws RendaBrutaNegativeException {
		super(nome, rendaBruta);
		this.cpf=cpf;
	}
	
	public String getCPF() {
		return cpf;
	}
	
	public void setCPF(String cpf) {
		this.cpf = cpf;
	}
	
	public double calcImposto() throws RendaBrutaNegativeException  {
			if(getRendaBruta() < 0) {
				throw new RendaBrutaNegativeException();
			}
			 if(getRendaBruta()	>= 0 && getRendaBruta() <=	1400  ) {
				return 0;
			}else if(getRendaBruta() > 1400 && getRendaBruta() <= 2100){
				return getRendaBruta()*0.1 + 100;
			}else if(getRendaBruta() > 2100 && getRendaBruta() <= 2800) {
				return 0.15*getRendaBruta() + 270;
			}else if(getRendaBruta() >2800 && getRendaBruta() <= 3600) {
				return getRendaBruta()*0.25 + 500;
			}else{
				return getRendaBruta() *0.3 + 700;
			}
	}
	
	@Override
	public String toString()  {
		String s = super.toString();
		s += " ; CPF: " + cpf; 
		return s;
	}
}
