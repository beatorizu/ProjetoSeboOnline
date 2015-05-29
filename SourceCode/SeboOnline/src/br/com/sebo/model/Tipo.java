package br.com.sebo.model;

public class Tipo {
	private int tipo_id;
	private String tipo_descricao;
	
	public Tipo() {
	}
	
	public Tipo(int tipo_id, String tipo_descricao) {
		this.tipo_id = tipo_id;
		this.tipo_descricao = tipo_descricao;
	}
	
	public int getTipo_id() {
		return tipo_id;
	}
	public void setTipo_id(int tipo_id) {
		this.tipo_id = tipo_id;
	}
	public String getTipo_descricao() {
		return tipo_descricao;
	}
	public void setTipo_descricao(String tipo_descricao) {
		this.tipo_descricao = tipo_descricao;
	}
}
