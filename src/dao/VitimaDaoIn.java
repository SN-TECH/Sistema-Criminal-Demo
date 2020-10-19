package dao;

import java.sql.SQLException;
import java.util.List;

import model.Vitima;

public interface VitimaDaoIn {
	
	//5 operações para manipulação dos dados
	
	//Inserir no banco
	void Insert (Vitima obejto) throws SQLException;
	
	//Listar 
	List<Vitima> ReadAll() throws SQLException;
	
	// Delete
	void Delete (Vitima obejto) throws SQLException;
	
	//Update
	void Update (Vitima objeto) throws SQLException;
	
	//Select
	void Select (Vitima objeto) throws SQLException;
}
