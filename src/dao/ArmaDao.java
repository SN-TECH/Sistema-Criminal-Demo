package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Arma;
import model.Criminoso;

public class ArmaDao implements ArmaDaoIn {
	
	private Connection conn;
	
	public ArmaDao(Connection conn) {
		this.conn = conn;
	}
	
	@Override
	public void Insert(Arma objeto) throws SQLException {
		// TODO Auto-generated method stub
		
		Criminoso c_objeto = new Criminoso();
		String SQL = "INSERT INTO Arma (id_criminoso, calibre, tipo, modelo, fabricante) VALUES (?, ?, ?, ?, ?, ?)";		
		PreparedStatement  ps = this.conn.prepareStatement(SQL);
		
		ps.setInt(0, objeto.getId());
		ps.setInt(1, c_objeto.getId());
		ps.setInt(2, objeto.getCalibre());
		ps.setString(3, objeto.getTipo());
		ps.setString(4, objeto.getModelo());
		ps.setString(4, objeto.getFabricante());
		
			
		ps.execute();
	}

	@Override
	public List<Arma> ReadAll() throws SQLException {
		// TODO Auto-generated method stub
		List<Arma> listarArmas = new ArrayList<Arma>();
		
		String SQL = "SELECT id, calibre, tipo, FROM arma";
		PreparedStatement ps = this.conn.prepareStatement(SQL);
		
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			int id = rs.getInt(0);
			int calibre = rs.getInt(1);
			String tipo = rs.getString(2);
			
			listarArmas.add((Arma) rs);
		}
		
		return listarArmas;
	}

	@Override
	public void Delete(Arma objeto) throws SQLException {
		// TODO Auto-generated method stub
		String SQL = "DELETE FROM arma WHERE id = ?";		
		PreparedStatement ps = this.conn.prepareStatement(SQL);
		
		ps.setInt(0, objeto.getId());
			
		ps.execute();
	}

	@Override
	public void Update(Arma objeto) throws SQLException {
		// TODO Auto-generated method stub
		String SQL = "UPDATE arma SET calibre = ?, tipo = ? WHERE id = ?";		
		PreparedStatement ps = this.conn.prepareStatement(SQL);
		
		ps.setInt(0, objeto.getId());
		ps.setInt(1, objeto.getCalibre());
		ps.setString(2, objeto.getTipo());
		
		ps.execute();
	}

	@Override
	public void Select(Arma objeto) throws SQLException {
		// TODO Auto-generated method stub
		Criminoso c_objeto = new Criminoso();
		String SQL = "SELECT * FROM arma WHERE id = ?";		
		PreparedStatement ps = this.conn.prepareStatement(SQL);
		
		ps.setInt(0, objeto.getId());
		ps.setInt(1, c_objeto.getId());
		ps.setInt(2, objeto.getCalibre());
		ps.setString(3, objeto.getTipo());
		ps.setString(4, objeto.getModelo());
		ps.setString(4, objeto.getFabricante());
		
			
		ps.execute();
	}

}
