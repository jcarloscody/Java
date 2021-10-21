package s21_AcessoJDBC.RecuperarDados;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import s21_AcessoJDBC.RecuperarDados.BDados;

public class App {
	public static void main(String[] args) {

		Connection conn = null; //preparar um banco
		Statement statement = null;//preparar um consulta sql
		ResultSet resultSet = null;//guardar o resultado
		
		try {
			conn = BDados.getConnection(); //CONECTAR AO BD
	
			statement = conn.createStatement();//instanciando o statement por meio da instanstancia do conn
			
			resultSet = statement.executeQuery("select * from department");//fazendo a consulta e guardando no resultSet
			
			while (resultSet.next()) {//enquanto tiver linha de dados
				System.out.println(resultSet.getInt("Id") + ", " + resultSet.getString("Name"));
				//pega uma coluna de tipo int com nome id e outro string com nome Name
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			BDados.closeResultSet(resultSet);//fechando 
			BDados.closeStatement(statement);//fechando
			BDados.closeConnection();
		}
	}
}
