package s21_AcessoJDBC.AtualizarDados;

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
			conn = BDados.getConnection();//banco conectado
	
			preparedStatement = conn.prepareStatement(
					"UPDATE seller "
					+ "SET BaseSalary = BaseSalary + ?  "  //posicao 1
					+ "WHERE "
					+ "(DepartmentId = ?)"); //posicao 2

			preparedStatement.setDouble(1, 200.0);
			preparedStatement.setInt(2, 2);
			
			int rowsAffected = preparedStatement.executeUpdate();
			
			System.out.println("Done! Rows affected: " + rowsAffected);
		}
		catch (SQLException e) {
			e.printStackTrace();
		} 
		finally {
			BDados.closeStatement(preparedStatement);
			BDados.closeConnection();
		}
	}
}
