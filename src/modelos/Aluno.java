package modelos;

import java.util.Date;
import java.util.List;

public class Aluno extends Pessoa {
	
	private String opcaoLingua, localCurso, turno, fotoCaminho;
	private HistoricoEscolar historicoEscolar;
	private List<NotaSimulado> notasSimulados;
	
	public Aluno() {
		
	}
	
	public void CadastrarNota(double nota, Date data) {
		
	}
	
	public String getOpcaoLingua() {
		return opcaoLingua;
	}
	public void setOpcaoLingua(String opcaoLingua) {
		this.opcaoLingua = opcaoLingua;
	}
	public String getLocalCurso() {
		return localCurso;
	}
	public void setLocalCurso(String localCurso) {
		this.localCurso = localCurso;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public String getFotoCaminho() {
		return fotoCaminho;
	}
	public void setFotoCaminho(String fotoCaminho) {
		this.fotoCaminho = fotoCaminho;
	}
	public HistoricoEscolar getHistoricoEscolar() {
		return historicoEscolar;
	}
	public void setHistoricoEscolar(HistoricoEscolar historicoEscolar) {
		this.historicoEscolar = historicoEscolar;
	}
	public List<NotaSimulado> getNotasSimulados() {
		return notasSimulados;
	}
	public void setNotasSimulados(List<NotaSimulado> notasSimulados) {
		this.notasSimulados = notasSimulados;
	}
}
