package s21_AcessoJDBC.ProjetoPadraoDAO_DataAccessObject.bank;

public class DbIntegrityException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public DbIntegrityException(String msg) {
		super(msg);
	}
}
