/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.localhost.cadastrodealunosv2.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Diego Barbosa da Silva
 */
@Entity
public class ModelAluno {
    
    @Id
    private int codigoAluno;
    private String nomeAluno;
    
    public ModelAluno() {
    }

    public int getCodigoAluno() {
        return codigoAluno;
    }

    public void setCodigoAluno(int codigoAluno) {
        this.codigoAluno = codigoAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }
    
}
