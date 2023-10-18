package com.localhost.cadastrodealunosv2.conexao;

import com.localhost.cadastrodealunosv2.model.ModelAluno;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 * @author Diego Barbosa da Silva
 */
public class Conexao {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("conexao-Mysql");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        
        /* Insert
        ModelAluno teste = new ModelAluno("Zé of Manga");
        // Inicia a transação
        entityManager.getTransaction().begin();
        entityManager.persist(teste);
        // Encerra a transação
        entityManager.getTransaction().commit();
        */
        
        /* Consulta
        // Parametro Tipo de classe a ser mapeada, ID
        ModelAluno teste = entityManager.find(ModelAluno.class, 2L);
        System.out.println(teste.getNomeAluno());
        */
        
        /* Consulta com jpql
        String jpql = "SELECT u FROM alunos u";
        TypedQuery<ModelAluno> query = entityManager.createQuery(jpql, ModelAluno.class);
        query.setMaxResults(10);
        
        List<ModelAluno> alunos = query.getResultList();
        for(ModelAluno aluno: alunos) {
            System.out.println(aluno.toString());
        }
        */
        
        //* Segunda forma de ser feito a consulta
        List<ModelAluno> alunos = entityManager
                .createQuery("SELECT u FROM alunos u", ModelAluno.class)
                .setMaxResults(10)
                .getResultList();
        
        for(ModelAluno aluno: alunos) {
            System.out.println(aluno.toString());
        }
        //
        
        
        entityManager.close();
        entityManagerFactory.close();
        
    }

}
