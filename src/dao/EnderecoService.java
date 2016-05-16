package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;

import modelos.Endereco;

public class EnderecoService {

	private EntityManagerFactory emf = null;

	public EnderecoService(EntityManagerFactory emf) {
		this.setEmf(emf);
	}
	
	public EntityManager getEntityManager() {
		return this.getEmf().createEntityManager();
	}
	
	public Endereco inserir(Endereco endereco) {
		EntityManager em = null;
		try {
			em = getEntityManager();
			em.getTransaction().begin();
			em.persist(endereco);
			em.flush();
			em.refresh(endereco);
			em.getTransaction().commit();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(em != null) {
				em.close();
			}
		}
		return endereco;
	}
	public Endereco buscarPorId(Integer id) {
		EntityManager em = null;
		try {
			em = getEntityManager();
			return em.find(Endereco.class, id);
		} finally {
			if(em != null) {
				em.close();
			}
		}
	}
	@SuppressWarnings("unchecked")
	public List<Endereco> buscarTodos() {
		List<Endereco> result = null;
		EntityManager em = null;
		try {
			em = this.getEntityManager();
            em.getTransaction().begin();
            result = em.createNamedQuery("Endereco.findAll").getResultList();
            em.getTransaction().commit();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(em != null) {
				em.close();
			}
		}
		return result;
	}
	public void atualizar(Endereco endereco) {
		EntityManager em = null;
		try {
			em = getEntityManager();
            em.getTransaction().begin();
            em.merge(endereco);
            em.getTransaction().commit();

		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(em != null) {
				em.close();
			}
		}
	}
	public void remover(Integer id) {
		EntityManager em = null;
		try {
			em = getEntityManager();
			em.getTransaction().begin();
			Endereco endereco = new Endereco();
			try {
				endereco = em.getReference(Endereco.class, id);
			} catch(EntityNotFoundException e) {
				e.printStackTrace();
			}
			em.remove(endereco);
			em.getTransaction().commit();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(em != null) {
				em.close();
			}
		}
	}
	
	public EntityManagerFactory getEmf() {
		return emf;
	}
	public void setEmf(EntityManagerFactory emf) {
		this.emf = emf;
	}
}
