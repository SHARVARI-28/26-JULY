public class Employee1 {

	private int empId;
	private String empName;
	private String email;
	private String gender;
	private float salary;
	
	//Constructor
	public Employee1(int empId, String empName, String email, String gender, float salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.email = email;
		this.gender = gender;
		this.salary = salary;
	}
	
	
	//method to print details
	void GetEmployeeDetails() {
		System.out.println("Employee id : "+empId+"\nEmployee name : "+empName+"\nEmail : "+email+"\nGender : "+gender+"\nSalary : "+salary);
	}


	//Getters and setter
	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public float getSalary() {
		return salary;
	}


	public void setSalary(float salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee1 [empId=" + empId + ", empName=" + empName + ", email=" + email + ", gender=" + gender
				+ ", salary=" + salary + "]";
	}
	


	
	
}