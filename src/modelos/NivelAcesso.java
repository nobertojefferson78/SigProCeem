package modelos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class NivelAcesso extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column
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
