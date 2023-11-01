package model.dao;

import java.util.List;

import model.entities.Seller;
import model.entities.department;

public interface SellerDao {
	void insert(Seller obj);
	void updade(Seller obj);
	void deleteById(Integer id);
	Seller findById(Integer id);
	List<Seller> findAll();
	List<Seller> findByDepartment(department department);
}
