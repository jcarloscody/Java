package s21_AcessoJDBC.ProjetoPadraoDAO_DataAccessObject.bank;

public class DbException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public DbException(String msg) {
		super(msg);
	}
}
