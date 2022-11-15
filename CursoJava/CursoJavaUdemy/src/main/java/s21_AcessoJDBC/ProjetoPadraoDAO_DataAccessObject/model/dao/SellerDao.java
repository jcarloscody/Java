package s21_AcessoJDBC.ProjetoPadraoDAO_DataAccessObject.model.dao;

import java.util.List;

import s21_AcessoJDBC.ProjetoPadraoDAO_DataAccessObject.model.entities.Department;
import s21_AcessoJDBC.ProjetoPadraoDAO_DataAccessObject.model.entities.Seller;


public interface SellerDao {

	void insert(Seller obj);
	void update(Seller obj);
	void deleteById(Integer id);
	Seller findById(Integer id);
	List<Seller> findAll();
	List<Seller> findByDepartment(Department department);
}
