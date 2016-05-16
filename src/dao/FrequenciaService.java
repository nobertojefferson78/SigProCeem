package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;

import modelos.Frequencia;

public class FrequenciaService {

	private EntityManagerFactory emf = null;

	public FrequenciaService(EntityManagerFactory emf) {
		this.setEmf(emf);
	}
	
	public EntityManager getEntityManager() {
		return this.getEmf().createEntityManager();
	}
	
	public Frequencia inserir(Frequencia frequencia) {
		EntityManager em = null;
		try {
			em = getEntityManager();
			em.getTransaction().begin();
			em.persist(frequencia);
			em.flush();
			em.refresh(frequencia);
			em.getTransaction().commit();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(em != null) {
				em.close();
			}
		}
		
		return frequencia;
	}
	public Frequencia buscarPorID(Integer id) {
		EntityManager em = null;
		try {
			em = getEntityManager();
			return em.find(Frequencia.class, id);
		} finally {
			if(em != null) {
				em.close();
			}
		}
	}
	@SuppressWarnings("unchecked")
	public List<Frequencia> buscarTodos() {
        List<Frequencia> resultado = null;
        EntityManager em = null;
        try {
            em = this.getEntityManager();
            em.getTransaction().begin();
            resultado = em.createNamedQuery("Frequencia.findAll").getResultList();
            em.getTransaction().commit();
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            if(em != null) {
                em.close();
            }
        }
        return resultado;
	}
	public void atualizar(Frequencia frequencia) {
		EntityManager em = null;
		try {
			em = getEntityManager();
            em.getTransaction().begin();
            em.merge(frequencia);
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
			Frequencia frequencia = new Frequencia();
			try {
				frequencia = em.getReference(Frequencia.class, id);
			} catch(EntityNotFoundException e) {
				e.printStackTrace();
			}
			em.remove(frequencia);
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
