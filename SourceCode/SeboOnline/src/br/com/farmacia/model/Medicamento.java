package br.com.farmacia.model;

public class Medicamento {

	private int id;
	private String nome;
	private String laboratorio;
	private int registro;
	public static final String MSG_INSERIR = "Medicamento: '%s' cadastrado com sucesso";
	public static final String MSG_EXCLUIR = "Medicamento: '%s' excluido com sucesso";
	public static final String MSG_ATUALIZAR = "Medicamento: '%s' atualizado com sucesso";
	
	public Medicamento() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}

	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}