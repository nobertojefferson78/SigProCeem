package modelos;

import java.util.Date;
import java.util.List;

public class Disciplina {

	private int id;
	private String turno, horario;
	private Professor professor;
	private List<Frequencia> frequencias;
	
	public Disciplina() {
		
	}
	
	public void cadastrarFaltas(List<Aluno> alunos, Date data) {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
