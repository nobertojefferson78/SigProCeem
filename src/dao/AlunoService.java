package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;

import modelos.Aluno;

public class AlunoService {

	private EntityManagerFactory emf = null;
	
	public AlunoService(EntityManagerFactory emf) {
		this.setEmf(emf);
	}
	
	public EntityManager getEntityManager() {
		return this.getEmf().createEntityManager();
	}
	
	public Aluno inserir(Aluno aluno) {
		EntityManager em = null;
		try {
			em = getEntityManager();
			em.getTransaction().begin();
			em.persist(aluno);
			em.flush();
			em.refresh(aluno);
			em.getTransaction().commit();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(em != null) {
				em.close();
			}
		}
		return aluno;
	}
	public Aluno buscarPorID(Integer id) {
		EntityManager em = null;
		try {
			em = getEntityManager();
			return em.find(Aluno.class, id);
		}  finally {
			if(em != null) {
				em.close();
			}
		}
	}
	@SuppressWarnings("unchecked")
	public List<Aluno> buscarTodos() {
        List<Aluno> resultado = null;
        EntityManager em = null;
        try {
            em = this.getEntityManager();
            em.getTransaction().begin();
            resultado = em.createNamedQuery("Aluno.findAll").getResultList();
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
	public void atualizar(Aluno aluno) {
		EntityManager em = null;
		try {
			em = getEntityManager();
            em.getTransaction().begin();
            em.merge(aluno);
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
			Aluno aluno = new Aluno();
			try {
				aluno = em.getReference(Aluno.class, id);
			} catch(EntityNotFoundException e) {
				e.printStackTrace();
			}
			em.remove(aluno);
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
