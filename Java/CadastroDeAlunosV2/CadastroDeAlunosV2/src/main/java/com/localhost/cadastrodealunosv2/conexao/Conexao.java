package com.localhost.cadastrodealunosv2.conexao;

import com.localhost.cadastrodealunosv2.model.ModelAluno;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author Diego Barbosa da Silva
 */
public class Conexao {
    
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("conexao-Mysql");
    
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    
    ModelAluno teste = new ModelAluno("Teste da Silva");
    
    entityManager
    
    
}
