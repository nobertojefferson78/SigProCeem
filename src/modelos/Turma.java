package modelos;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQueries({
	@NamedQuery(name = "Turma.findAll", query = "SELECT t FROM Turma t")
})
public class Turma extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column
	private int quantidadeAlunos;
	@Column
	private String localSala;
	@OneToMany
	private List<Disciplina> disciplinas;
	@OneToMany
	private List<Aluno> alunos;
	
	public Turma() {
		
	}
	
	public void inserirDisciplina(Disciplina disciplina) {
		
	}
	public void inserirAluno(Aluno aluno) {
		
	}
	public void EditarLocalTurma(String novoLocal) {
		
	}
	public void removerAluno(Aluno aluno) {
		
	}
	
	
	public int getQuantidadeAlunos() {
		return quantidadeAlunos;
	}
	public void setQuantidadeAlunos(int quantidadeAlunos) {
		this.quantidadeAlunos = quantidadeAlunos;
	}
	public String getLocalSala() {
		return localSala;
	}
	public void setLocalSala(String localSala) {
		this.localSala = localSala;
	}
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	public List<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
}
