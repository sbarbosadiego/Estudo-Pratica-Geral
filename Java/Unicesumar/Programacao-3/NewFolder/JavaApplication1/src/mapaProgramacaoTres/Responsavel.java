package mapaProgramacaoTres;

public class Responsavel {
    
    private String nome;
    private String telefone;
    private int idade;
    
    public boolean validarIdadeResposavel(){
        return idade >= 18;
    }
    
    public String imprimirDadosResponsavel() {
        String mensagem = "Dados do Responsável\n"
                + "Nome: " + this.nome +"\n"
                + "Telefone: " + this.telefone +"\n"
                + "Idade: " + this.idade +"\n";
        return mensagem;
    }
    
    public void CadastrarResposavel(String nome, String telefone, int idade) {
        this.nome = nome;
        this.telefone = telefone;
        this.idade = idade;
    }
    
}
