package modelos;

public class NivelAcesso {

	private int id;
	private String nomeNivel, descricao;
	
	public NivelAcesso() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
