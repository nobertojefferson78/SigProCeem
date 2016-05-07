package modelos;

import java.util.List;

public class Professor extends Usuario {

	private static final long serialVersionUID = 1L;
	
	private List<DisponibilidadeHorario> horariosDisponiveis;

	public List<DisponibilidadeHorario> getHorariosDisponiveis() {
		return horariosDisponiveis;
	}
	public void setHorariosDisponiveis(List<DisponibilidadeHorario> horariosDisponiveis) {
		this.horariosDisponiveis = horariosDisponiveis;
	}
}
