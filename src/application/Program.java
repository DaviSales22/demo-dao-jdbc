package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;
import model.entities.department;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST: findById ===");
		System.out.println(sellerDao.findById(3)); 
		
		System.out.println("\n=== TEST: findByDepartment ===");
		department department = new department(2,null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj : list ) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST: findAll ===");
		list = sellerDao.findAll();
		for(Seller obj : list ) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST: seller insert ===");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("New Id " + newSeller.getId());
		
		
	}
	
	

}
