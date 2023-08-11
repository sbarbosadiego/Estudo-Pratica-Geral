package exames;

public class ExameGlicemia extends Exame {
    
    public double quantidadeGlicose;

    public ExameGlicemia(String nome, String tipoSangue, int anoNascimento, double quantidadeGlicose) {
        super(nome, tipoSangue, anoNascimento);
        this.quantidadeGlicose = quantidadeGlicose;
    }
    
    /**
     * Método para retornar nível glicêmico.
     * @return String
     */
    public String classificarResultado() {
        if (this.quantidadeGlicose < 100) {
            return "Normoglicemia";
        } else if (this.quantidadeGlicose >= 100 && this.quantidadeGlicose < 126) {
            return "Pré-diabetes";
        } else {
            return "Diabetes estabelecido";
        }
    }

    public void mostrarResultado() {
        String classificacao = this.classificarResultado();
        System.out.println("Glicemia: " + this.quantidadeGlicose + " mg/dL - " + classificacao);
    } 
    
        
}
