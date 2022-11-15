package s21_AcessoJDBC.Transacao;

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
		Statement st = null;
		try {
			conn = BDados.getConnection();
	
			conn.setAutoCommit(false);
			/*true : para cada operacao isolada que vc fizer ela vai ser confirmada automaticamente 
			 * false: cada operação nao esta confirmada, so quando confirmar e que será fechada a transacao*/

			st = conn.createStatement();
			
			int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");//linhas afetadas

			//int x = 1;
			//if (x < 2) {
			//	throw new SQLException("Fake error");
			//}
			
			int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");
			
			conn.commit();//confirmacao para executar o comando sql
			/*confirma a transacao*/
			
			
			System.out.println("rows1 = " + rows1);
			System.out.println("rows2 = " + rows2);
		}
		catch (SQLException e) {
			try {
				conn.rollback();//volta ao estado inicial do banco
				/*desfazer o que já foi feito ate o momento. se ocorrer uma falha no meio da transacao 
				 * vc pode chamar o comando rollback para desfazer o que foi feito ate entao*/
				throw new DbException("Transaction rolled back! Caused by: " + e.getMessage());
			} 
			catch (SQLException e1) {
				throw new DbException("Error trying to rollback! Caused by: " + e1.getMessage());
			}
		} 
		finally {
			BDados.closeStatement(st);
			BDados.closeConnection();
		}
	}
}
