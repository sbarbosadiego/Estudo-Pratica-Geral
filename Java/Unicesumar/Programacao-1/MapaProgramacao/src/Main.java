
import exames.ExameColesterol;
import exames.ExameGlicemia;
import exames.ExameTriglicerideo;

public class Main {
    
    public static void main(String[] args) {
        // Simulando alguns exames para teste
        ExameGlicemia exameGlicemia = new ExameGlicemia("José", "A+", 1990, 120);
        ExameColesterol exameColesterol = new ExameColesterol("Luciana", "O+", 1985, 130, 50, 'A');
        ExameTriglicerideo exameTriglicerideo = new ExameTriglicerideo("Ricardo", "AB-", 2005, 200);
        
        exameGlicemia.mostrarResultado();
        exameColesterol.mostrarResultado();
        exameTriglicerideo.mostrarResultado();
    }
}