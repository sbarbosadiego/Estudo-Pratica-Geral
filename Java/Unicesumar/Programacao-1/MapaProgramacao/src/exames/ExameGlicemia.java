package exames;

public class ExameGlicemia extends Exame {
    
    public double quantidadeGlicose;

    public ExameGlicemia(String nome, String tipoSangue, int anoNascimento, double quantidadeGlicose) {
        super(nome, tipoSangue, anoNascimento);
        this.quantidadeGlicose = quantidadeGlicose;
    }
    
    public String classificarResultado() {
        if (quantidadeGlicose < 100) {
            return "Normoglicemia";
        } else if (quantidadeGlicose >= 100 && quantidadeGlicose < 126) {
            return "Pré-diabetes";
        } else {
            return "Diabetes estabelecido";
        }
    }

    public void mostrarResultado() {
        String classificacao = classificarResultado();
        System.out.println("Glicemia: " + quantidadeGlicose + " mg/dL - " + classificacao);
    } 
    
        
}
