package com.localhost.cadastrodealunosv2.dao;

import com.localhost.cadastrodealunosv2.model.AlunoModel;
import javax.persistence.EntityManager;

/**
 * @author Diego Barbosa da Silva
 */
public class AlunoDAO extends Conexao {
    
    public void cadastrarAluno(AlunoModel aluno) {
        try {
            super.conectar();
            entityManager.persist(aluno);
            super.desconectar();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void atualizarrAluno(AlunoModel aluno) {
        try {
            super.conectar();
            entityManager.merge(aluno);
            super.desconectar();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
