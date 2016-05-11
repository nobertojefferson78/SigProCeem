package modelos;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@NamedQueries({
	@NamedQuery(name = "Disciplina.findAll", query = "SELECT d FROM Disciplina d")
})
public class Disciplina extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column
	private String turno;
	@Column
	private String horario;
	@OneToOne
	private Professor professor;
	@OneToMany
	private List<Frequencia> frequencias;
	
	public Disciplina() {
		
	}
	
	public void cadastrarFaltas(List<Aluno> alunos, Date data) {
		
	}
	
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public List<Frequencia> getFrequencias() {
		return frequencias;
	}
	public void setFrequencias(List<Frequencia> frequencias) {
		this.frequencias = frequencias;
	}
}
