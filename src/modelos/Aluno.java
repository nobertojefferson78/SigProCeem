package modelos;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Aluno extends Pessoa {
	
	private static final long serialVersionUID = 1L;
	
	@Column
	private String opcaoLingua;
	@Column
	private String localCurso;
	@Column
	private String turno;
	@Column
	private String fotoCaminho;
	@OneToOne(cascade = {CascadeType.ALL})
	private HistoricoEscolar historicoEscolar;
	@OneToMany
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
