package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;

import modelos.NivelAcesso;

public class NivelAcessoService {
	
	private EntityManagerFactory emf = null;
	
	public NivelAcessoService(EntityManagerFactory emf) {
		this.setEmf(emf);
	}
	
	public EntityManager getEntityManager() {
		return this.getEmf().createEntityManager();
	}
	
	public NivelAcesso inserir(NivelAcesso nivelAcesso) {
		EntityManager em = null;
		try {
			em = getEntityManager();
			em.getTransaction().begin();
			em.persist(nivelAcesso);
			em.flush();
			em.refresh(nivelAcesso);
			em.getTransaction().commit();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(em != null) {
				em.close();
			}
		}
		return nivelAcesso;
	}
	public NivelAcesso buscarPorID(Integer id) {
		EntityManager em = null;
		try {
			em = getEntityManager();
			return em.find(NivelAcesso.class, id);
		}  finally {
			if(em != null) {
				em.close();
			}
		}
	}
	@SuppressWarnings("unchecked")
	public List<NivelAcesso> buscarTodos() {
        List<NivelAcesso> resultado = null;
        EntityManager em = null;
        try {
            em = this.getEntityManager();
            em.getTransaction().begin();
            resultado = em.createNamedQuery("NivelAcesso.findAll").getResultList();
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
	public void atualizar(NivelAcesso nivelAcesso) {
		EntityManager em = null;
		try {
			em = getEntityManager();
            em.getTransaction().begin();
            em.merge(nivelAcesso);
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
			NivelAcesso nivelAcesso = new NivelAcesso();
			try {
				nivelAcesso = em.getReference(NivelAcesso.class, id);
			} catch(EntityNotFoundException e) {
				e.printStackTrace();
			}
			em.remove(nivelAcesso);
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
