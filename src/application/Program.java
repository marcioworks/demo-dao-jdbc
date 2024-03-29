package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1 : Seller FindById===");
		Seller seller = sellerDao.FindById(1);
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2 : Seller FindByDepartment===");
		Department department = new Department(2,null);
		List<Seller> list = sellerDao.findByDepartment(department);
		 for(Seller obj : list) {
			 System.out.println(obj);
		 }
		
		 System.out.println("\n=== TEST 3 : Seller FindALL===");
		 		list = sellerDao.findAll();
		 	for(Seller obj: list) {
		 		System.out.println(obj);
		 	}
		 	
		 	
		 	 System.out.println("\n=== TEST 4 : Seller insert===");
		 	 
		 	 Seller newSeller = new Seller(null,"Greg","greg@gmail.com",new Date(),3200.00,department);
		 	 sellerDao.insert(newSeller);
		 	 System.out.println("Inserted! new Id = "+ newSeller.getId());
		 	 
		 	
		 	 System.out.println("\n=== TEST 5 : Seller update===");
		 	 newSeller = sellerDao.FindById(1);
		 	 newSeller.setName("Marcio");
		 	 sellerDao.update(newSeller);
		 	 System.out.println("Update completed");
		 	 
		 	System.out.println("\n=== TEST 6 : Seller delete by id===");
		 	 sellerDao.deleteById(9);
		 	 System.out.println("Delete completed!");
	}

}
