package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;

import modelos.HistoricoEscolar;

public class HistoricoEscolarService {

	private EntityManagerFactory emf = null;
	
	public HistoricoEscolarService(EntityManagerFactory emf) {
		this.setEmf(emf);
	}
	
	public EntityManager getEntityManager() {
		return this.getEmf().createEntityManager();
	}
	
	public HistoricoEscolar inserir(HistoricoEscolar historicoEscolar) {
		EntityManager em = null;
		try {
			em = getEntityManager();
			em.getTransaction().begin();
			em.persist(historicoEscolar);
			em.flush();
			em.refresh(historicoEscolar);
			em.getTransaction().commit();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(em != null) {
				em.close();
			}
		}
		return historicoEscolar;
	}
	public HistoricoEscolar buscarPorID(Integer id) {
		EntityManager em = null;
		try {
			em = getEntityManager();
			return em.find(HistoricoEscolar.class, id);
		}  finally {
			if(em != null) {
				em.close();
			}
		}
	}
	@SuppressWarnings("unchecked")
	public List<HistoricoEscolar> buscarTodos() {
        List<HistoricoEscolar> resultado = null;
        EntityManager em = null;
        try {
            em = this.getEntityManager();
            em.getTransaction().begin();
            resultado = em.createNamedQuery("HistoricoEscolar.findAll").getResultList();
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
	public void atualizar(HistoricoEscolar historicoEscolar) {
		EntityManager em = null;
		try {
			em = getEntityManager();
            em.getTransaction().begin();
            em.merge(historicoEscolar);
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
			HistoricoEscolar historicoEscolar = new HistoricoEscolar();
			try {
				historicoEscolar = em.getReference(HistoricoEscolar.class, id);
			} catch(EntityNotFoundException e) {
				e.printStackTrace();
			}
			em.remove(historicoEscolar);
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
