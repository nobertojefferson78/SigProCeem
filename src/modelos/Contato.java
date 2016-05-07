package modelos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Contato extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column
	private String email;
	@Column(length = 14)
	private String telefone;
	
	public Contato() {
		
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
