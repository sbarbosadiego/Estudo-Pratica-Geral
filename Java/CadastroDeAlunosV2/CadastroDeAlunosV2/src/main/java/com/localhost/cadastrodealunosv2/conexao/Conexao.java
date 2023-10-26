package com.localhost.cadastrodealunosv2.conexao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author Diego Barbosa da Silva
 */
public class Conexao<E> {
    
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("conexao-Mysql");
    EntityManager entityManager = factory.createEntityManager();
    
    public Conexao<E> conectar() {
        try {
            entityManager.getTransaction().begin();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this;
    }
    
    public Conexao<E> desconectar() {
        entityManager.getTransaction().commit();
        return this;
    }
    
    public void fecharConexao() {
        entityManager.close();
    }
    
}
