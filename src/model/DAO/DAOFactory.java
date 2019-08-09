package model.DAO;

import database.DB;
import model.DAO.impl.SellerDaoJDBC;

public class DAOFactory {
	
	public static SellerDAO createSellerDAO() {
		return new SellerDaoJDBC(DB.getConnection());
	}

}
