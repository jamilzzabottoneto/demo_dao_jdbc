package application;

import model.DAO.DAOFactory;
import model.DAO.SellerDAO;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDAO sellerDao = DAOFactory.createSellerDAO();
		
		System.out.println("=== TESTE 01: Seller Find By Id ===");
		Seller seller = sellerDao.findById(3);

		System.out.println(seller);

	}

}
