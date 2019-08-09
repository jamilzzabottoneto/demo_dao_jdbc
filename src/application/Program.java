package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.DAO.DAOFactory;
import model.DAO.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		SellerDAO sellerDao = DAOFactory.createSellerDAO();
		
		System.out.println("=== TESTE 01: Seller Find By Id ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== TESTE 02: Seller Find By Department ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		/*System.out.println("\n=== TESTE 03: Seller Find ALL ===");		
		list = sellerDao.findAll();
		for(Seller obj : list) {
			System.out.println(obj);
		}*/
		
		System.out.println("\n=== TESTE 04: Seller Insert ===");	
		Seller newseller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.00, department);
		sellerDao.insert(newseller);
		System.out.println("Inserted! New id = " + newseller.getId());
		
		System.out.println("\n=== TESTE 05: Seller UPDATE ===");	
		seller = sellerDao.findById(1);
		seller.setName("Marta Waine");
		sellerDao.update(seller);
		System.out.println("UPDATED COMPLETE");
		
		System.out.println("\n=== TESTE 06: Seller DELETE ===");	
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("DELETE COMPLETE");
		
		sc.close();
	}

}
