package modelos;

import java.util.List;

public class Turma {

	private int id;
	private int quantidadeAlunos;
	private String localSala;
	private List<Disciplina> disciplinas;
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
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
