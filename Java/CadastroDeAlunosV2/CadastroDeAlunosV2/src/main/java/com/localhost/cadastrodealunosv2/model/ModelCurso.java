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
@Entity(name = "cursos")
public class ModelCurso {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pk_codigo_curso")
    private Long codigoCurso;
    
    @Column(name = "curso_ementa")
    private String ementaCurso;
    
    @Column(name = "curso_descricao", length = 50, nullable = false)
    private String descricaoCurso;
    
    @CreationTimestamp
    @Column(name = "data_cadastro")
    private LocalDateTime dataCriacao;

    public ModelCurso() {
        
    }
    
}
