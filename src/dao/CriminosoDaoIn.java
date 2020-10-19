package dao;

import java.sql.SQLException;
import java.util.List;

import model.Criminoso;

public interface CriminosoDaoIn {
	
	//5 operações para manipulação dos dados
	
	//Inserir no banco
	void Insert (Criminoso objeto) throws SQLException;
	
	//Listar 
	List<Criminoso> ReadAll() throws SQLException;
	
	// Delete
	void Delete (Criminoso objeto) throws SQLException;
	
	//Update
	void Update (Criminoso objeto) throws SQLException;
	
	//Select
	void Select (Criminoso objeto) throws SQLException;
}
