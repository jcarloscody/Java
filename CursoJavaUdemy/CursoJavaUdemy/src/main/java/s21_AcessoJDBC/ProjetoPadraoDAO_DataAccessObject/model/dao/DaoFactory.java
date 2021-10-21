package s21_AcessoJDBC.ProjetoPadraoDAO_DataAccessObject.model.dao;



import s21_AcessoJDBC.AtualizarDados.BDados;
import s21_AcessoJDBC.ProjetoPadraoDAO_DataAccessObject.model.dao.impl.DepartmentDaoJDBC;
import s21_AcessoJDBC.ProjetoPadraoDAO_DataAccessObject.model.dao.impl.SellerDaoJDBC;


public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(BDados.getConnection());
	}
	
	public static DepartmentDao createDepartmentDao() {
		return new DepartmentDaoJDBC(BDados.getConnection());
	}
}
