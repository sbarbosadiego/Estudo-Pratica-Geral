package com.localhost.cadastrodealunosv2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

/**
 * @author Diego Barbosa da Silva
 */
@Entity(name = "cursos_alunos")
public class ModelCursoAluno {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pk_codigo")
    private int codigoCursoAluno;
    
    @ManyToOne
    @JoinColumn(name = "fk_aluno", referencedColumnName = "pk_codigo_aluno")
    private ModelAluno codigoAluno;

    @ManyToOne
    @JoinColumn(name = "fk_curso", referencedColumnName = "pk_codigo_curso")
    private ModelCurso codigoCurso;
    
    @Transient
    private String aluno;
    
    @Transient
    private String curso;

    public ModelCursoAluno() {
    }

    public int getCodigoCursoAluno() {
        return codigoCursoAluno;
    }

    public void setCodigoCursoAluno(int codigoCursoAluno) {
        this.codigoCursoAluno = codigoCursoAluno;
    }

    public ModelAluno getCodigoAluno() {
        return codigoAluno;
    }

    public void setCodigoAluno(ModelAluno codigoAluno) {
        this.codigoAluno = codigoAluno;
    }

    public ModelCurso getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(ModelCurso codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
