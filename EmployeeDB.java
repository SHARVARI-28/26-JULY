import java.util.ArrayList;
import java.util.Iterator;


public class EmployeeDB {

	ArrayList<Employee1> list = new ArrayList<>();
	
	//Add Employee
	boolean addEmployee(Employee1 e) {
		
		return list.add(e);
	}
	
	
	//Delete Employee
	boolean deleteEmployee(int empId) {
		boolean re = false;
		
		Iterator<Employee1> it = list.iterator();
		
		while(it.hasNext()) {
			Employee1 emp = it.next();
			
			if(emp.getEmpId() == empId) {
				re = true;
				it.remove();
			}
		}
		return re;
	}
	
	
	//Payment purpose
	String showPaySlip(int empId) {
		String pay = "Invalid employee id";
		
		for(Employee1 emp : list) {
			if(emp.getEmpId() == empId) {
				pay = "Payslip of empId : "+empId+" is :"+emp.getSalary();
			}
		}
		
		return pay;
	}
	
	
	public void listAll() {
		Iterator<Employee1> ee = list.iterator();
		
		while(ee.hasNext()) {
			System.out.println(ee.next());
		}
	}
	
}