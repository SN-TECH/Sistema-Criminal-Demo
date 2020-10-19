package dao;

import java.sql.SQLException;
import java.util.List;

import model.Arma;

public interface ArmaDaoIn {
	//Inserir no banco
		void Insert (Arma objeto) throws SQLException;
		
		//Listar 
		List<Arma> ReadAll() throws SQLException;
		
		// Delete
		void Delete (Arma objeto) throws SQLException;
		
		//Update
		void Update (Arma objeto) throws SQLException;
		
		//Select
		void Select (Arma objeto) throws SQLException;
}
