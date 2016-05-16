package modelos;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
	@NamedQuery(name = "DisponibilidadeHorario.findAll", query = "SELECT dh FROM DisponibilidadeHorario dh")
})
public class DisponibilidadeHorario extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column
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
