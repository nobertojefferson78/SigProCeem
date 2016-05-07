package dao;

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
	
	public Frequencia criarFrequencia(Frequencia frequencia) {
		EntityManager em = null;
		try {
			em = getEntityManager();
			em.getTransaction().begin();
			em.persist(frequencia);
			em.flush();
			em.refresh(frequencia);
			em.getTransaction().commit();
		} catch(Exception e) {
			System.out.println("erro ao inserir frequencia");
		} finally {
			if(em != null) {
				em.close();
			}
		}
		
		return frequencia;
	}
	public Frequencia procurarPorID(Integer id) {
		EntityManager em = null;
		try {
			em = getEntityManager();
			return em.find(Frequencia.class, id);
		} catch(Exception e) {
			System.out.println("erro ao buscar frequencia");
		} finally {
			if(em != null) {
				em.close();
			}
		}
		return null;
	}
	public void atualizar(Frequencia frequencia) {
		EntityManager em = null;
		try {
			em = getEntityManager();
            em.getTransaction().begin();
            em.merge(frequencia);
            em.getTransaction().commit();

		} catch(Exception e) {
			System.out.println("erro ao atualizar frequencia");
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
				frequencia.getId();
			} catch(EntityNotFoundException e) {
				System.out.println("erro ao encontrar frequencia");
			}
			em.remove(frequencia);
			em.getTransaction().commit();
		} catch(Exception e) {
			System.out.println("erro ao remover frequencia");
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
