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

    public String classificarResultado() {
        String hdlClassificacao = "";
        if (anoNascimento >= 20) {
            hdlClassificacao = (quantidadeHDL > 40) ? "HDL - BOM" : "HDL - BAIXO";
        } else {
            hdlClassificacao = (quantidadeHDL > 45) ? "HDL - BOM" : "HDL - BAIXO";
        }

        String ldlClassificacao = "";
        if (riscoPaciente == 'B') {
            ldlClassificacao = (quantidadeLDL < 100) ? "LDL - BOM" : "LDL - ALTO";
        } else if (riscoPaciente == 'M') {
            ldlClassificacao = (quantidadeLDL < 70) ? "LDL - BOM" : "LDL - ALTO";
        } else {
            ldlClassificacao = (quantidadeLDL < 50) ? "LDL - BOM" : "LDL - ALTO";
        }

        return hdlClassificacao + " | " + ldlClassificacao;
    }

    public void mostrarResultado() {
        String classificacao = classificarResultado();
        System.out.println("Colesterol HDL: " + quantidadeHDL + " mg/dL - " + classificacao);
        System.out.println("Colesterol LDL: " + quantidadeLDL + " mg/dL - " + classificacao);
    }
    
    
}
