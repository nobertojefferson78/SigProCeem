package modelos;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class DisponibilidadeHorario extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@OneToMany
	private List<Date> datas;
	
	public DisponibilidadeHorario() {
		
	}
	
	public void adicionarDataDisponivel(Date data) {
		
	}

	public List<Date> getDatas() {
		return datas;
	}
	public void setDatas(List<Date> datas) {
		this.datas = datas;
	}
}
