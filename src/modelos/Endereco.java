package modelos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
	@NamedQuery(name = "Endereco.findAll", query = "SELECT e FROM Endereco e")
})
public class Endereco extends BaseEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Column
	private int numero;
	@Column(length = 9)
	private int cep;
	@Column
	private String rua;
	@Column
	private String bairro;
	@Column
	private String cidade;
	
	public Endereco() {
		
	}

	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
}
