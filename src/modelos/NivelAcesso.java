package modelos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
	@NamedQuery(name = "NivelAcesso.findAll", query = "SELECT na FROM NivelAcesso na")
})
public class NivelAcesso extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(length = 20)
	private String nomeNivel;
	@Column
	private String descricao;
	
	public NivelAcesso() {
		
	}
	
	public String getNomeNivel() {
		return nomeNivel;
	}
	public void setNomeNivel(String nomeNivel) {
		this.nomeNivel = nomeNivel;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
