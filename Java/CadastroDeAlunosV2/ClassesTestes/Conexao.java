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
        ModelAluno teste = new ModelAluno("Teste da Silva 3");
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
        
        /* Segunda forma de ser feito a consulta
        List<ModelAluno> alunos = entityManager
                .createQuery("SELECT u FROM alunos u", ModelAluno.class)
                .setMaxResults(10)
                .getResultList();
        
        for(ModelAluno aluno: alunos) {
            System.out.println(aluno.toString());
        }
        */
        
        /* Alterar usuário 1
        entityManager.getTransaction().begin();
        ModelAluno teste = entityManager.find(ModelAluno.class, 5L);
        teste.setNomeAluno("Zé da Manga");
        entityManager.merge(teste);
        entityManager.getTransaction().commit();
        */
        
        /* Alterar usuário 2
        entityManager.getTransaction().begin();
        ModelAluno teste = entityManager.find(ModelAluno.class, 5L);
        teste.setNomeAluno("Zé of Manga");
        // Mesmo retirando o merge é aplicado a alteração, por conta do objeto estar em um estado gerenciavel
        entityManager.getTransaction().commit();
        */
        
        /* Alterar usuário 3
        entityManager.getTransaction().begin();
        ModelAluno teste = entityManager.find(ModelAluno.class, 5L);
        // Ao utilizar o detach é desabilitado o gerenciamento do objeto e não é atualizado o objeto
        entityManager.detach(teste);
        teste.setNomeAluno("Zé da Manga");
        // Dessa forma é apenas sincronizado as alterações ao utilizar o merge
        entityManager.merge(teste);
        entityManager.getTransaction().commit();
        */
        
        /* Remover Aluno
        ModelAluno teste = entityManager.find(ModelAluno.class, 9L);
        if (teste != null) {
            entityManager.getTransaction().begin();
            entityManager.remove(teste);
            entityManager.getTransaction().commit();
        }
        */
        
        entityManager.close();
        entityManagerFactory.close();
        
    }

}
