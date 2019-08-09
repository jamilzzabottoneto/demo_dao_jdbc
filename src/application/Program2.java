package application;

import java.util.List;
import java.util.Scanner;

import model.DAO.DAOFactory;
import model.DAO.DepartmentDAO;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DepartmentDAO departmentDao = DAOFactory.createDepartmentDAO();

		/*System.out.println("***** TESTE 01 - INSERT *****");
		Department newdepartment = new Department(null, "Developer");
		departmentDao.insert(newdepartment);
		System.out.println("Inserted! New id: " + newdepartment.getId());*/
		
		/*System.out.println("***** TESTE 02 - Find By ID *****");
		Department department = departmentDao.findById(7);
		System.out.println(department);*/
		
		/*System.out.println("***** TESTE 03 - Find ALL *****");
		List<Department> list = departmentDao.findAll();
		for(Department dep : list) {
			System.out.println(dep);
		}*/
		
		/*System.out.println("***** TESTE 04 - Department UPDATE *****");
		Department department = new Department();
		department = departmentDao.findById(1);
		department.setName("Scientist");
		departmentDao.update(department);
		System.out.println("UPDATED COMPLETE");*/
		
		System.out.println("***** TESTE 05 - Department DELETE *****");
		System.out.println("Enter ID for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("DELETE COMPLETE");
		
		sc.close();
	}

}
