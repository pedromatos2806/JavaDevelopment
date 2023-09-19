package entities;

import exceptions.RendaBrutaNegativeException;

public class PessoaJuridica extends Contribuinte {
	
	private String cnpj;
	
	public PessoaJuridica(String nome , double rendaBruta, String cnpj) throws RendaBrutaNegativeException {
		super(nome,rendaBruta);	
		this.cnpj=cnpj;
	}
	
	public String getCNPJ() {
		return cnpj;
	}
	
	public void setCNPF(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public double calcImposto() {
			return 0.1*this.getRendaBruta();
	}
		
	
	@Override
	public String toString()  {
		String s = super.toString();
		s += " ; Imposto é de :" + calcImposto();
		return s;
	}
}
