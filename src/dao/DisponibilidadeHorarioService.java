package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;

import modelos.DisponibilidadeHorario;

public class DisponibilidadeHorarioService {

	private EntityManagerFactory emf = null;

	public DisponibilidadeHorarioService(EntityManagerFactory emf) {
		this.setEmf(emf);
	}
	
	public EntityManager getEntityManager() {
		return this.getEmf().createEntityManager();
	}
	
	public DisponibilidadeHorario inserir(DisponibilidadeHorario disponibilidadeHorario) {
		EntityManager em = null;
		try {
			em = getEntityManager();
			em.getTransaction().begin();
			em.persist(disponibilidadeHorario);
			em.flush();
			em.refresh(disponibilidadeHorario);
			em.getTransaction().commit();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(em != null) {
				em.close();
			}
		}
		return disponibilidadeHorario;
	}
	public DisponibilidadeHorario buscarPorID (Integer id) {
		EntityManager em = null;
		try {
			em = getEntityManager();
			return em.find(DisponibilidadeHorario.class, id);
		} finally {
			if(em != null) {
				em.close();
			}
		}
	}
	@SuppressWarnings("unchecked")
	public List<DisponibilidadeHorario> buscarTodos() {
		List<DisponibilidadeHorario> result = null;
		EntityManager em = null;
        try {
            em = this.getEntityManager();
            em.getTransaction().begin();
            result = em.createNamedQuery("DisponibilidadeHorario.findAll").getResultList();
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
	public void atualizar(DisponibilidadeHorario disponibilidadeHorario) {
		EntityManager em = null;
		try {
			em = getEntityManager();
            em.getTransaction().begin();
            em.merge(disponibilidadeHorario);
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
			DisponibilidadeHorario disponibilidadeHorario = new DisponibilidadeHorario();
			try {
				disponibilidadeHorario = em.getReference(DisponibilidadeHorario.class, id);
			} catch(EntityNotFoundException e) {
				e.printStackTrace();
			}
			em.remove(disponibilidadeHorario);
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
