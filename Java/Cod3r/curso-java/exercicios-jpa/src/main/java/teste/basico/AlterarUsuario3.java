package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario3 {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		// Inicia a transação sql
		em.getTransaction().begin();
		
		// Localiza o usuário e atribui o resultado a variável
		Usuario usuario = em.find(Usuario.class, 5L);
		// Tira o objeto do modo gerenciavel
		em.detach(usuario);
		System.out.println(String.format("ID: %s | Nome: %s | Email: %s", 
				usuario.getId(), usuario.getNome(), usuario.getEmail()));
		
		// Utilizando o setter é feito as alterações
		usuario.setNome("Diego Silva Silva");
		usuario.setEmail("diegobarbosa@gmail.com");
		
		// Aplica ao banco a alteração que foi feita no objeto
		//em.merge(usuario);
		System.out.println(String.format("ID: %s | Nome: %s | Email: %s", 
				usuario.getId(), usuario.getNome(), usuario.getEmail()));
		
		// Ao concluir a operação faz o commit
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
	}
	
}
