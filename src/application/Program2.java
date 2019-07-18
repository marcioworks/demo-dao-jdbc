package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=======TEST 1: Department Insert ");
		Department dep = new Department(null,"Music");
		depDao.insert(dep);
		System.out.println("Insert completed id = "+ dep.getId());
	}

}
