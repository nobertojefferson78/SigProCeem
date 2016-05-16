package modelos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
	@NamedQuery(name = "HistoricoEscolar.findAll", query = "SELECT he FROM HistoricoEscolar he")
})
public class HistoricoEscolar extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column
	private String status;
	@Column
	private double notaMatematica;
	@Column
	private double notaPortugues;
	
	public HistoricoEscolar() {
		
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getNotaMatematica() {
		return notaMatematica;
	}
	public void setNotaMatematica(double notaMatematica) {
		this.notaMatematica = notaMatematica;
	}
	public double getNotaPortugues() {
		return notaPortugues;
	}
	public void setNotaPortugues(double notaPortugues) {
		this.notaPortugues = notaPortugues;
	}
}
