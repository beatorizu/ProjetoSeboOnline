package br.com.banco.dao;

import java.util.List;

import br.com.sebo.model.Item;

public interface Dao {
	public void salvar(Item item);
	public List<Item> pesquisar(String nome);
	public Item find(int idItem);
	void excluir(Item item);
	void editar(Item item);
}
