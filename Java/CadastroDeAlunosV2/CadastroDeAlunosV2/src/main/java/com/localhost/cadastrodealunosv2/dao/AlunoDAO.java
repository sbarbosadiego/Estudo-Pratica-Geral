package com.localhost.cadastrodealunosv2.dao;

import com.localhost.cadastrodealunosv2.model.AlunoModel;
import java.util.List;

/**
 * @author Diego Barbosa da Silva
 */
public class AlunoDAO extends Conexao {
    
    public int cadastrarAluno(AlunoModel aluno) {
        try {
            super.conectar();
            entityManager.persist(aluno);
            super.desconectar();
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            super.fecharConexao();
        }
    }
    
    public boolean atualizarAluno(AlunoDAO aluno) {
        try {
            super.conectar();
            entityManager.merge(aluno);
            super.desconectar();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            super.fecharConexao();
        }
    }
    
    public void excluirAluno(Long id) {
        AlunoModel alunoModel = new AlunoModel();
        try {
            super.conectar();
            alunoModel = entityManager.find(AlunoModel.class, id);
            if (alunoModel != null) {
                entityManager.remove(alunoModel);
            }
            super.desconectar();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            super.fecharConexao();
        }
    }
    
    public AlunoModel retornarAluno(Long id) {
        AlunoModel alunoModel = new AlunoModel();
        try {
            super.conectar();
            alunoModel = entityManager.find(AlunoModel.class, id);
            super.desconectar();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return alunoModel;
    }
    
    public List<AlunoModel> retornarListaAluno() {
        List<AlunoModel> listaAlunos = entityManager
                .createQuery("SELECT u FROM alunos u", AlunoModel.class)
                .getResultList();
        return listaAlunos;
    }
    
    
}
