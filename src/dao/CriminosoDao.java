package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Criminoso;

public class CriminosoDao implements CriminosoDaoIn {
	private Connection conn;
	
	public CriminosoDao(Connection conn) {
		this.conn = conn;
	}
	
	@Override
	public void Insert(Criminoso objeto) throws SQLException {
		// TODO Auto-generated method stub
		String SQL = "INSERT INTO criminoso (nome, apelido, cpf, rg) VALUES (?, ?, ?, ?)";		
		PreparedStatement  ps = this.conn.prepareStatement(SQL);
		
		ps.setString(1, objeto.getNome());	
		ps.setString(2, objeto.getApelido());
		ps.setString(3, objeto.getCpf());
		ps.setString(4, objeto.getRg());
		
			
		ps.execute();
	}

	@Override
	public List<Criminoso> ReadAll() throws SQLException {
		// TODO Auto-generated method stub
		List<Criminoso> listarCriminoso = new ArrayList<Criminoso>();
		
		String SQL = "SELECT id, nome, cpf, rg FROM criminoso";
		PreparedStatement ps = this.conn.prepareStatement(SQL);
		
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			int id = rs.getInt(0);
			String nome = rs.getString(1);
			String apelido = rs.getString(2);
			String cpf = rs.getString(3);
			String rg = rs.getString(4);
			
			listarCriminoso.add((Criminoso) rs);
		}
		
		return listarCriminoso;
	}

	@Override
	public void Delete(Criminoso objeto) throws SQLException {
		// TODO Auto-generated method stub
		String SQL = "DELETE FROM criminoso WHERE id = ?";
		
		PreparedStatement ps = this.conn.prepareStatement(SQL);
		
		ps.setInt(0, objeto.getId());
			
		ps.execute();
	}

	@Override
	public void Update(Criminoso objeto) throws SQLException {
		// TODO Auto-generated method stub
		String SQL = "UPDATE criminoso SET nome = ?, apelido = ? WHERE id = ?";
		
		PreparedStatement ps = this.conn.prepareStatement(SQL);
		
		ps.setInt(0, objeto.getId());
		ps.setString(1, objeto.getNome());
		ps.setString(2, objeto.getApelido());
		
		ps.execute();
	}

	@Override
	public void Select(Criminoso objeto) throws SQLException {
		// TODO Auto-generated method stub
		String SQL = "SELECT * FROM criminoso WHERE id = ?";
		PreparedStatement ps = this.conn.prepareStatement(SQL);		
		
		ps.setString(1, objeto.getNome());
		ps.setString(2, objeto.getApelido());
		ps.setString(3, objeto.getCpf());
		ps.setString(4, objeto.getRg());		
			
		ps.execute();		
	
	}

	

}
