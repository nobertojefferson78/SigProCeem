package modelos;

import java.util.Date;
import java.util.List;

public class Frequencia {

	private Date data;
	private List<Aluno> alunos;
	
	public Frequencia() {
		
	}
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public List<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
}
