package exames;

public class ExameColesterol extends Exame {
    
    public double quantidadeLDL;
    public double quantidadeHDL;
    public char riscoPaciente;

    public ExameColesterol(String nome, String tipoSanguineo, int anoNascimento, double quantidadeLDL, double quantidadeHDL, char riscoPaciente) {
        super(nome, tipoSanguineo, anoNascimento);
        this.quantidadeLDL = quantidadeLDL;
        this.quantidadeHDL = quantidadeHDL;
        this.riscoPaciente = riscoPaciente;
    }
    
    /**
     * Método para retornar HDL e LDL.
     * @return String
     */
    public String classificarResultado() {
        String hdlClassificacao = "";
        if (this.anoNascimento >= 20) {
            hdlClassificacao = (this.quantidadeHDL > 40) ? "HDL - BOM" : "HDL - BAIXO";
        } else {
            hdlClassificacao = (this.quantidadeHDL > 45) ? "HDL - BOM" : "HDL - BAIXO";
        }

        String ldlClassificacao = "";
        if (this.riscoPaciente == 'B') {
            ldlClassificacao = (this.quantidadeLDL < 100) ? "LDL - BOM" : "LDL - ALTO";
        } else if (this.riscoPaciente == 'M') {
            ldlClassificacao = (this.quantidadeLDL < 70) ? "LDL - BOM" : "LDL - ALTO";
        } else {
            ldlClassificacao = (this.quantidadeLDL < 50) ? "LDL - BOM" : "LDL - ALTO";
        }

        return hdlClassificacao + " | " + ldlClassificacao;
    }

    public void mostrarResultado() {
        String classificacao = this.classificarResultado();
        System.out.println("Colesterol HDL: " + this.quantidadeHDL + " mg/dL - " + classificacao);
        System.out.println("Colesterol LDL: " + this.quantidadeLDL + " mg/dL - " + classificacao);
    }
    
    
}
