package com.localhost.cadastrodealunosv2.controller;

import com.localhost.cadastrodealunosv2.dao.AlunoDAO;
import com.localhost.cadastrodealunosv2.model.AlunoModel;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Diego Barbosa da Silva
 */
public class AlunoController {
    
    private AlunoDAO alunoDao = new AlunoDAO();
    
    public int salvarAlunoController(AlunoModel aluno) {
        return this.alunoDao.cadastrarAluno(aluno);
    }
    
    public boolean atualizarAlunoController(AlunoDAO aluno) {
        return this.alunoDao.atualizarAluno(aluno);
    }
    
    public List<AlunoModel> retornarListarAlunosController() {
        return this.alunoDao.retornarListaAluno();
    }
    
}
