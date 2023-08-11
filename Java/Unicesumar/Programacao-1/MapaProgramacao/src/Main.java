
import exames.ExameColesterol;
import exames.ExameGlicemia;
import exames.ExameTriglicerideo;

public class Main {
    
    public static void main(String[] args) {
        
        
        /**
         * Criando construtores e passando os parâmetros.
         */
        ExameGlicemia exameGlicemia = new ExameGlicemia("José", "A+", 1990, 120);
        ExameColesterol exameColesterol = new ExameColesterol("Luciana", "O+", 1985, 130, 50, 'A');
        ExameTriglicerideo exameTriglicerideo = new ExameTriglicerideo("Ricardo", "AB-", 2005, 200);
        
        /**
         * Chamada dos objetos e seus métodos.
         */
        //exameGlicemia.mostrarResultado();
        exameColesterol.mostrarResultado();
        
    }
}