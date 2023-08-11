package exames;

public class ExameTriglicerideo extends Exame {
    
    double quantidadeTriglicerideos;

    public ExameTriglicerideo(String nome, String tipoSanguineo, int anoNascimento, double quantidadeTriglicerideos) {
        super(nome, tipoSanguineo, anoNascimento);
        this.quantidadeTriglicerideos = quantidadeTriglicerideos;
    }
    
    /**
     * 
     * @return 
     */
    public String classificarResultado() {
        int limite = 0;
        int idade = this.anoNascimento - 2023;
        if (idade <= 9) {
            limite = 75;
        } else if (idade <= 19) {
            limite = 90;
        } else {
            limite = 150;
        }

        if (this.quantidadeTriglicerideos < limite) {
            return "Normal";
        } else {
            return "Elevado";
        }
    }

    public void mostrarResultado() {
        String classificacao = this.classificarResultado();
        System.out.println("Triglicerídeos: " + this.quantidadeTriglicerideos + " mg/dL - " + classificacao);
    }
    
}
