package teste.basico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import modelo.basico.Usuario;

public class ObterUsuarios {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		List<Usuario> usuarios = em
                .createQuery("SELECT u FROM Usuario u", Usuario.class)
                .setMaxResults(10)
                .getResultList();
		
		
		for(Usuario usuario: usuarios) {
			System.out.println(String.format("ID: %s | Nome: %s | Email: %s", 
					usuario.getId(), usuario.getNome(), usuario.getEmail()));
		}
		
		
		em.close();
		emf.close();
		

	}

}
