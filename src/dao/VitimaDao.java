package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Vitima;

public class VitimaDao implements VitimaDaoIn {
	
	private Connection conn;
	
	public VitimaDao(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void Insert(Vitima objeto) throws SQLException {
		// TODO Auto-generated method stub
		String _sql = "INSERT INTO vitima (nome, telefone, cpf, rg, endereco) VALUES (?, ?, ?, ?, ?)";		
		PreparedStatement  ps = this.conn.prepareStatement(_sql);
		
		ps.setString(1, objeto.getNome());
		ps.setString(2, objeto.getTelefone());
		ps.setString(3, objeto.getCpf());
		ps.setString(4, objeto.getRg());
		ps.setString(5, objeto.getEndereco());
			
		ps.execute();
		
	}

	@Override
	public List<Vitima> ReadAll() throws SQLException {
		// TODO Auto-generated method stub
		List<Vitima> listarVitima = new ArrayList<Vitima>();
		
		String SQL = "SELECT id, nome, cpf, rg FROM vitima";
		PreparedStatement ps = this.conn.prepareStatement(SQL);
		
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			int id = rs.getInt(0);
			String nome = rs.getString(2);
			String cpf = rs.getString(3);
			String rg = rs.getString(4);
			
			listarVitima.add((Vitima) rs);
		}
		
		return listarVitima;
	}

	@Override
	public void Delete(Vitima objeto) throws SQLException {
		// TODO Auto-generated method stub
		String SQL = "DELETE FROM pessoa WHERE id = ?";
		
		PreparedStatement ps = this.conn.prepareStatement(SQL);
		
		ps.setInt(0, objeto.getId());
			
		ps.execute();
		
	}

	@Override
	public void Update(Vitima objeto) throws SQLException {
		// TODO Auto-generated method stub

		String SQL = "UPDATE pessoa SET nome = ? WHERE id = ?";
		
		PreparedStatement ps = this.conn.prepareStatement(SQL);
		
		ps.setString(1, objeto.getNome());
		ps.setInt(2, objeto.getId());
		ps.setString(5, objeto.getEndereco());
		
		ps.execute();
	}

	@Override
	public void Select(Vitima objeto) throws SQLException {
		// TODO Auto-generated method stub
		String SQL = "SELECT * FROM vitima WHERE id = ?";
		PreparedStatement ps = this.conn.prepareStatement(SQL);
		
		ps.setString(1, objeto.getNome());
		ps.setString(2, objeto.getTelefone());
		ps.setString(3, objeto.getCpf());
		ps.setString(4, objeto.getRg());
		ps.setString(5, objeto.getEndereco());
			
		ps.execute();
		
	}
}
