package br.com.sebo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="item")
public class Item {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int item_id;
	private String item_titulo; 
	private double item_preco;
	private String item_descricao;
	public static final String MSG_INSERIR = "Item: '%s' cadastrado com sucesso";
	public static final String MSG_EXCLUIR = "Item: '%s' excluido com sucesso";
	public static final String MSG_ATUALIZAR = "Item: '%s' atualizado com sucesso";
	
	
	public Item(int item_id, String item_titulo, double item_preco,
			String item_descricao) {
		this.item_id = item_id;
		this.item_titulo = item_titulo;
		this.item_preco = item_preco;
		this.item_descricao = item_descricao;
	}

	public Item() {
	}

	public int getItem_id() {
		return item_id;
	}
	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}
	public String getItem_titulo() {
		return item_titulo;
	}
	public void setItem_titulo(String item_titulo) {
		this.item_titulo = item_titulo;
	}
	public double getItem_preco() {
		return item_preco;
	}
	public void setItem_preco(double item_preco) {
		this.item_preco = item_preco;
	}
	public String getItem_descricao() {
		return item_descricao;
	}
	public void setItem_descricao(String item_descricao) {
		this.item_descricao = item_descricao;
	}
}
