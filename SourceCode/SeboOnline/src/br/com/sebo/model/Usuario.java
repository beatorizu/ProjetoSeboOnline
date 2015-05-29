package br.com.sebo.model;

public class Usuario {
	private int user_id;
	private String user_nome, 	user_sobrenome, user_senha ,
	user_email , user_cpf , user_rua , user_bairro , user_cidade ,
	user_estado , user_rg , user_telefone;
	
	
	
	public Usuario() {
	}


	public Usuario(int user_id, String user_nome, String user_sobrenome,
			String user_senha, String user_email, String user_cpf,
			String user_rua, String user_bairro, String user_cidade,
			String user_estado, String user_rg, String user_telefone) {
		this.user_id = user_id;
		this.user_nome = user_nome;
		this.user_sobrenome = user_sobrenome;
		this.user_senha = user_senha;
		this.user_email = user_email;
		this.user_cpf = user_cpf;
		this.user_rua = user_rua;
		this.user_bairro = user_bairro;
		this.user_cidade = user_cidade;
		this.user_estado = user_estado;
		this.user_rg = user_rg;
		this.user_telefone = user_telefone;
	}
	
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_nome() {
		return user_nome;
	}
	public void setUser_nome(String user_nome) {
		this.user_nome = user_nome;
	}
	public String getUser_sobrenome() {
		return user_sobrenome;
	}
	public void setUser_sobrenome(String user_sobrenome) {
		this.user_sobrenome = user_sobrenome;
	}
	public String getUser_senha() {
		return user_senha;
	}
	public void setUser_senha(String user_senha) {
		this.user_senha = user_senha;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_cpf() {
		return user_cpf;
	}
	public void setUser_cpf(String user_cpf) {
		this.user_cpf = user_cpf;
	}
	public String getUser_rua() {
		return user_rua;
	}
	public void setUser_rua(String user_rua) {
		this.user_rua = user_rua;
	}
	public String getUser_bairro() {
		return user_bairro;
	}
	public void setUser_bairro(String user_bairro) {
		this.user_bairro = user_bairro;
	}
	public String getUser_cidade() {
		return user_cidade;
	}
	public void setUser_cidade(String user_cidade) {
		this.user_cidade = user_cidade;
	}
	public String getUser_estado() {
		return user_estado;
	}
	public void setUser_estado(String user_estado) {
		this.user_estado = user_estado;
	}
	public String getUser_rg() {
		return user_rg;
	}
	public void setUser_rg(String user_rg) {
		this.user_rg = user_rg;
	}
	public String getUser_telefone() {
		return user_telefone;
	}
	public void setUser_telefone(String user_telefone) {
		this.user_telefone = user_telefone;
	}
	
	
	

}
