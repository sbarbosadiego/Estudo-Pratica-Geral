package mapaProgramacaoTres;

import javax.swing.JOptionPane;

public class Permanencia {
    
    private Crianca crianca;
    private int quantidadeMinutos;
    private double valorCobranca;
    
    public void cadastrarPermanencia() {
        String nomeResponsavel = JOptionPane.showInputDialog("Nome do Responsável");
        String telefoneResponsavel = JOptionPane.showInputDialog("Telefone do Responsável");
        int idadeResponsavel = Integer.parseInt(JOptionPane.showInputDialog("Idade do Responsável"));
        
        Responsavel responsavel = new Responsavel();
        responsavel.CadastrarResposavel(nomeResponsavel, telefoneResponsavel, idadeResponsavel);
        
        if(responsavel.validarIdadeResposavel()) {
            String nomeCrianca = JOptionPane.showInputDialog("Nome da Criança");
            int idadeCrianca = Integer.parseInt(JOptionPane.showInputDialog("Idade da Criança"));
            
            Crianca c = new Crianca();
            c.cadastrarCrianca(nomeCrianca, idadeCrianca, responsavel);
            this.crianca = c;
            
            if(c.validarIdadeCrianca()) {
                this.quantidadeMinutos = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Minutos de permanencia"));
                this.valorCobranca = quantidadeMinutos * 2;
            } else {
                JOptionPane.showMessageDialog(null, "Idade da criança excede o permitido");
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Não é possível continuar, responsável com idade inferior a permitida");
        }
        
    }
    
    public void mostrarDadosPermancencia() {
        String mensagem = crianca.imprimirDadosCrianca();
        mensagem += "Tempo de permanencia " + quantidadeMinutos + "\n";
        mensagem += "Valor cobrança " + valorCobranca;
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
}
