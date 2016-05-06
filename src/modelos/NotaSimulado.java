package modelos;

import java.util.Date;

public class NotaSimulado {

	private int id;
	private double nota;
	private Date data;
	
	public NotaSimulado() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
}
