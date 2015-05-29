package br.com.banco.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.sebo.dao.util.ConnectionFactory;
import br.com.sebo.model.Item;
import br.com.sebo.model.Tipo;

import com.mysql.jdbc.Connection;

public class ItemDaoJdbc implements Dao {
	private final String INSERT = "insert into item values(null,?,?,?)";
	private final String CONSULTA = "select * from item";
	private final String EXCLUIR = "DELETE FROM item WHERE id = ?";
	private final String EDITAR = "UPDATE item SET item_titulo = ?, item_preco = ?, item_descricao = ? WHERE item_id = ?";
	private ConnectionFactory factory;

	public ItemDaoJdbc() {
		factory = new ConnectionFactory();
	}
	
	@Override
	public void salvar(Item item) {
		Connection connection = null;
		try {
			connection = factory.createConnection();
			
			PreparedStatement st = connection.prepareStatement(INSERT);
			st.setString(1, item.getItem_titulo());
			st.setDouble(6, item.getItem_preco());
			st.setString(7, item.getItem_descricao());
			st.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null)
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}

	@Override
	public List<Item> pesquisar(String nome) {
		List<Item> itens = new ArrayList<Item>();
		try {
			Connection connection = factory.createConnection();

			String sql = CONSULTA.concat((nome != null && !nome.isEmpty()) ? String.format(
					" where item_titulo like '%%%s%%'", nome) : "");
			PreparedStatement st = connection.prepareStatement(sql);
			ResultSet rs = st.executeQuery();

			while (rs.next()) {
				itens.add(buildItemFromResultSet(rs));
			}
			rs.close();
			st.close();

			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return itens;
	}

	@Override
	public Item find(int idItem) {
		Item ite = null;
		try {
			Connection connection = factory.createConnection();

			String sql = CONSULTA.concat(" where id = ?");
			PreparedStatement st = connection.prepareStatement(sql);
			st.setInt(1, idItem);
			ResultSet rs = st.executeQuery();

			if (rs.next()) {
				ite = buildItemFromResultSet(rs);
			}
			rs.close();
			st.close();

			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ite;
	}

	private Item buildItemFromResultSet(ResultSet rs) throws SQLException {
		Item ite = new Item();

		ite.setItem_id(rs.getInt(1));
		ite.setItem_titulo(rs.getString("titulo"));		
		ite.setItem_preco(rs.getDouble("preco"));		
		ite.setItem_descricao(rs.getString("descricao"));

		
		return ite;
	}

	@Override
	public void excluir(Item item) {
		try {
			Connection connection = factory.createConnection();
			PreparedStatement st = connection.prepareStatement(EXCLUIR);
			st.setInt(1, item.getItem_id());
			st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void editar(Item item) {
		try {
			Connection connection = factory.createConnection();
			PreparedStatement st = connection.prepareStatement(EDITAR);
			
			st.setString(1, item.getItem_titulo());
			st.setDouble(6, item.getItem_preco());
			st.setString(7, item.getItem_descricao());
			st.setInt(9, item.getItem_id());
			st.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
