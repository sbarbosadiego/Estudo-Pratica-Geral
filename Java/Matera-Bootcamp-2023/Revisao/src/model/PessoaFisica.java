package model;

public class PessoaFisica implements Pessoa {
	
	
	private String nome;
	private String sobrenome;
	
	public PessoaFisica(String nome, String sobrenome) {
		this.setNome(nome);
		this.setSobrenome(sobrenome);
	}

	@Override
	public void andar() {
		System.out.println("Aoooo");
	}

	@Override
	public void dizerNome() {
		System.out.println(String.format("Meu nome é %s %s", 
				this.getNome(), this.getSobrenome()));
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	
}
