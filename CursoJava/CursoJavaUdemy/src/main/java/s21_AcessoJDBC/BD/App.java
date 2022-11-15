package s21_AcessoJDBC.BD;

import java.sql.Connection;
import s21_AcessoJDBC.BD.BDados;

public class App {
	public static void main(String[] args) {

		Connection conn = BDados.getConnection();
		BDados.closeConnection();
	}
}
