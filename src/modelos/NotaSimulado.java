package modelos;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
	@NamedQuery(name = "NotaSimulado.findAll", query = "SELECT ns FROM NotaSimulado ns")
})
public class NotaSimulado extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column
	private double nota;
	@Column
	private Date data;
	
	public NotaSimulado() {
		
	}
	
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
}
