
import com.localhost.cadastrodealunosv2.dao.Conexao;
import com.localhost.cadastrodealunosv2.model.AlunoModel;

public class Teste {

    public static void main(String[] args) {
        
        AlunoModel modelAluno = new AlunoModel();
        //modelAluno.setNomeAluno("Thomas Shelby");
        
        Conexao<AlunoModel> dao = new Conexao<>(AlunoModel.class);
        //dao.conectar().cadastrar(modelAluno).desconectar().fecharConexao();
        dao.conectar().deletar(5);
    }
    
}
