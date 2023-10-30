
import com.localhost.cadastrodealunosv2.conexao.Conexao;
import com.localhost.cadastrodealunosv2.model.ModelAluno;

public class Teste {

    public static void main(String[] args) {
        
        ModelAluno modelAluno = new ModelAluno();
        modelAluno.setNomeAluno("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        
        Conexao<ModelAluno> dao = new Conexao<>(ModelAluno.class);
        dao.conectar().cadastrar(modelAluno).desconectar().fecharConexao();
        
    }
    
}
