package infra;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class DAO<E> {

	private static EntityManagerFactory emf;
	private EntityManager em;
	private Class<E> classe;
	
	static {
		try {
			emf = Persistence
					.createEntityManagerFactory("exercicios-jpa");
		} catch (Exception e) {
			
		}
	}
	
	public DAO() {
		this(null);
	}
	
	public DAO(Class<E> classe) {
		this.classe = classe;
		em = emf.createEntityManager();
	}
	
	public DAO<E> conectar() {
		em.getTransaction().begin();
		return this;
	}
	
	public DAO<E> desconectar() {
		em.getTransaction().commit();
		return this;
	}
	
	public DAO<E> cadastrar(E entidade) {
		em.persist(entidade);
		return this;
	}
	
	public DAO<E> incluirAtomico(E entidade) {
		return this.conectar().incluirAtomico(entidade).desconectar();
	}
	
	public List<E> consultaGeral(int quantidade, int deslocamento) {
		if(classe == null) {
			throw new UnsupportedOperationException("Classe nula");
		}
		
		String jpql = "select e from " + classe.getName() + " e";
		TypedQuery<E> query = em.createQuery(jpql, classe);
		query.setMaxResults(quantidade);
		query.setFirstResult(deslocamento);
		return query.getResultList();
		
	}
	
	public List<E> consultaGeral() {
		return this.consultaGeral(10, 0);
	}
	
	public void fechar() {
		em.close();
	}
	
	
}
