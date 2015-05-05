package br.com.farmacia.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.farmacia.dao.util.ConnectionFactory;
import br.com.farmacia.model.Medicamento;

import com.mysql.jdbc.Connection;

public class MedicamentoDao {
	private final String INSERT = "insert into medicamento values(null,?,?,?)";
	private final String CONSULTA = "select * from medicamento";
	private final String EXCLUIR = "DELETE FROM medicamento WHERE id = ?";
	private final String EDITAR = "UPDATE medicamento SET nome = ?, laboratorio = ?, registro = ? WHERE id = ?";
	private ConnectionFactory factory;

	public MedicamentoDao() {
		factory = new ConnectionFactory();
	}

	public void salvar(Medicamento medicamento) {
		Connection connection = null;
		try {
			connection = factory.createConnection();

			PreparedStatement st = connection.prepareStatement(INSERT);
			st.setString(1, medicamento.getNome());
			st.setString(2, medicamento.getLaboratorio());
			st.setInt(3, medicamento.getRegistro());
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

	public List<Medicamento> pesquisar(String nome) {
		List<Medicamento> medicamentos = new ArrayList<Medicamento>();
		try {
			Connection connection = factory.createConnection();

			String sql = CONSULTA.concat((nome != null && !nome.isEmpty()) ? String.format(
					" where nome like '%%%s%%'", nome) : "");
			PreparedStatement st = connection.prepareStatement(sql);
			ResultSet rs = st.executeQuery();

			while (rs.next()) {
				medicamentos.add(buildMedicamentoFromResultSet(rs));
			}
			rs.close();
			st.close();

			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return medicamentos;
	}

	public Medicamento find(int idMedicamento) {
		Medicamento med = null;
		try {
			Connection connection = factory.createConnection();

			String sql = CONSULTA.concat(" where id = ?");
			PreparedStatement st = connection.prepareStatement(sql);
			st.setInt(1, idMedicamento);
			ResultSet rs = st.executeQuery();

			if (rs.next()) {
				med = buildMedicamentoFromResultSet(rs);
			}
			rs.close();
			st.close();

			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return med;
	}

	private Medicamento buildMedicamentoFromResultSet(ResultSet rs)
			throws SQLException {
		Medicamento med = new Medicamento();

		med.setId(rs.getInt(1));
		med.setNome(rs.getString("nome"));
		med.setLaboratorio(rs.getString("laboratorio"));
		med.setRegistro(rs.getInt("registro"));

		return med;
	}

	public void excluir(Medicamento medicamento) {
		try {
			Connection connection = factory.createConnection();
			PreparedStatement st = connection.prepareStatement(EXCLUIR);
			st.setInt(1, medicamento.getId());
			st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void editar(Medicamento medicamento) {
		try {
			Connection connection = factory.createConnection();
			PreparedStatement st = connection.prepareStatement(EDITAR);
			st.setString(1, medicamento.getNome());
			st.setString(2, medicamento.getLaboratorio());
			st.setInt(3, medicamento.getRegistro());
			st.setInt(4, medicamento.getId());
			st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
