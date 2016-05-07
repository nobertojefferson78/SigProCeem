package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import modelos.NivelAcesso;

public class NivelAcessoService {
	
	private EntityManagerFactory emf = null;
	
	public NivelAcessoService(EntityManagerFactory emf) {
		this.setEmf(emf);
	}
	
	public EntityManager getEntityManager() {
		return this.getEmf().createEntityManager();
	}
	
	public NivelAcesso criarNivelAcesso(NivelAcesso nivelAcesso) {
		EntityManager em = null;
		try {
			em = getEntityManager();
			em.getTransaction().begin();
			em.persist(nivelAcesso);
			em.flush();
			em.refresh(nivelAcesso);
			em.getTransaction().commit();
		} catch(Exception e) {
			System.out.println("erro ao criar nivel de acesso");
		} finally {
			if(em != null) {
				em.close();
			}
		}
		return nivelAcesso;
	}
	public NivelAcesso procurarPorID(Integer id) {
		EntityManager em = null;
		try {
			em = getEntityManager();
			return em.find(NivelAcesso.class, id);
		} catch(Exception e) {
			System.out.println("erro ao buscar nivel de acesso");
		} finally {
			if(em != null) {
				em.close();
			}
		}
		return null;
	}
	public void atualizar(NivelAcesso nivelAcesso) {
		EntityManager em = null;
		try {
			em = getEntityManager();
            em.getTransaction().begin();
            em.merge(nivelAcesso);
            em.getTransaction().commit();

		} catch(Exception e) {
			System.out.println("erro ao atualizar nivel de acesso");
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
