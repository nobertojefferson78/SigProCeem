package modelos;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQueries({
	@NamedQuery(name = "Frequencia.findAll", query = "SELECT f FROM Frequencia f")
})
public class Frequencia extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column
	private Date data;
	@OneToMany
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
