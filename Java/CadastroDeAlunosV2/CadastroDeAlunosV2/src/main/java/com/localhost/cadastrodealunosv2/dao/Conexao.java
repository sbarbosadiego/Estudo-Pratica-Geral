package com.localhost.cadastrodealunosv2.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author Diego Barbosa da Silva
 */
public class Conexao<E> {

    EntityManagerFactory factory = Persistence.createEntityManagerFactory("conexao-Mysql");
    EntityManager entityManager;
    private Class<E> classe;

    public Conexao(Class<E> classe) {
        this.classe = classe;
        entityManager = factory.createEntityManager();
    }

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

    public Conexao<E> cadastrar(E entidade) {
        entityManager.persist(entidade);
        return this;
    }

    public void deletar(long id) {
        try {
            E entidade = entityManager.find(classe, id);
            if (entidade != null) {
                entityManager.remove(entidade);
                entityManager.getTransaction().commit();
            }
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            e.printStackTrace();
        }

        
        
        
        
    }
}
