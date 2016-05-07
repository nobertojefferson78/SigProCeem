package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;

import modelos.Contato;

public class ContatoService {

	private EntityManagerFactory emf = null;

	public ContatoService(EntityManagerFactory emf) {
		this.setEmf(emf);
	}
	
	public EntityManager getEntityManager() {
		return this.getEmf().createEntityManager();
	}
	
	public Contato inserirContato(Contato contato) {
		EntityManager em = null;
		try {
			em = getEntityManager();
			em.getTransaction().begin();
			em.persist(contato);
			em.flush();
			em.refresh(contato);
			em.getTransaction().commit();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(em != null) {
				em.close();
			}
		}
		return contato;
	}
	public Contato buscarPorID (Integer id) {
		EntityManager em = null;
		try {
			em = getEntityManager();
			return em.find(Contato.class, id);
		} finally {
			if(em != null) {
				em.close();
			}
		}
	}
	@SuppressWarnings("unchecked")
	public List<Contato> buscarTodos() {
		List<Contato> result = null;
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
	public void atualizarContato(Contato contato) {
		EntityManager em = null;
		try {
			em = getEntityManager();
            em.getTransaction().begin();
            em.merge(contato);
            em.getTransaction().commit();

		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(em != null) {
				em.close();
			}
		}
	}
	public void removerContato(Integer id) {
		EntityManager em = null;
		try {
			em = getEntityManager();
			em.getTransaction().begin();
			Contato contato = new Contato();
			try {
				contato = em.getReference(Contato.class, id);
			} catch(EntityNotFoundException e) {
				e.printStackTrace();
			}
			em.remove(contato);
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
