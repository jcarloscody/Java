package s21_AcessoJDBC.InserirDados;

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
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Connection conn = null;
		PreparedStatement statement = null;
		
		try {
			conn = BDados.getConnection();//CONECTANDO

			// EXAMPLE 1:
			statement = conn.prepareStatement(//vai receber o comando SQL e ficar preparado para executar
					"INSERT INTO seller "
					+ "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
					+ "VALUES "
					+ "(?, ?, ?, ?, ?)", //5 posicoes
					Statement.RETURN_GENERATED_KEYS);//SOBRECARGA RECEBE OUTRO PARAMETRO

			statement.setString(1, "Carl Purple");//tipo string, posicao 1
			statement.setString(2, "carl@gmail.com");
			statement.setDate(3, new java.sql.Date(simpleDateFormat.parse("22/04/1985").getTime()));
			//quando formos instanciar uma data no jdbc para jogar no statement, teremos q usar este pacote sql.Date
			statement.setDouble(4, 3000.0);
			statement.setInt(5, 4);

			// EXAMPLE 2:
			//statement = conn.prepareStatement(
			//		"insert into department (Name) values ('D1'),('D2')", 
			//		Statement.RETURN_GENERATED_KEYS);

			int rowsAffected = statement.executeUpdate();//executa sql e retorna um numero inteiro indicando quantas linhas foram alteradas
			
			if (rowsAffected > 0) {//SE TEVE LINHA ALTERADA
				ResultSet rs = statement.getGeneratedKeys();//VAI pegar os codigos das linhas alteradas
				while (rs.next()) {
					int id = rs.getInt(1);//valor da primeira coluna
					System.out.println("Done! Id: " + id);
				}
			}
			else {
				System.out.println("No rows affected!");
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		} 
		catch (ParseException e) {
			e.printStackTrace();
		}
		finally {
			BDados.closeStatement(statement);
			BDados.closeConnection();
		}
	}
}
