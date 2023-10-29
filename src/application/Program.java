package application;

import java.util.Date;

import model.entities.department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		department obj = new department(1, "Books");
		
		Seller seller = new Seller(21, "Bob", "bob@email.com", new Date(), 3000.0, obj);
		System.out.println(seller);

	}

}
