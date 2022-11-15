package s21_AcessoJDBC.Delete;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import s21_AcessoJDBC.InserirDados.BDados;

public class App {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement preparedStatement = null;
		try {
			conn = BDados.getConnection();
	
			preparedStatement = conn.prepareStatement(
					"DELETE FROM department "
					+ "WHERE "
					+ "Id = ?");

			preparedStatement.setInt(1, 5);
			
			int rowsAffected = preparedStatement.executeUpdate();
			
			System.out.println("Done! Rows affected: " + rowsAffected);
		}
		catch (SQLException e) {
			throw new DbIntegrityException(e.getMessage());
		} 
		finally {
			BDados.closeStatement(preparedStatement);
			BDados.closeConnection();
		}
	}
}
