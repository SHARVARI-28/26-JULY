import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeDBTest {

	
	public static void main(String[] args) {
		EmployeeDB e = new EmployeeDB();
		
		Employee1 e1 = new Employee1(123,"Jayant","jay@gmail.com","Male",50000);
		Employee1 e2 = new Employee1(234,"Sarvesh","sarvesh@gmail.com","Male",39000);
		Employee1 e3 = new Employee1(345,"Nikhil","niky@gmail.com","Male",44000);
		Employee1 e4 = new Employee1(456,"Vishal","vish@gmail.com","Male",65000);
		Employee1 e5 = new Employee1(567,"Shivam","shiva@gmail.com","Male",45000);
		
		e.addEmployee(e1);
		e.addEmployee(e2);
		e.addEmployee(e3);
		e.addEmployee(e4);
		e.addEmployee(e5);
		
		System.out.println("Printing Employee");
		e.listAll();
		
		
		e.deleteEmployee(234);
		System.out.println("After deleting one employee");
		e.listAll();
		
		System.out.println(e.showPaySlip(456));
	}

}