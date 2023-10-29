package model.dao;

import java.util.List;

import model.entities.department;

public interface DepartmentDao {
	void insert(department obj);
	void updade(department obj);
	void deleteById(Integer id);
	department findById(Integer id);
	List<department> findAll();
}
