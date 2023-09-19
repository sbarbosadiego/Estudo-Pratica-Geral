import model.PessoaFisica;
import model.PessoaJuridica;

public class Main {

	public static void main(String[] args) {
		
		PessoaFisica pessoa = new PessoaFisica("Udyr", "da Silva");
		PessoaJuridica juridica = new PessoaJuridica("Pinta Rodapé", "23.432.234/0001-23");
		
		pessoa.andar();
		pessoa.dizerNome();
		
		juridica.andar();
		juridica.dizerNome();
	}

}
