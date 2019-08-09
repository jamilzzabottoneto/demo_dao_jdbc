package model.DAO;

import database.DB;
import model.DAO.impl.DepartmentDaoJDBC;
import model.DAO.impl.SellerDaoJDBC;

public class DAOFactory {
	
	public static SellerDAO createSellerDAO() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	public static DepartmentDAO createDepartmentDAO() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}

}
