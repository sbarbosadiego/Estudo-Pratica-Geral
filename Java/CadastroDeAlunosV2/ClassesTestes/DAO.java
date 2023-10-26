package com.localhost.cadastrodealunosv2.conexao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 * @author Diego Barbosa da Silva
 */
public class DAO<E> {

    private static EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;
    private Class<E> classe;

    static {
        try {
            entityManagerFactory = Persistence
                    .createEntityManagerFactory("conexao-Mysql");
        } catch (Exception e) {
            
        }
    }

    public DAO() {
        this(null);
    }

    public DAO(Class<E> classe) {
        this.classe = classe;
        entityManager = entityManagerFactory.createEntityManager();
    }

    public DAO<E> conectar() {
        entityManager.getTransaction().begin();
        return this;
    }

    public DAO<E> desconectar() {
        entityManager.getTransaction().commit();
        return this;
    }

    public DAO<E> cadastrar(E entidade) {
        entityManager.persist(entidade);
        return this;
    }

    public DAO<E> incluirAtomico(E entidade) {
        return this.conectar().incluirAtomico(entidade).desconectar();
    }

    public List<E> consultaGeral(int quantidade, int deslocamento) {
        if (classe == null) {
            throw new UnsupportedOperationException("Classe nula");
        }

        String jpql = "select e from " + classe.getName() + "e";
        TypedQuery<E> query = entityManager.createQuery(jpql, classe);
        query.setMaxResults(quantidade);
        query.setFirstResult(deslocamento);
        return query.getResultList();

    }

    public List<E> consultaGeral() {
        return this.consultaGeral(10, 0);
    }

    public void fecharConexao() {
        entityManager.close();
    }

}
