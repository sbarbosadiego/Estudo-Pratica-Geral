
import com.localhost.cadastrodealunosv2.dao.AlunoDAO;
import com.localhost.cadastrodealunosv2.model.AlunoModel;

public class Teste {

    public static void main(String[] args) {
        
        AlunoModel modelAluno = new AlunoModel();
        modelAluno.setCodigoAluno(5L);
        modelAluno.setNomeAluno("Agora vai da Silva");
        
        AlunoDAO dao = new AlunoDAO();
        //dao.cadastrarAluno(modelAluno);
        dao.atualizarrAluno(modelAluno);
        
    }
    
}
