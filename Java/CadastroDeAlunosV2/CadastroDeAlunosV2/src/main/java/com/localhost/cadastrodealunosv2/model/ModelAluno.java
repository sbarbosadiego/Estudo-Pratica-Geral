/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.localhost.cadastrodealunosv2.model;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

/**
 * @author Diego Barbosa da Silva
 */
@Data
@Entity(name = "alunos")
public class ModelAluno {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pk_codigo_aluno")
    private int codigoAluno;
    
    @Column(name = "aluno_nome", length = 50, nullable = false)
    private String nomeAluno;
    
    @CreationTimestamp
    @Column(name = "data_cadastro")
    private LocalDateTime dataCriacao;
    
    public ModelAluno() {
        
    }

    public ModelAluno(String nome) {
        this.nomeAluno = nome;
    }

}
