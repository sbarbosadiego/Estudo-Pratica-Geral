package mapaProgramacaoTres;

public class Crianca {
    
    private String nome;
    private int idade;
    private Responsavel resposavel;
    
    public boolean validarIdadeCrianca() {
        return idade <= 10;
    }
    
    public String imprimirDadosCrianca() {
        String mensagem = "Dados do Criança\n"
                + "Nome: " + this.nome +"\n"
                + "Idade: " + this.idade +"\n"
                + this.resposavel.imprimirDadosResponsavel() +"\n";
        return mensagem;
    }
    
    public void cadastrarCrianca(String nome, int idade, Responsavel responsavel) {
        this.nome = nome;
        this.idade = idade;
        this.resposavel = responsavel;
    }
    
}
