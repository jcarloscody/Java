package s21_AcessoJDBC.ProjetoPadraoDAO_DataAccessObject.model.dao;

import java.util.List;

import s21_AcessoJDBC.ProjetoPadraoDAO_DataAccessObject.model.entities.Department;


 
public interface DepartmentDao {

	void insert(Department obj);
	void update(Department obj);
	void deleteById(Integer id);
	Department findById(Integer id);
	List<Department> findAll();
}
