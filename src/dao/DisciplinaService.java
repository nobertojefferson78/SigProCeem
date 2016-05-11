package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;

import modelos.Disciplina;

public class DisciplinaService {

	private EntityManagerFactory emf = null;
	
	public DisciplinaService(EntityManagerFactory emf) {
		this.setEmf(emf);
	}
	
	public EntityManager getEntityManager() {
		return this.getEmf().createEntityManager();
	}
	
	public Disciplina inserir(Disciplina disciplina) {
		EntityManager em = null;
		try {
			em = getEntityManager();
			em.getTransaction().begin();
			em.persist(disciplina);
			em.flush();
			em.refresh(disciplina);
			em.getTransaction().commit();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(em != null) {
				em.close();
			}
		}
		return disciplina;
	}
	public Disciplina buscarPorID(Integer id) {
		EntityManager em = null;
		try {
			em = getEntityManager();
			return em.find(Disciplina.class, id);
		}  finally {
			if(em != null) {
				em.close();
			}
		}
	}
	@SuppressWarnings("unchecked")
	public List<Disciplina> buscarTodos() {
        List<Disciplina> resultado = null;
        EntityManager em = null;
        try {
            em = this.getEntityManager();
            em.getTransaction().begin();
            resultado = em.createNamedQuery("Disciplina.findAll").getResultList();
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
	public void atualizar(Disciplina disciplina) {
		EntityManager em = null;
		try {
			em = getEntityManager();
            em.getTransaction().begin();
            em.merge(disciplina);
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
			Disciplina disciplina = new Disciplina();
			try {
				disciplina = em.getReference(Disciplina.class, id);
			} catch(EntityNotFoundException e) {
				e.printStackTrace();
			}
			em.remove(disciplina);
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
