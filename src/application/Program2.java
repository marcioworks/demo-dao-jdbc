package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		
		/*System.out.println("=======TEST 1: Department Insert ");
		Department dep = new Department(null,"Books");
		depDao.insert(dep);
		System.out.println("Insert completed id = "+ dep.getId());
	
		System.out.println("=======TEST 2: Department find By ID ");
		Department dep2 = depDao.FindById(10);
		System.out.println(dep2);
		
		System.out.println("=======TEST 3: Department Update ");
		dep2 = depDao.FindById(3);
		dep2.setName("Food");
		depDao.update(dep2);
		System.out.println("update complete!");
			*/
		
		/*System.out.println("=======TEST 4: Department DELETE ");
		depDao.deleteById(12);
		System.out.println("DELETE completed");
		*/
		System.out.println("=======TEST 4: Department FindAll ");
		List<Department> list = new ArrayList<>();
		list = depDao.findAll();
		for(Department dep:list) {
			System.out.println(dep);
		}
	}

}
