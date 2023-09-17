package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario2 {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		// Inicia a transação sql
		em.getTransaction().begin();
		
		// Localiza o usuário e atribui o resultado a variável
		Usuario usuario = em.find(Usuario.class, 5L);
		System.out.println(String.format("ID: %s | Nome: %s | Email: %s", 
				usuario.getId(), usuario.getNome(), usuario.getEmail()));
		
		// Utilizando o setter é feito as alterações
		usuario.setNome("Diego");
		
		/**
		 * Mesmo sem utilizar o merge, ainda é aplicado as alterações feitas no objeto no banco de dados.
		 */
			
		//em.merge(usuario);
		System.out.println(String.format("ID: %s | Nome: %s | Email: %s", 
				usuario.getId(), usuario.getNome(), usuario.getEmail()));
		
		// Ao concluir a operação faz o commit
		em.getTransaction().commit();
		
		em.close();
		emf.close();

	}

}
