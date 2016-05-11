package modelos;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQueries({
	@NamedQuery(name = "Professor.findAll", query = "SELECT p FROM Professor p")
})
public class Professor extends Usuario {

	private static final long serialVersionUID = 1L;
	
	@OneToMany
	private List<DisponibilidadeHorario> horariosDisponiveis;

	public List<DisponibilidadeHorario> getHorariosDisponiveis() {
		return horariosDisponiveis;
	}
	public void setHorariosDisponiveis(List<DisponibilidadeHorario> horariosDisponiveis) {
		this.horariosDisponiveis = horariosDisponiveis;
	}
}
