package br.com.banco.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.sebo.model.Item;

public class ItemDaoJpa implements Dao {

	private static final String CONSULTA_JPA = "SELECT m from Item m";
	private EntityManagerFactory factory;
	private EntityManager em;
	
	public ItemDaoJpa() {
		factory = Persistence.createEntityManagerFactory("puSebo");
		em = factory.createEntityManager();
	}
	
	@Override
	public void salvar(Item item) {
		em.getTransaction().begin();
		em.persist(item);
		em.getTransaction().commit();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Item> pesquisar(String nome) {
		String sql = CONSULTA_JPA.concat((nome != null && !nome.isEmpty()) ? String.format(
				" where m.item_titulo like \"%%%s%%\"", nome) : "");
		Query query = em.createQuery(sql);
		return query.getResultList();
	}

	@Override
	public Item find(int idItem) {
		return em.find(Item.class, idItem);
	}

	@Override
	public void excluir(Item item) {
		em.getTransaction().begin();
        em.remove(item);
        em.getTransaction().commit();
	}

	@Override
	public void editar(Item item) {
		em.getTransaction().begin();
        em.merge(item);
        em.getTransaction().commit();
	}
}