package com.example.testdb.demodb.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.testdb.demodb.model.User;

public class UserDAO {

	private static final UserDAO INSTANCE = new UserDAO();
	
	private static final String SELECT_ALL = "select * from db.userdb;";
	
	private static final String INSERT = "insert into db.userdb(nome, cognome) values ( ?, ?);";

	private UserDAO() {
	}

	public static UserDAO getInstance() {
		return INSTANCE;
	}
	
	public boolean insert(String nome, String cognome) {
		boolean flag = true;
		try (final Connection conn = DBManager.createConnection();
				final PreparedStatement statement = conn.prepareStatement(INSERT);) {
			
			statement.setString(1, nome);
			statement.setString(2, cognome);
			statement.execute();
			
		}catch(SQLException s) {
			s.printStackTrace();
			flag = false;
		}
		return flag;
	}

	public List<User> get() {
		final List<User> utenti = new ArrayList<>();
		try (final Connection conn = DBManager.createConnection();
				final PreparedStatement statement = conn.prepareStatement(SELECT_ALL);) {

			statement.execute();
			ResultSet result = statement.getResultSet();
			
			while (result.next()) {
				final User user = new User();
				user.setId(result.getLong("id"));
				user.setNome(result.getString("nome"));
				user.setCognome(result.getString("cognome"));
				
				utenti.add(user);
				
			}
		} catch (SQLException s) {
			s.printStackTrace();
		}
		
		return utenti;
	}

}
