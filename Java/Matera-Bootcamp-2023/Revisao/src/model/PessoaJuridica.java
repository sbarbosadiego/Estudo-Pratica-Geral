package model;

public class PessoaJuridica implements Pessoa {
	
	private String nomeFantasia;
	private String cnpj;
	
	public PessoaJuridica(String nomeFantasia, String cnpj) {
		this.setNomeFantasia(nomeFantasia);
		this.setCnpj(cnpj);
	}

	@Override
	public void andar() {
		System.out.println("Esse é meu patrão");
	}

	@Override
	public void dizerNome() {
		System.out.println(String.format("Nome Fantasia: %s | CNPJ: %s", 
				this.getNomeFantasia(), this.getCnpj()));
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
}
