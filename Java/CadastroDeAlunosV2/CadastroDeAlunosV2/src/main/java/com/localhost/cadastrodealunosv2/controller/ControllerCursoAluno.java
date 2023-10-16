/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.localhost.cadastrodealunosv2.controller;

import com.localhost.cadastrodealunosv2.dao.DaoCursoAluno;
import com.localhost.cadastrodealunosv2.model.ModelAluno;
import com.localhost.cadastrodealunosv2.model.ModelCurso;
import com.localhost.cadastrodealunosv2.model.ModelCursoAluno;
import java.util.ArrayList;

/**
 * @author Diego Barbosa da Silva
 */
public class ControllerCursoAluno {
    
    private DaoCursoAluno daoCursoAluno = new DaoCursoAluno();
    
    /**
     * Salvar vinculo de aluno a um curso.
     * @param nome
     * @param descricao
     * @return int
     */
    public int salvarCursoAlunoController(ModelAluno nome, ModelCurso descricao) {
        return this.daoCursoAluno.salvarCursoAlunoDAO(nome, descricao);
    }
    
    /**
     * Excluir registro de um aluno vinculado a um curso.
     * @param codigoCursoAluno
     * @return boolean
     */
    public boolean excluirCursoAlunoController(int codigoCursoAluno) {
        return this.daoCursoAluno.excluirCursoAlunoDAO(codigoCursoAluno);
    }
    
    /**
     * Retorna lista de alunos pelo código.
     * @return  ArrayList
     */
    public ArrayList<ModelCursoAluno> retornarListarCursoAlunosController() {
        return this.daoCursoAluno.listarCursoAluno();
    }
    
}
